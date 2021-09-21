import React,{Component} from 'react';
import avatar from '../assets/imgs/monkey.png'; // 告诉webpack管理这个图片
import { connect } from 'dva';
import { makeAge } from '../utils'

class TeacherList extends Component {
    constructor(props){
        super(props);
        this.state = {
            page:1,
            count:5
        }

    }
    componentDidMount () {
       this.loadByPage(this.state.page);  // 1
    }
    loadByPage(num) {
        const { page,count } = this.state;
        this.props.dispatch({type:'teacher/updateTeacher',payload:{
            count,page:num
        }});
        this.state.page = num;
    }
    render() {
        let { teachers,total } = this.props;
        total = Math.ceil(total / this.state.count);
        const { page } = this.state;
        return (
            <React.Fragment>
                 <div className="body teacher-list">

                <ol className="breadcrumb">
                    <li><a href="javascript:;">讲师管理</a></li>
                    <li className="active">讲师列表</li>
                </ol>
                <div className="page-title">
                    <a className="btn btn-success btn-sm pull-right">添加讲师</a>
                </div>
                <div className="panel panel-default">
                    <div className="panel-body">
                        <form action="" className="form-inline">
                            <div className="input-group">
                                <input type="text" className="form-control input-sm" />
                                <span className="input-group-btn">
                                    <button className="btn btn-success btn-sm">搜索</button>
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
                        { teachers && teachers.map((t,i)=>{
                            return (
                                <tr key={i}>
                                  <td>{t.id}</td>
                                  <td>{t.username}</td>
                                  <td>{t.nickname}</td>
                                  <td>{makeAge(t.birthDay)}</td>
                                  <td>{t.gender == 1?'女':'男'}</td>
                                  <td>{t.phone}</td>
                                  <td>
                                      <a  className="btn btn-info btn-xs">查 看</a>
                                      <a className="btn btn-info btn-xs">编 辑</a>
                                      <a href="javascript::" className="btn btn-warning btn-xs">
                                       启用
                                      </a>
                                  </td>
                              </tr>                                    
                            );
                        })}
                      
                           
                        </tbody>
                    </table>
                    <button disabled={page === 1} className="btn btn-primary" onClick={e=>this.loadByPage(page-1)}>上一页</button>
                    <button disabled={page==total} className="btn btn-primary" onClick={e=>this.loadByPage(page+1)}>下一页</button>

                </div>
      </div>
            </React.Fragment>
        );
    }
}

export default connect(state=>{
    return {
       teachers:state.teacher.teachers,
       total:state.teacher.total,
    }
})(TeacherList);