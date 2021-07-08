var mysql = require('mysql')
var config = require('./defaultConfig')

// 链接线程池
var pool = mysql.createPool({
    host: config.database.HOST,
    user: config.database.USERNAME,
    password: config.database.PASSWORD,
    database: config.database.DATABASE,
    port: config.database.PORT,
})


// 统一链接数据库的method
let allServices = {
    query: function (sql, values) {
        return new Promise((resolve, reject) => {
            // 建立连接
            pool.getConnection(function (err, connection) {
                if (err) {
                    reject(err);
                } else {
                    connection.query(sql, values, function (error, results, fields) {
                        console.log(`${sql}: ${results}`);
                        if (error) {
                            reject(err)
                        } else {
                            resolve(results)
                            // error是否为空由数据库查询结果决定
                        }
                        // 释放连接
                        connection.release();
                    });
                }

            });
        })
    }
}

// 读取所有users表中的数据
let getAllUsers = function () {
    let _sql = `select * from users;`
    return allServices.query(_sql)
}

// 用户登录
let userLogin = function(username, userpwd) {
    let _sql = `select * from users where username="${username}" and userpwd="${userpwd}";`
    return allServices.query(_sql)
}

// 用户查找
let findUser = function(username) {
    let _sql = `select * from users where username="${username}";`
    return allServices.query(_sql)
}

// 用户注册
let insertUser = function(value) {
    let _sql = `insert into users set username=?,userpwd=?,nickname=?;`
    return allServices.query(_sql, value)
}

// 根据分类名查找对应的笔记列表
let findNoteListByType = function(userId, note_type) {
    let _sql = `select * from note where note_type="${note_type}" and useId="${userId}";`
    return allServices.query(_sql)
}

// 根据文章id查找文章详情
let findNoteDetailById = function (id) {
    let _sql = `select * from note where id="${id}";`
    return allServices.query(_sql)
}

// 发表日记
let insertNote = function (options) {
    let _sql = `insert into note set c_time=?,m_time=?,note_content=?,head_img=?,title=?,note_type=?,useId=?,nickname=?;`
    return allServices.query(_sql, options)
}

//导出方法
module.exports = {
    getAllUsers, userLogin, findUser, insertUser, findNoteListByType, findNoteDetailById, insertNote
}