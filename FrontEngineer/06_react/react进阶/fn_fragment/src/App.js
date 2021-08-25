import logo from './logo.svg';
import './App.css';
import React, {Component} from 'react'
import Son from './Son.js'

class App extends Component{
  render() {
    let dom = null;
    // let obj = {name: 'jack'}
    let dom2 = undefined;
    return (
      <React.Fragment className="app">
        <Son>{dom}</Son>
        {/* <Son>{obj}</Son> */}
        <Son>{dom2}</Son>
      </React.Fragment>
    );
  }
}

export default App;
