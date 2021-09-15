import React from 'react';
export default class TeacherAdd extends React.Component {
    constructor() {
        super();
        this.state = {
            user:{
                username:'',
                password:'',
                joinDate:'',
                type:'0',
                gender:'0',
            }
        }
    }
    doSubmit(){

        
        $axios.post('teachers/new',this.state.user)
        .then(res=>{
            console.log(res);
        })
        .catch(err=>{
            console.log(err);
        })
.then(res => {})
    }
    setValue(e,type){
        this.state.user[type] = e.target.value;
        this.setState();
    }
    render (){
        return (
            <div className="body teacher">
                <ol className="breadcrumb">
                    <li><a href="javascript:;">讲师管理</a></li>
                    <li className="active">讲师添加</li>
                </ol>
                <div className="teacher-add">
                    <form ref="myform" action="" className="form-horizontal col-xs-offset-2" >
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">姓名</label>
                            <div className="col-xs-4">
                                <input onChange={ e=> this.setValue(e,'username')}
                                type="text" className="form-control input-sm" placeholder="讲师名称" />
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">密码</label>
                            <div className="col-xs-4">
                                <input placeholder="密码"
                                onChange={ e=> this.setValue(e,'password')}
                                type="password" className="form-control input-sm" />
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">入职时间</label>
                            <div className="col-xs-4">
                                <input placeholder="入职时间"
                                onChange={ e=> this.setValue(e,'joinDate')}
                                type="text" className="form-control input-sm" />
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">类型</label>
                            <div className="col-xs-2">
                                <select onChange={ e=> this.setValue(e,'type')}
                                value={this.state.type}  className="form-control input-sm">
                                    <option value="0">讲师</option>
                                    <option value="1">管理员</option>
                                </select>
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="" className="col-xs-3 control-label">性别</label>
                            <div className="col-xs-4">
                                <label className="radio-inline">
                                    <input
                                    type="radio" value="0" onChange={ e=> this.setValue(e,'gender')} name="gender"/> 男
                                </label>
                                <label className="radio-inline">
                                    <input
                                    type="radio" value="1" onChange={ e=> this.setValue(e,'gender')} name="gender"/>  女
                                </label>
                            </div>
                        </div>
                        <div className="form-group">
                            <div className="col-xs-7">
                                <a className="btn btn-success btn-sm pull-right" onClick={e=>this.doSubmit()}> 添 加 </a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        )
    }
}