import React, { Component } from 'react'

class App extends Component {
  constructor (props) {
    super(props)
    this.state = {
      name: 'mick'
    }
    console.log('1:constructor加载了');
  }

  componentWillMount() {
    console.log('2:componentWillMount加载了');
  }

  componentDidMount() {
    // 发请求
    console.log('4:componentDidMount加载了');
  }

  shouldComponentUpdate () {
    console.log('1:shouldComponentUpdate');
    return true
  }

  componentWillUpdate () {
    console.log('2:componentWillUpdate加载了');
  }

  componentDidUpdate (preProps) {
    if (this.props === preProps) {
       console.log('ll1', preProps);
       console.log('ll2', this.props);
    }
    console.log('3:componentDidUpdate加载了');
  }

  render () {
    console.log('3:render加载了');
    return (
      <div>
          { this.state.name }
          <button onClick={ () => { this.changeName() } }>更新姓名</button>
      </div>
    )
  }

  changeName () {
    this.setState( {
      name: 'rose'
    })
  }
}
export default App;
