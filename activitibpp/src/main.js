import Vue from 'vue'
import App from './App.vue'
// 导入组件库
import ElementUI from 'element-ui'
// 导入组件样式
import  'element-ui/lib/theme-chalk/index.css';
import router from './router'

Vue.config.productionTip = false

// 配置ElementUI插件
Vue.use(ElementUI)
new Vue({
  render: h => h(App),
  router,
  components:{App},
  template:'<App>'
}).$mount('#app')
