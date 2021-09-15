import axios from '../api'

const Login = (data) => {
    return axios({
        url: '/login',
        method: 'post',
        data
    })
}
export default {
    Login
}