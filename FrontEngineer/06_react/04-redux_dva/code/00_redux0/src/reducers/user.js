import * as userConstance from '../constances/user'

export default function (state = {}, action) {
    switch (action.type) {
        case userConstance.USER_LOGIN: {
            return {
                ...state,
                ...action.payload,
                isLogin: true
            }
        }

        case userConstance.USER_LOGOUT: {
            return {
                ...state,
                ...action.payload,
                isLogin: false
            }
        }

        case userConstance.USER_UPDATE: {
            return {
                ...state,
                ...action.payload
            }
        }

        default: {
            return state
        }
    }
}