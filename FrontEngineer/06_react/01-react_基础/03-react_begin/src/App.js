// 1: 使用jsx的时候必须引入React
// 2: 组件要继承React.Component
import React, { Component } from "react";

class App extends Component {
  constructor (props) {
    super ()
    // 初始化组建的属性
    this.state = {
      name: 'mick'
    }
    this.changeHander = this.changeHander.bind(this)
  }
  changeHander (e) {
    console.log('kk1', e);
    console.log('kk2', this)
    console.log('onchange触发了');
    // this.state.name = e.target.value
    // this.setState({})
    this.setState({
      name: e.target.value
    })
  }
  render () {
    return (
      // 保证一个根节点
      <div>
        hello, I am react!<br/>
        { this.state.name }
        
        <input type='text' value='' onChange={  this.changeHander }  />
        {/* <input type='text' value={ this.state.name } onChange={ (e) => { this.changeHander(e) } } /> */}
      </div>
    )
  }
}

export default App;
