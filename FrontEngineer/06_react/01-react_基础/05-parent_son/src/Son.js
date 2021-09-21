import React, {Component} from 'react'
import PropTypes from 'prop-types'

class Son extends Component {
    // 属性的约定和默认值
    static propTypes = {
        text: PropTypes.string.isRequired
    }

    static defaultProps = {
        text: 'abc'
    }

    constructor (props) {
        super (props) 
        this.state = {}
    }
    render () {
        console.log('kkprops', this.props)
        console.log('ll1', this.props.children instanceof Object);

        // 改变name不会改变this.props.name 值类型
        let { name, age, header, footer, children, text } = this.props
        // 改变obj.xxx就是改变this.props.obj.xxx引用类型
        // let { obj } = this.props
        return (
            <div>
                我是子组件
                {name}
                {age}
                {text}
                <div style={ {backgroundColor: 'red', fontSize: 34 } }>
                    {header}
                </div>
                {children}
                <div style={ {backgroundColor: 'green', fontSize: 23} }>
                    {footer}
                </div>
            </div>
        )
    }
}


export default Son