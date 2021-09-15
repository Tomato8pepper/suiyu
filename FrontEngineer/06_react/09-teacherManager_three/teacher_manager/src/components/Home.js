import React,{Component} from 'react';

import { connect } from 'dva';
import {serverHost,port} from '../config';
import { homeSubRouters,MyRoute as Route } from '../routers';
import TeacherLoading from './common/TeacherLoading.js';
import CheckLogin from './common/CheckLogin.js';
// console.log(CheckLogin);



class Home extends Component {
    constructor(props) {
        super(props);
        let tmp = window.sessionStorage.getItem('user')||'{"avatar":""}';
        let {avatar} = JSON.parse(tmp);
        this.state = {
            avatar: `${serverHost}:${port}${avatar}` 
        };
    }
    signout() {
        // 1: 调用dispatch函数，让model来处理退出
        this.props.dispatch({type:'teacher/signout',payload:{} });
        // 2: 发一个请求 
        // 3: 由于服务器已经将登录状态清空了，那么我们再次携带以前的cookie是没有效果的
        // 4: 页面跳转到登录
    }
    render() {
        let { avatar } = this.state;
        console.log(this.state);
        return  (
            <React.Fragment>
<div>
    <div className="aside">
        
        <div className="profile">
            
            <div className="avatar img-circle">
                <img src={avatar} />
            </div>
            <h4></h4>
        </div>
        
        <div className="navs">
            <ul className="list-unstyled">
                <li>
                    <a>
                        <i className="fa fa-home"></i>
                        仪表盘
                    </a>

                </li>
                <li>
                    <a href="../user/list.html">
                        <i className="fa fa-bell"></i>
                        用户管理
                    </a>
                </li>
                <li>
                    <a>
                        <i className="fa fa-bell"></i>
                        讲师管理
                     </a>   
                </li>
                <li>
                    <a>
                        <i className="fa fa-cog"></i>
                        课程管理
                        <i className="arrow fa fa-angle-right"></i>
                    </a>
                    
                </li>
                <li>
                    <a href="../advert/list.html">
                        <i className="fa fa-bell"></i>
                        广告管理
                    </a>
                </li>
                <li>
                    <a>
                        <i className="fa fa-cog"></i>
                        系统设置
                        <i className="arrow fa fa-angle-right"></i>
                    </a>
                  <ul className="list-unstyled">
                            <li>
                                <a href="javascript:;">
                                    网站设置
                                </a>
                            </li>
                            <li>
                                <a href="javascript:;">
                                     权限管理
                                </a>
                            </li>
                        </ul>
                </li>
            </ul>
        </div>
    </div>
    <div className="main">
        <div className="container-fluid">
            
            <div className="header">
                <nav className="navbar navbar-custom">
                    <div className="navbar-header">
                        <a href="javascript:;" className="navbar-brand">
                            <i className="fa fa-navicon"></i>
                        </a>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <li>
                            <a href="javascript:;">
                                <i className="fa fa-bell"></i>
                                <span className="badge">8</span>
                            </a>
                        </li>
                        <li>
                            <a href="../index/settings.html">
                                <i className="fa fa-user"></i>
                                个人中心
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;" onClick={e=> this.signout() }>
                                <i className="fa fa-sign-out"></i>
                                退出
                            </a>
                        </li>
                        <li>
                            <a href="javascript:;">
                                <i className="fa fa-tasks"></i>
                            </a>
                        </li>
                    </ul>
                </nav>          
            </div>
            <TeacherLoading/>
            {
                 homeSubRouters.map((route,i)=>{
                    return <Route key={i} path={route.path} component={CheckLogin(route.component)}/>
                })
            }
            

        </div>
    </div>
      </div>
            </React.Fragment>)
    }
}

export default connect(state=>{
    return {
        num:state.index.num
    }
})(Home);
