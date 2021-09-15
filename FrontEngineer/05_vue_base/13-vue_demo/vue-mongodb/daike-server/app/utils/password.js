const bcrypt = require('bcrypt')
const { saltTimes } = require('../../config')

// 加密
const encrypt = async (password, saltTimes) => {
    const hash = await bcrypt.hash(password, saltTimes)
    return hash
}
// 解密
const validate = async (password, hash) => {
    const match = await bcrypt.compare(password, hash)
    return match
}

module.exports = {
    encrypt,
    validate
}