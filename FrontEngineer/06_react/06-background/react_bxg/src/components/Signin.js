import React from 'react';
export default class Signin extends React.Component {

    render() {
        return (
            <div className="login">
        <div className="login-wrap">
            <div className="avatar">
                 <img src={'/static/img/monkey.png'} className="img-circle" alt="" />
            </div>
            <form onSubmit={e=>this.doSubmit(e)} className="col-xs-offset-1 col-xs-10">
                <div className="input-group input-group-lg">
                    <span className="input-group-addon">
                        <i className="fa fa-user"></i>
                    </span>
                    <input id="name" type="text" className="form-control" placeholder="用户名" onChange={e=> this.setState({username:e.target.value})} />
                </div>
                <div className="input-group input-group-lg">
                    <span className="input-group-addon">
                        <i className="fa fa-key"></i>
                    </span>
                    <input id="pass" type="password" className="form-control" placeholder="密码" onChange={e=> this.setState({password:e.target.value}) }/>
                </div>
                <button type="submit" className="btn btn-lg btn-primary btn-block">登 录</button>
            </form>
        </div>
    </div>

        )
    }
    constructor() { 
        super();
        this.state = {
            username:'',
            password:''
        }
    }


    //登录
    doSubmit(e){
        e.preventDefault();
        $axios.post('/signin',{
            username:this.state.username,
            password:this.state.password,
        })
        .then(res=>{
            localStorage.setItem('user',JSON.stringify(res.data.user));
            this.props.history.push('/home');
        })
        .catch(err=>{
            console.log(err);
        })
    }
}