import React from 'react';
import ReactDOM from 'react-dom';
//引入路由对象
import { HashRouter,Route,NavLink,Redirect,Switch} from 'react-router-dom';
import Home from './components/Home';
import Signin from './components/Signin';


import "bootstrap/dist/css/bootstrap.min.css";
import "font-awesome/css/font-awesome.css";
import "./assets/css/index.css";


import Axios from 'axios';

Axios.defaults.baseURL = 'http://www.sinya.online:3002/';
Axios.defaults.withCredentials = true;







window.$axios = Axios;

//放入到主体App中
class App extends React.Component { 
  componentWillMount() {
    Axios.interceptors.request.use(config => {
      console.log('111');
      this.setState({
        isShow:true
      })
      return config;
    })


    Axios.interceptors.response.use(res => {

       this.setState({
        isShow:false
      })
         // 其实还可以在这里统一判断
      console.log(res, '----')
      if (res.data.errcode !== 0) {
        alert(res.data.errmsg)
        return Promise.reject(res.data.errmsg) // 表示
      }
      return res;
    })
  }
    constructor() {
        super();
        this.state = {
          isShow:false
        }
    }
    render(p) {
        return (
            <HashRouter>
               <div>
                        <div className="windows8" style={{display:this.state.isShow?'block':'none',position:'absolute',top:'50%',left:'50%'}}>
                          <div className="wBall" id="wBall_1" >
                            <div className="wInnerBall"></div>
                          </div>
                          <div className="wBall" id="wBall_2">
                            <div className="wInnerBall"></div>
                          </div>
                          <div className="wBall" id="wBall_3">
                            <div className="wInnerBall"></div>
                          </div>
                          <div className="wBall" id="wBall_4">
                            <div className="wInnerBall"></div>
                          </div>
                          <div className="wBall" id="wBall_5">
                            <div className="wInnerBall"></div>
                          </div>
                        </div>

                        <Switch>
                          <Route path="/signin" exact component={Signin}></Route>
                          <Route path="/home" component={Home}></Route>
                          <Redirect to="/signin"/>
                        </Switch>
                        
                         {/*/home则不再匹配
                        <Route path="/" exact component={Home}></Route>*/}
               </div>
            </HashRouter>


        )
    }
}

ReactDOM.render(<App/>,document.getElementById('box'))
