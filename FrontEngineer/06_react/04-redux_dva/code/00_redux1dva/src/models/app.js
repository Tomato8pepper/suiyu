let loginRequest = function () {
  return new Promise((res, rej) => {  
          setTimeout(() => {
              res({
                  avater: 'http://localhost:3000/public/img/1.jpg',
                  nickName: 'mick',
                  isLogin: true
              })     
          }, 3000);
  })
}


export default {

  namespace: 'app',

  state: {
    loading: false
  },

  subscriptions: {
    setup({ dispatch, history }) {  // eslint-disable-line
    },
  },

  effects: {
    *fetch({ payload }, { call, put }) {  // eslint-disable-line
      yield put({type: 'update', payload: {loading: true}})
      const res = yield call(loginRequest, {params: {}})
      yield put({ type: 'update', payload: { ...res, loading: false } });
    },
  },

  reducers: {
    update(state, action) {
      return { ...state, ...action.payload };
    },
  },

};
