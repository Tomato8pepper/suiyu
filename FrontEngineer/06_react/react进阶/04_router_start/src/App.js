import './App.css';
//Router 相当于规则 + 坑
// import { HashRouter, BrowserRouter as Router, Route, NavLink, Switch, Redirect } from 'react-router-dom'
import { BrowserRouter as Router, NavLink, Redirect, Route, Switch } from 'react-router-dom'
import React, { Component } from 'react';

// 对于'/' 一般使用exact 匹配， 对于其它不适用exact匹配， 纵向深入
// 管理横向匹配，使用switch,只会匹配一个



class Man extends Component {
  render() {
    return (
      <div>
        <h1>男人首页</h1>
      </div>
    )
  }
}

class Women extends Component {
  render() {
    return (
      <div>
        <h1>女人首页</h1>
      </div>
    )
  }
}

class Home extends Component {
  render() {
    return (
      <div>
        <h1>我是首页</h1>
        <h2>以下是可以变内容</h2>
        <Switch>
          <Route path="/header/man" component={Man} />
          <Route path='/header/man' component={Women} />
          <Route path='/header/women' component={Women} />
        </Switch>
      </div>
    )
  }
}


class App extends Component {
  render() {
    return (
      <div className="App">
        <h1>头部</h1>
        <Router>
          <NavLink to='/header/man' activeStyle={{ color: 'blue' }}>man样式</NavLink>
          <NavLink to='/header/women' activeClassName='selected'>women类名</NavLink>
          <React.Fragment>
            <Switch>
              {/* 模糊匹配,  exact精确匹配 */}
              <Route path="/" exact component={Home} />
              <Route path="/header" component={Home} />
              {/* 重定向 */}
              <Redirect to="/header" />
            </Switch>
          </React.Fragment>
        </Router>

        <h1>底部</h1>

      </div>
    );
  }
}

export default App;
