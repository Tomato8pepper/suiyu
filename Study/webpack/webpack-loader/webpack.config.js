module.exports = {
    module: {
        rules: [
            {
                // 识别.js文件
                test: /\.js$/,
                use: {
                    // 将js文件打包
                    loader: 'babel-loader',
                    options: {
                        presets: [
                            [
                                '@babel/preset-env',
                                {
                                    //最低运行在Chrome78
                                    targets: {
                                        browsers: ['chrome 78']
                                    }
                                }
                            ]
                        ],
                        plugins: []     //class    ->  plugin1   ->   function
                    }
                }
            },
            {
                test: /\.vue$/,
                use: {
                    loader: require.resolve('./vueloader.js')
                }
            }
        ]
    }
}