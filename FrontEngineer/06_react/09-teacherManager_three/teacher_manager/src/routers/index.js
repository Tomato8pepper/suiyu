import React from 'react';
// 配置路由规则
import { Router,Route,NavLink,Switch,Redirect } from 'dva/router';
import Home from '../components/Home.js';
import Signin from '../components/Signin.js';
import TeacherList from '../components/TeacherList.js';
import TeacherEdit from '../components/TeacherEdit.js';
import Loading from '../components/common/Loading.js';

const MyRoute = Route;
const homeSubRouters = [{ path:'/home/list',component:TeacherList},{path:'/home/edit',component:TeacherEdit}];


let fn = function ({ history,app }) {
    return (
        <Router history={history}>
                <div>
                    <Loading/>
                    <Switch>
                       {/*默认访问signin*/}
                        <Route path="/home" component={Home}/>
                        <Route path="/signin" exact component={Signin}/>
                        <Redirect to="/signin"/>
                    </Switch>
                </div>
              
        </Router>
    )
}

export default fn;

export { homeSubRouters,MyRoute }