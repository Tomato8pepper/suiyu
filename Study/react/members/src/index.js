//入口文件
import React from "react";     //es6 import          
import ReactDOM from "react-dom";
import "./style.css";     //global.css
import {MyComponent} from './demo';

function App() {
    return(
        //JSX   wxml
        <div className="App">
           App
           <MyComponent />
        </div>
    )
}

const rootElement = document.getElementById('root');
ReactDOM.render(<App/>,rootElement);