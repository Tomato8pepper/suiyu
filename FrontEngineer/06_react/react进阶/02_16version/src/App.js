import React, { Component } from 'react'
import Wrap from './Son.js'
import './App.css';

//高阶组件，函数调用返回一个组件
function higtComponent(WrappedComponent) {
  class Temp extends Component {
    componentDidMount () {
      console.log('测试高阶组件');
    }
    render() {
      return <WrappedComponent/>
    }
  }
  return Temp;
}



// import Xxx from './xxx.js';   // export default higtComponent(Xxx)
let TestHighOrder = higtComponent(Wrap)


class App extends Component {
  render () {
    return (
      <div className="app">
        {/* <Son></Son> */}
        <Wrap/>
        <TestHighOrder/>
        {/* 在这里不能直接把组件作为返回值，可以直接返回jsx的部分 */}
      </div>
    );
  }
  
}

export default App;
