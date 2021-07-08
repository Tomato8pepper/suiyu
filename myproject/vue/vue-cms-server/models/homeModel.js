const db = require('./database.js')

module.exports = {
    getLunbo: async () => await db.q('select * from picture'),
}