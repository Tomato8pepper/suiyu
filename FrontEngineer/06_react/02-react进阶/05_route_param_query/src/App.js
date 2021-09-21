import { BrowserRouter as Router, NavLink, Route } from 'react-router-dom'
import React, {Component} from 'react'


class User extends Component {
  componentDidMount () {
    // /user/:id
    console.log(this.props);
    
  }
  goBack () {
    this.props.history.goBack();    // goForward() 
  }
  render () {
    return (
      <div>
        <h1>用户组件</h1>
        <button onClick={e => this.goBack()}>返回 || 前进</button>
      </div>
    )
  }
}


class App extends Component {
  render () {
    // '/user/:id' 字符串方式
    // 对象方式
    let path = {
      pathname: '/user/9',
    }
    let pathQueryObj = {
      pathname: '/userq',
      search: '?id=8',
      state: { name: 'mick' },
      query: {
        id: 666
      }
    }
    return (
      <div className="App">
        <h1>头部</h1>
        <h2>底部</h2>
        <Router>
          <React.Fragment>
            <NavLink to="/user/5">字符串方式去user</NavLink>
            <h1>----</h1>
            <NavLink to={path}>对象方式去user</NavLink>
            <Route path="/user/:id" component={User} ></Route>
            <hr/>
            <NavLink to="/userq?id=5">字符串方式去user</NavLink>
            <h1>----</h1>
            <NavLink to={pathQueryObj}>对象方式去user</NavLink>
            <Route path="/userq" component={User} ></Route>
          </React.Fragment>
        </Router>
      </div>
    );
  }
}

export default App;
