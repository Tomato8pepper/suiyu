module.exports = (options) =>{
    return async(ctx, next)=>{
        try{
            //先放行
            await next()
        }catch(e){
            //依据之前的
            console.log(e)
            //e.code状态码为002
            ctx.render('error', {msg: '002状态错误， 原因是：xxx'})
        }
    }
}