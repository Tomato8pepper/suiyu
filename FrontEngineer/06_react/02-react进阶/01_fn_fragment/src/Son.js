import React, {Component} from 'react';

export default class Son extends Component {
    constructor() {
        super();
        this.state = {
            num: 2
        }
    }

    // this.props.children 的值有三种可能：如果当前组件没有子节点，它就是 undefined ;
    // 如果有一个子节点，数据类型是 object ；如果有多个子节点，数据类型就是 array 。

    render () {
        console.log('ll1', this.props.children);
        let { num } = this.state;
        let { children } = this.props;
        // react.16以后的版本
        // return [<span>{num}</span>,<hr/>] 
        return (
            <React.Fragment>
                <span>{num}</span>
                <hr></hr>
                {/* {this.props.children} */}
                {/* 以下函数返回数组可以直接输出 ,避免传递参数过程中出现null和undefined*/}
                {React.Children.map(children, child => <li>{child}</li>)}
                {React.Children.forEach(children, child => child)}
            </React.Fragment>
        )
    }
}