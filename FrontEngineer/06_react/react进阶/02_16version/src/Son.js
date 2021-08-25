import React, { Component } from 'react'
import PropTypes from 'prop-types'

// 1.创建组件的不同
class Son extends Component {
    // 4.父组件传递参数时验证和默认值不同
    static propTypes = {
        //类型字符串，且是必须要的
        name: PropTypes.string.isRequired
    }
    // 以下注释就能知道效果了
    static defaultProps = {
        name: 'jack'
    }
    constructor() {
        super();
        // 状态初始化不同
        this.state = {
            num: 1,
        }
    }
    testThis() {
        //3.this指向不同需要处理
        console.log(this);
    }
    render() {
        return (
            <div>
                <button onClick={this.testThis}>点我</button>
            </div>
        )
    }
}

//5.导出成一个包装组件
export default class Wrap extends Component {
    componentDidMount() {
        console.log('新加的包装组件的功能： hello');
    }
    render() {
        return <Son />
    }
}