<template>
  <div class="login">
    <h2>旅梦后台管理系统</h2>
    <div class="login-wrapper">
      <p class="input">
        <el-input v-model="user" placeholder="请输入内容" >请输入账号</el-input>
      </p>
      <p class="input">
        <el-input v-model="password" type='password' placeholder="请输入内容" >请输入密码</el-input>
      </p>
      <p class="btn">
        <!-- round -->
        <el-button  type="primary" round @click="login" >登录</el-button>
      </p>
    </div>
  </div>
</template>

<script>
export default {
  data(){
    return {
      user: "查明国",
      password: "zmg",
    };
  },
  methods: {
      login() {
          if(!this.user || !this.password){
            //   alert('账号或者密码为空！！')
            this.$message.error('账号或者密码为空！！')
            this.$router.push({
              path: '/about'
            })
          // }else if(this.user === '2798645458' && this.password === '486468576'){
          //     this.$message({
          //         message: '登录成功！！',
          //         type: 'success'
          //     })
          //   //   登录成功就编程式跳转到其他页面
          //     this.$router.push({
          //       path: '/home'
          //     })
          }else{
              // this.$message.error('账号或者密码错误！！')
              this.$message({
                  message: '登录成功！！',
                  type: 'success'
              })
              // 本地存储 
              localStorage.setItem('name', this.user)
            //   登录成功就编程式跳转到其他页面
              // this.$router.push({ path: '/home',  query:{name: this.user} })
              this.$router.push({ name: 'home',   params: { name: this.user }})
          }
          
      },
  }
};
</script>

<style scoped>
.login{
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  background-color: cyan;
}
.login-wrapper {
  margin-top: 30px;
  width: 250px;
}
.input {
  margin-bottom: 20px;
}
.btn button{
    width: 100%;
}
</style>