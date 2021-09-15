import React from 'react';
import { NavLink } from 'react-router-dom';
import Modal from './Modal';
export default class TeacherList extends React.Component {
    constructor() {
        super();
        this.state = {
            teachers:[],
            viewTeachers:[],
            pageIndex:1,
            total:0,
            count:4,
            query:''
        }
    }
    componentDidMount() {
        this.loadByPage(1);

    }
    render() {

        return (
            <div className="body teacher-list">
            <Modal ref="modal"/>
                <ol className="breadcrumb">
                    <li><a href="javascript:;">讲师管理</a></li>
                    <li className="active">讲师列表</li>
                </ol>
                <div className="page-title">
                    <NavLink to="/home/add" className="btn btn-success btn-sm pull-right">添加讲师</NavLink>
                </div>
                <div className="panel panel-default">
                    <div className="panel-body">
                        <form action="" className="form-inline">
                            <div className="input-group">
                                <input type="text" className="form-control input-sm" onChange={ e=> this.filterData(e.target.value)} />
                                <span className="input-group-btn">
                                    <button className="btn btn-success btn-sm" onClick={e=>this.searchByQuery()}>搜索</button>
                                </span>
                            </div>
                        </form>
                    </div>
                    <table className="table table-striped table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>编号</th>
                                <th>姓名</th>
                                <th>昵称</th>
                                <th>年龄</th>
                                <th>性别</th>
                                <th>手机号码</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody id="list">
                           {/*使用map返回数组*/}

                        { this._filterRender() }

                          
                        </tbody>
                    </table>
                    <button  className="btn btn-primary" onClick={e=>this.loadByPage(this.state.pageIndex -1)}>上一页</button>
                    <button className="btn btn-primary" onClick={e=>this.loadByPage(this.state.pageIndex + 1)}>下一页</button>

                </div>
      </div>
        )
    }
    searchByQuery() {
        let query = this.state.query;
        $axios.get('teachers/search',{params:{query} })
        .then(res=>{

            this.setState({
                teachers:res.data.teachers,
                total:res.data.total,
                pageIndex:1,
            })
        })
        .catch(err=>{
            console.log(err);
        })
    }
    loadByPage(page){

       let totalPages = Math.ceil(this.state.total / this.state.count);
       if( page != 1 && (page > totalPages || page == 0) ) return;

       $axios.get('teachers',{params:{page:page,count:this.state.count} })
        .then(res =>{
            if(res.data.errcode == 10001) return alert(res.data.errmsg);
            this.setState({
                teachers:res.data.teachers,
                total:res.data.total,
                pageIndex:page,

            });
        })
        .catch(err=>{
            console.log('出异常了');
            console.log(err);
        })

    }

    getBirthNum(date){
        return new Date().getFullYear() - new Date(date).getFullYear();
    }
    getGender(gender){
        return gender == '1'? '男':'女'
    }
    _filterRender() {
        let query = this.state.query;
        let newTeachers = this.state.teachers.filter( ele => {
            return ele.username.includes(query);
        } );
        
        return newTeachers.map((ele,index) => {
                return (
                     <tr key={ele._id}>
                      <td>{index+1}</td>
                      <td>{ele.username}</td>
                      <td>{ele.nickname}</td>
                      <td>{this.getBirthNum(ele.joinDate)}</td>
                      <td>{this.getGender(ele.gender)}</td>
                      <td>{ele.phone}</td>
                      <td>
                          <a onClick={e=>this.showDetail(ele._id)} className="btn btn-info btn-xs">查 看</a>
                          <NavLink className="btn btn-info btn-xs" to={`/home/edit/${ele._id}`}>编 辑</NavLink>
                          <a href="javascript:;" className="btn btn-warning btn-xs" onClick={e=>this.changeStatus(ele)}>
                           {ele.status?'启用':'禁用'}
                          </a>
                      </td>
                  </tr>
                )
        });
    }
    changeStatus(t) {
        $axios.post('teachers/handler',{
            _id:t._id,
            status:t.status - 0
        })
        .then(res=>{
            t.status = res.status;
            this.setState({});
        })
    }
    showDetail(_id) {
        this.refs.modal.showModal(_id);
    }

    //过滤数据
    filterData(name) {
        this.setState({
            query:name
        });
    }
}