import React from 'react';
import { NavLink,Route } from 'react-router-dom';
import TeacherList from './TeacherList';
import TeacherAdd from './TeacherAdd';
import TeacherEdit from './TeacherEdit';
import DashBorad from './DashBorad';
export default class Home extends React.Component {
    constructor() {
        super();
        this.state = {
            avatar:''
        }
    }

    //组件初始化
    componentWillMount() {
        let user = JSON.parse(localStorage.getItem('user'));

        if(!user) {
            alert('您还没有登录！');

            return this.props.history.push('/signin');
        }

        this.setState({
            avatar:'/static' + user.avatar
        });

    }

    render(p) {
        return (


<div>
    <div className="aside">
        
        <div className="profile">
            
            <div className="avatar img-circle">
                <img src={this.state.avatar} />
            </div>
            <h4></h4>
        </div>
        
        <div className="navs">
            <ul className="list-unstyled">
                <li>
                    <NavLink to={{pathname:'/home/dashBorad'}}>
                        <i className="fa fa-home"></i>
                        仪表盘
                    </NavLink>

                </li>
                <li>
                    <a href="../user/list.html">
                        <i className="fa fa-bell"></i>
                        用户管理
                    </a>
                </li>
                <li>
                    <NavLink to={{pathname:'/home/list'}}>
                        <i className="fa fa-bell"></i>
                        讲师管理
                     </NavLink>   
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
                            <a href="javascript:;" onClick={e=>this.signout()}>
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
           
            <Route path="/home/list" component={TeacherList}/>
            <Route path="/home/add" component={TeacherAdd}/>
            <Route path="/home/edit/:id" component={TeacherEdit}/>
            <Route path="/home/dashBorad" component={DashBorad}/>


        </div>
    </div>
      </div>

        )
    }
    signout() {
        localStorage.removeItem('user');
        location.href='/'
    }
}