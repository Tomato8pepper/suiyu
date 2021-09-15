import * as userConstance from '../constances/user'

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

export const login = payload => {

    return async (dispatch) => {
        
        dispatch(update({ loading: true }))
        const res = await loginRequest()
        dispatch(update({
            ...res,
            loading: false
        }))
    }   


    // return {
    //     type: userConstance.USER_LOGIN,
    //     payload,
    // }
}

export const logout = payload => {
    return {
        type: userConstance.USER_LOGOUT,
        payload,
    }
}

export const update = payload => {
    return {
        type: userConstance.USER_UPDATE,
        payload,
    }
}