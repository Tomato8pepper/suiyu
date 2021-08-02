const { getLunbo } = require('../models/homeModel.js');
const homeModel = require('../models/homeModel.js')

module.exports = {
    getLunbo: async function () {
        console.log(123);
        let result = await homeModel.getLunbo()
        console.log(result);
    },

}