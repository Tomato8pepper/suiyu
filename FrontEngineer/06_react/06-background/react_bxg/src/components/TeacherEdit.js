import React from 'react';

export default class TeacherEdit extends React.Component {
    constructor() {
        super();
        this.state = {
            teacher:{
                username:'',
                type:'',
                joinDate:'',
                gender:''
            }
        }
    }
    componentDidMount() {
       const _id =  this.props.match.params.id
       $axios.get(`teachers/${_id}`)
       .then(res=>{
            this.setState({
                teacher:res.data.teacher
            });
       })
    }
    changeVal(e,propName) {
        this.state.teacher[propName] = e.target.value;
        this.setState({});
    }
    save() {
        $axios.post('teachers/edit' , this.state.teacher)
        .then( ({data}) => {
          alert('更新成功!')
        })
    }
    render() {
        const t = this.state.teacher;
        return (
            <div className="body teacher">
                <ol className="breadcrumb">
                    <li><a href="javascript:;">讲师管理</a></li>
                    <li className="active">讲师添加</li>
                </ol>
                <div className="teacher-add">
                    <form action="" className="form-horizontal col-xs-offset-2">
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">姓名</label>
                            <div className="col-xs-4">
                                <input
                                value={t.username}
                                onChange={e=> this.changeVal(e,'username')} 
                                type="text" className="form-control input-sm"  />
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">入职时间</label>
                            <div className="col-xs-4">
                                <input
                                onChange={e=> this.changeVal(e,'joinDate')}
                                value={t.joinDate}
                                type="text" className="form-control input-sm" />
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">类型</label>
                            <div className="col-xs-2">
                                <select onChange={e=> this.changeVal(e,'type')}
                                value={t.type}
                                name="" className="form-control input-sm">
                                    <option value="0">讲师</option>
                                    <option value="1">管理员</option>
                                </select>
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">性别</label>
                            <div className="col-xs-4">
                                <label className="radio-inline">
                                    <input onChange={e=> this.changeVal(e,'gender')}
                                    type="radio" name="gender" value="1" /> 男
                                </label>
                                <label className="radio-inline">
                                    <input onChange={e=> this.changeVal(e,'gender')}
                                    type="radio" name="gender" value="0"/> 女
                                </label>
                            </div>
                        </div>
                        <div className="form-group">
                            <div className="col-xs-7">
                                <a onClick={e=>this.save()}
                                className="btn btn-success btn-sm pull-right"> 保 存 </a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        )
    }
}