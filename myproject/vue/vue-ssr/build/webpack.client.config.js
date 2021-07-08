const path = require('path');
//合并两对象
const merge = require('webpack-merge');
const base = require('./webpack.base.config');

module.exports = merge(base, {
  entry: {
    client: path.resolve(__dirname, '../src/entry-client.js')
  }
});