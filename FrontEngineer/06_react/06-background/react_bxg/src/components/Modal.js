import React from 'react';

export default class Modal extends React.Component {
    render() {
        const t = this.state.user;
        return (
            <div className={this.state.isShow?'modal fade show-modal':'' } id="teacherModal">
        <div className="modal-dialog" style={{width:750} }>
            <div className="panel panel-default">
                <div className="panel-heading">
                    <button
                    onClick={e=> this.setState({isShow:true})}
                    type="button" className="close" data-dismiss="modal">&times;</button>
                    <h4 className="panel-title">讲师信息</h4>
                </div>
                <div className="panel-body">
                    <table className="table table-bordered table-condensed">
                        <tbody>
                            <tr>
                                <th>姓名:</th>
                                <td>{t.username}</td>
                                <th>职位:</th>
                                <td colSpan="3">{t.type == 1?'管理员':'讲师'}</td>
                                <td rowSpan="4" width="128">
                                    
                                </td>
                            </tr>
                            <tr>
                                <th>花名:</th>
                                <td>{t.nickname}</td>
                                <th>出生日期:</th>
                                <td colSpan="3">{t.birthDay}</td>
                            </tr>
                            <tr>
                                <th>性别{t.gender}:</th>
                                <td>{t.gender == '0'?'女':'男'}</td>
                                <th>入职日期:</th>
                                <td colSpan="3">{t.joinDate}</td>
                            </tr>
                            <tr>
                                <th>手机号码:</th>
                                <td colSpan="2">{t.phone}</td>
                                <th>邮箱:</th>
                                <td colSpan="2">{t.email}</td>
                            </tr>
                            <tr>
                                <th>籍贯:</th>
                                <td colSpan="6">河北省 保定市 曲阳县</td>
                            </tr>
                            <tr>
                                <td colSpan="7">
                                    <div className="introduce">
                                     {t.introduce}
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
        )
    }

    constructor() {
        super();
        this.state = {
            user:{},
            isShow:true
        }
    }
    showModal(_id) {
         $axios.get(`teachers/${_id}`)
         .then(res=>{
            this.state.user = res.data.teacher;
             this.setState({
            isShow:false
             })
         })




       

        //  $axios.get('teachers/' + _id)
        // .then(({data}) => {
        //   console.log(data)
        //   this.setState({user: data.teacher,isShow:true})
        // })
      }
}