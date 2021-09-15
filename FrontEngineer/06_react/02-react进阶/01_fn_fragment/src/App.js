import React, {Component} from 'react'
import Son from './Son.js'

class App extends Component{
  render() {
    let dom = null;
    let obj = {name: 'jack'}  //对象不能作为子组件元素传递过去
    let dom2 = undefined;
    return (
      <React.Fragment>
        <Son obj={obj}>
          {dom}
          {1}
          {2}
          {3}
        </Son>
        {/* <Son>{obj}</Son> */}
        <Son>{dom2}</Son>
      </React.Fragment>
    );
  }
}

export default App;
