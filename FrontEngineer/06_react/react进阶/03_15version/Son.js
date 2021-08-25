import React from 'react';
import PropTypes from 'prop-types'


let myMixin = {
    componentDidMount () {
        console.log('mymixin');
    }
}

//创建不同
export default React.createClass({
    componentDidMount () {
        console.log('组件自己的');
    },
    mixins: [myMixin],



    //限制属性的不同
    propTypes: {
        text: PropTypes.string.isRequired,
    },
    getDefaultProps () {
        return {
            text: 'asdfasf'
        }
    },

    //获取dom元素
        //.在元素上使用  ref="xxx"
        //.在组件中使用 this.refs.xxx

    testThis () {
        console.log(this);        
    },


    // 状态不同
    getInitialState () {
        return {
            num: 'safd',
        }
    },
    render () {
        return (
            <div>
                {this.state.num}
                <button onclick={this.testThis}>点我this</button>
            </div>
        );
    }
})