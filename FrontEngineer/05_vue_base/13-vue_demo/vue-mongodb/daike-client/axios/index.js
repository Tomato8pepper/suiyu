import apiLogin from './interface/login.js'

const install = Vue => {
    if (install.installed) {
        return;
    }
    install.installed = true
    Object.defineProperties(Vue.prototype, {
        $http: {
            get() {
                return Object.assign(
                    {},
                    apiLogin
                )
            }
        }
    })
}
export default {
    install
}