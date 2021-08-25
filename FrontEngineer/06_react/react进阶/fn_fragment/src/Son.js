import React, {Component} from 'react';

export default class Son extends Component {
    constructor() {
        super();
        this.state = {
            num: 2
        }
    }
    render () {
        let { num } = this.state;
        let { children } = this.props;
        // react.16以后的版本
        // [<span>{num}</span>,<hr/>]
        return (
            <React.Fragment>
                <span>{num}</span>
                <hr></hr>
                {/* {this.props.children} */}
                {/* 以下函数返回数组可以直接输出 ,避免传递参数过程中出现null和undefined*/}
                {React.Children.map(children, child => child)}
            </React.Fragment>
        )
    }
}