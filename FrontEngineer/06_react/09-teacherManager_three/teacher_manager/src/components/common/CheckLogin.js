import React, { Component } from 'react';
import {connect} from 'dva';
import { routerRedux } from 'dva/router';



export function checkLogin (TeacherList) {
    class Tmp extends Component {
            render() {
                // 判断用户是否登录
                // if (!this.props.isLogin) {
                //     alert(this.props.isLogin)
                //     this.props.dispatch(routerRedux.push('/signin'))
                // }             
                let isLogin = JSON.parse(window.sessionStorage.getItem('user')||'false');
                if (!isLogin) {
                    alert('没有登录');
                    window.location.href = '/signin';
                }
                
                return <TeacherList/>
            }
    }
    return connect(state=>{
            return {
                isLogin:state.teacher.isLogin
            }
        })(Tmp);
}

export default checkLogin;
