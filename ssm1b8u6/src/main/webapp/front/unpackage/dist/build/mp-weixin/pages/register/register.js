(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/register/register"],{"6f43":function(t,e,i){"use strict";var n=i("bed6"),r=i.n(n);r.a},"94ca":function(t,e,i){"use strict";i.r(e);var n=i("de11"),r=i("ef28");for(var u in r)"default"!==u&&function(t){i.d(e,t,(function(){return r[t]}))}(u);i("6f43");var a,s=i("f0c5"),o=Object(s["a"])(r["default"],n["b"],n["c"],!1,null,"195e1024",null,!1,n["a"],a);e["default"]=o.exports},b5bd:function(t,e,i){"use strict";(function(t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var n=r(i("a34a"));function r(t){return t&&t.__esModule?t:{default:t}}function u(t,e,i,n,r,u,a){try{var s=t[u](a),o=s.value}catch(h){return void i(h)}s.done?e(o):Promise.resolve(o).then(n,r)}function a(t){return function(){var e=this,i=arguments;return new Promise((function(n,r){var a=t.apply(e,i);function s(t){u(a,n,r,s,o,"next",t)}function o(t){u(a,n,r,s,o,"throw",t)}s(void 0)}))}}var s={data:function(){return{yonghuxingbieOptions:[],yonghuxingbieIndex:0,xiaoyouxingbieOptions:[],xiaoyouxingbieIndex:0,ruleForm:{},tableName:""}},onLoad:function(){var e=a(n.default.mark((function e(){var i;return n.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:[],i=t.getStorageSync("loginTable"),this.tableName=i,"yonghu"==this.tableName&&(this.yonghuxingbieOptions="男,女".split(","),this.ruleForm.xingbie=this.yonghuxingbieOptions[0]),"xiaoyou"==this.tableName&&(this.xiaoyouxingbieOptions="男,女".split(","),this.ruleForm.xingbie=this.xiaoyouxingbieOptions[0]),this.styleChange();case 6:case"end":return e.stop()}}),e,this)})));function i(){return e.apply(this,arguments)}return i}(),methods:{yonghuxingbieChange:function(t){this.yonghuxingbieIndex=t.target.value,this.ruleForm.xingbie=this.yonghuxingbieOptions[this.yonghuxingbieIndex]},xiaoyouxingbieChange:function(t){this.xiaoyouxingbieIndex=t.target.value,this.ruleForm.xingbie=this.xiaoyouxingbieOptions[this.xiaoyouxingbieIndex]},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var t=a(n.default.mark((function t(){return n.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.ruleForm.yonghuming||"yonghu"!=this.tableName){t.next=3;break}return this.$utils.msg("用户名不能为空"),t.abrupt("return");case 3:if(this.ruleForm.mima||"yonghu"!=this.tableName){t.next=6;break}return this.$utils.msg("密码不能为空"),t.abrupt("return");case 6:if(this.ruleForm.xingming||"yonghu"!=this.tableName){t.next=9;break}return this.$utils.msg("姓名不能为空"),t.abrupt("return");case 9:if("yonghu"!=this.tableName||!this.ruleForm.shouji||this.$validate.isMobile(this.ruleForm.shouji)){t.next=12;break}return this.$utils.msg("手机应输入手机格式"),t.abrupt("return");case 12:if("yonghu"!=this.tableName||!this.ruleForm.youxiang||this.$validate.isEmail(this.ruleForm.youxiang)){t.next=15;break}return this.$utils.msg("邮箱应输入邮件格式"),t.abrupt("return");case 15:if("yonghu"!=this.tableName||!this.ruleForm.shenfenzheng||this.$validate.checkIdCard(this.ruleForm.shenfenzheng)){t.next=18;break}return this.$utils.msg("身份证应输入身份证格式"),t.abrupt("return");case 18:if("xiaoyou"!=this.tableName||!this.ruleForm.shouji||this.$validate.isMobile(this.ruleForm.shouji)){t.next=21;break}return this.$utils.msg("手机应输入手机格式"),t.abrupt("return");case 21:if("xiaoyou"!=this.tableName||!this.ruleForm.youxiang||this.$validate.isEmail(this.ruleForm.youxiang)){t.next=24;break}return this.$utils.msg("邮箱应输入邮件格式"),t.abrupt("return");case 24:return t.next=26,this.$api.register("".concat(this.tableName),this.ruleForm);case 26:this.$utils.msgBack("注册成功");case 28:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}()}};e.default=s}).call(this,i("543d")["default"])},bed6:function(t,e,i){},d99a:function(t,e,i){"use strict";(function(t){i("4037"),i("921b");n(i("66fd"));var e=n(i("94ca"));function n(t){return t&&t.__esModule?t:{default:t}}t(e.default)}).call(this,i("543d")["createPage"])},de11:function(t,e,i){"use strict";var n,r=function(){var t=this,e=t.$createElement;t._self._c},u=[];i.d(e,"b",(function(){return r})),i.d(e,"c",(function(){return u})),i.d(e,"a",(function(){return n}))},ef28:function(t,e,i){"use strict";i.r(e);var n=i("b5bd"),r=i.n(n);for(var u in n)"default"!==u&&function(t){i.d(e,t,(function(){return n[t]}))}(u);e["default"]=r.a}},[["d99a","common/runtime","common/vendor"]]]);