import React, { Component } from 'react'
import Son from './Son.js'

class App extends Component {
  constructor (props) {
    super(props)
    this.state = {
      name: 'mick',
      age: 23
    }
  }
  render () {
    let { name, age } = this.state
    let header = <div>i am header</div>
    let footer = <div>i am footer</div>
    let text = 'aaa'
    return (
      <div>
        {/* {this.state} state是对象不可以放，但是可以放数组*/}
        下面是子组件
        {/* 组件的使用必须首字母大写 */}
        <Son name={name} age={age} footer={footer} header={header} text={text}>
          <ul>
            <li>1</li>
            <li>2</li>
            <li>3</li>
          </ul>
        </Son>
      </div>
    )
  }
}

export default App;
