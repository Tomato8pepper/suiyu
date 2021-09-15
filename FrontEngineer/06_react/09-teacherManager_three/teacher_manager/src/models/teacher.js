import request from '../utils/request.js';
import { routerRedux } from 'dva/router';
let teacher = {
    namespace: 'teacher',
    state: {
        isLogin: false,
        teachers: [],
        total: 0, //总记录数
        editingTeacher:{}
    },
    effects: {
        *saveTeacher ({payload},{call,put}) {
            let res = yield call(request('/teachers/edit',{
                method:'post',
                data:{...payload.teacher}
            }));
           
            yield put(routerRedux.push('/home/list'))
        },
        *showTeacher ({payload},{call,put}) {
           
           let res = yield call(request('/teachers/edit',{params:{_id:payload._id}}));
           yield put({type:'saveEditTeacher',payload:{teacher:res.data.teacher} });
           yield put(routerRedux.push('/home/edit'))
           
        },
        *search ({payload},{call,put}) {
            let res = yield call(request('/teachers/search',{params:{query:payload.q}}));
            yield put({type:'update',payload:{teachers:res.data.teachers,total:res.data.total}})
        },
        // 退出
        * signout({ payload }, { select, put, call }) {
            let res = yield call(request('/signout', {
                method: 'post'
            }));
            if (res.data.errcode == 0) {

                yield put({ type: 'changeLogin', payload: { isLogin: false } });
                window.sessionStorage.removeItem('user');
                // 页面跳转
                yield put(routerRedux.push('/signin'))
                return;
            }
            alert(res.data.errmsg);

        },
        // 更新teachers
        * updateTeacher({ payload }, { select, put, call }) {
            try {
                var res = yield call(request('/teachers', {
                    params: payload
                }));
                 // 将teacher信息保存到state中
                 yield put({ type: 'update', payload: { teachers: res.data.teachers, total: res.data.total } });
            } catch (e) {
                console.log('捕获异常了，不能发请求，没有登录')
            }
           
        },
        // 异步action
        * doLogin({ payload }, { select, put, call }) {

            let res = yield call(request('/signin', {
                method: 'post',
                data: payload, // {username,password}
            }));

            if (res.data.errcode != 0) {
                return alert('用户名或密码不正确!');
            }
            // 本地的seesion存储 localStorage
            window.sessionStorage.setItem('user', JSON.stringify(res.data.user));

            // 更改登录状态
            yield put({ type: 'changeLogin', payload: { isLogin: true } });
            // 跳转页面
            yield put(routerRedux.push('/home/list'))
        }

    },
    reducers: {
        saveEditTeacher (state,{payload}) {
            return {
                teacher:payload.teacher
            }
        },
        update(state, { payload }) {
            return {
                teachers: payload.teachers,
                total: payload.total
            }
        },
        changeLogin(state, { payload }) {
            return {
                isLogin: payload.isLogin
            }
        }
    }
}





export default teacher;