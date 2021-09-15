import React,{Component} from 'react';

import { connect } from 'dva';

class Home extends Component {
    test(){
        console.log('点击执行了')
        this.props.dispatch({type:'index/changeNum',payload:{num:8} });
    }
    render() {
        console.log(this.props)
        return  (
            <React.Fragment>
                数量是{this.props.num}
                <button onClick={e=> this.test() }>变更num</button>
            </React.Fragment>)
    }
}

export default connect(state=>{
    return {
        num:state.index.num
    }
})(Home);
