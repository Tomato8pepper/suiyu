import React from 'react';
import { connect } from 'dva';


function IndexPage(props) {
  console.log(props);
  return (
    <React.Fragment>
      {props.loading
       ? '未加载'
       : '加载中'
      }
       
       <input type='button' onClick={ () => {props.dispatch({type: 'app/fetch'})}} value='登录'/>
    </React.Fragment>
  );
}

IndexPage.propTypes = {
};

export default connect( state => {
  console.log(state);
  return {
    app: state.app
  }
})(IndexPage);
