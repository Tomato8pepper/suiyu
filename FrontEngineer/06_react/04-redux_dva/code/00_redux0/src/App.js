import react, { Component } from 'react'
import * as userActions from './actions/user'
import { connect } from 'react-redux'


class App extends Component {
  constructor (props) {
    super (props)
    this.state = {}
  }
  render () {
    console.log(this.props);
    var { user } = this.props
    return (
      <div className="App">
        redux-test
        { user.isLogin 
          ? '欢迎您'
          : '未登录'
        }
        {
           user.loading
           ? '正在加载中......'
           : ''
        }
        {user.isLogin ? (<img src={user.avater} width='100' height='100' />) : ''}
        <br/>
        <button onClick={ () => {this.props.dispatch(userActions.login({account: 'test', password: '123'}))}}>登录</button>
      </div>
    );
  }
}
  


export default connect( (state) => {
  return {
    user: state.user
  }
})(App);
