const userse = require('../controllers/mysqlConfig')
const router = require('koa-router')()
const utils = require('../controllers/utils')

router.prefix('/users')

router.get('/', function (ctx, next) {
  ctx.body = 'this is a users response!'
})

router.get('/bar', function (ctx, next) {
  ctx.body = 'this is a users/bar response'
})

router.get('/all', async (ctx, next) => {
  await userse.getAllUsers().then((res) => {
    ctx.body = res
  })
})

// 登录注册
router.post('/userRegister', async (ctx, next) => {
  var _username = ctx.request.body.username
  var _userpwd = ctx.request.body.userpwd
  var _nickname = ctx.request.body.nickname
  if (!_username || !_userpwd || !_nickname) {
    ctx.body = {
      code: '80001',
      mess: '用户名、密码或昵称不能为空！！！'
    }
    return
  }
  let user = {
    username: _username,
    userpwd: _userpwd,
    nickname: _nickname
  }
  await userse.findUser(user.username).then(async (res) => {
    if (res.length) {
      try {
        throw Error('用户名已经存在！！！')
      } catch (error) {
        console.log(error);
      }
      ctx.body = {
        code: '80003',
        data: 'err',
        mess: '用户名已存在！！！'
      }
    } else {
      await userse.insertUser([user.username, user.userpwd, user.nickname])
        .then((res) => {
          console.log(res);
          let result = ''
          if (res.affectedRows !== 0) {
            result = 'ok'
            ctx.body = {
              code: 80000,
              data: result,
              mess: '注册成功！！'
            }
          } else {
            result = 'error',
              ctx.body = {
                code: 80004,
                data: result,
                mess: '注册失败！！'
              }
          }
        }).catch((err) => {
          ctx.body = {
            code: '80002',
            data: err,
          }
        })
    }
  }).catch((err) => {
    ctx.body = {
      code: '80002',
      data: err,
    }
  })
})

router.post('/userLogin', async (ctx, next) =>{
  var _username = ctx.request.body.username
  var _userpwd = ctx.request.body.userpwd
  if(!_username || !_userpwd){
    ctx.body = {
      code: '80001',
      mess: '用户名或密码为空！！！'
    }
  }
  let results =await userse.userLogin(_username, _userpwd)
  console.log(results);
  if(results.length) {
    let res = {
      id: results[0].id,
      nickname: results[0].nickname,
      username: results[0].username
    }
    ctx.body = {
      code: '80000',
      data: res,
      mess: '登陆成功！！！'
    }
  }else{
    ctx.body = {
      code: '80002',
      data: '',
      mess: '登录失败！！！'
    }
  }
})

//根据分类名查找对象的笔记列表
router.post('/findNoteListByType', async(ctx, next) =>{
  const note_type = ctx.request.body.note_type
  const userId = ctx.request.body.userId
  await userse.findNoteListByType(userId, note_type).then(async(res)=>{
    let r = ''
    if(res.length) {
      r = 'ok',
      ctx.body = {
        code: '80000',
        data: res,
        mess: '查找成功！！！'
      }
    }else{
      r = 'error',
      ctx.body = {
        code: '80004',
        data: r,
        mess: '查找失败！！！'
      }
    }
  }).catch((err)=>{
    console.log(err);
  })
})


router.post('/findNoteDetailById', async (ctx, next)=>{
  const id = ctx.request.body.id
  await userse.findNoteDetailById(id).then((res)=>{
    if(res.length){
      ctx.body = {
        code: '80000',
        data: res[0],
        mess: '查找成功！！！'
      }
    }else{
      ctx.body = {
        code: '80004',
        data: 'error',
        mess: '查找失败！！'
      }
    }
  }).catch((err)=>{
    console.log(err);
  })
})

//发表笔记
router.post('/insertNote', async (ctx, next) =>{
  let c_time = utils.getNowFormatDate();
  let m_time = utils.getNowFormatDate();
  let note_content = ctx.request.body.note_content
  let head_img = ctx.request.body.head_img
  let title = ctx.request.body.title
  let note_type = ctx.request.body.note_type
  let useId = ctx.request.body.userId
  let nickname = ctx.request.body.nickname
  await userse.insertNote([c_time, m_time, note_content, head_img, title, note_type, useId, nickname])
  .then(async(res)=>{
    let r = ''
    if(res.affectedRows !== 0) {
      r = 'ok'
      ctx.body = {
        code: '80000',
        data: r,
        mess: 'success!!!'
      }
    }else{
      r = 'error'
      ctx.body = {
        code: '80004',
        data: r,
        mess: 'faile'
      }
    }
  }).catch((err)=>{
    console.log(err);
  })
})


module.exports = router
