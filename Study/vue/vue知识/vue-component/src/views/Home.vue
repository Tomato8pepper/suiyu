<template>
  <div class="home">
    <User :userName="name"></User>
  </div>
</template>

<script>
// @ is an alias to /src

import User from '@/components/User'
export default {
  name: 'Home',
  data() {
    return {
      name: '小刚'
    }
  },
  components: {
    User
  }
}
</script>
