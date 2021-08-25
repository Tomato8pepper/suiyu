import './App.css';
import { BrowserRouter as Router, NavLink, Route } from 'react-router-dom'
import React, {Component} from 'react'


class User extends Component {
  componentDidMount () {
    // /user/:id
    console.log(this.props.match.params.id);
  }
  goBack () {
    this.props.history.goBack();    // goForward() 
  }
  render () {
    return (
      <div>
        <h1>用户组件</h1>
        <button onclick={e => this.goBack()}>返回 || 前进</button>
      </div>
    )
  }
}


class App extends Component {
  render () {
    // '/user/:id' 字符串方式
    let path = {
      pathname: '/user/9',
    }
    let pathQueryObj = {
      pathname: '/userq/?'
    }
    return (
      <div className="App">
        <h1>头部</h1>
        <h2>底部</h2>
        <Router>
          <React.Fragment>
            <NavLink to="/user/5">去user</NavLink>
            <NavLink to={path}>obj去user</NavLink>
            <Route path="/user/:id" component={User} ></Route>
            <hr/>
            <NavLink to="/user/5">去user</NavLink>
            <NavLink to={path}>obj去user</NavLink>
            <Route path="/user/:id" component={User} ></Route>
          </React.Fragment>
        </Router>
      </div>
    );
  }
}

export default App;
