const bcrypt = require('bcrypt');

module.exports = {
    encrypt: async (password, saltTimes) => {
        const hash = await bcrypt.hash(password, saltTimes);
        return hash; 
      },
      
    validate: async (password, hash) => {
        const match = await bcrypt.compare(password, hash);
        return match;
      }
}

