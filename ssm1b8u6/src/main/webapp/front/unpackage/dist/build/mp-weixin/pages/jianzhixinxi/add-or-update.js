(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/jianzhixinxi/add-or-update"],{"304b":function(n,e,i){"use strict";var t=i("dfc2"),a=i.n(t);a.a},"380a":function(n,e,i){"use strict";i.r(e);var t=i("fd4e"),a=i("9193");for(var r in a)"default"!==r&&function(n){i.d(e,n,(function(){return a[n]}))}(r);i("304b");var u,o=i("f0c5"),s=Object(o["a"])(a["default"],t["b"],t["c"],!1,null,"038f50f7",null,!1,t["a"],u);e["default"]=s.exports},"757f":function(n,e,i){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var t=a(i("a34a"));function a(n){return n&&n.__esModule?n:{default:n}}function r(n,e,i,t,a,r,u){try{var o=n[r](u),s=o.value}catch(h){return void i(h)}o.done?e(s):Promise.resolve(s).then(t,a)}function u(n){return function(){var e=this,i=arguments;return new Promise((function(t,a){var u=n.apply(e,i);function o(n){r(u,t,a,o,s,"next",n)}function s(n){r(u,t,a,o,s,"throw",n)}o(void 0)}))}}var o=function(){Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(function(){return resolve(i("e98c"))}.bind(null,i)).catch(i.oe)},s={data:function(){return{ruleForm:{gongsimingcheng:"",gongsileixing:"",chenglishijian:"",fengmian:"",zhaopinyaoqiu:"",zhaopinrenshu:"",fabushijian:"",zhaopinzhuangtai:"",sfsh:"",shhf:""},zhaopinzhuangtaiOptions:[],zhaopinzhuangtaiIndex:0,user:{},ro:{gongsimingcheng:!1,gongsileixing:!1,chenglishijian:!1,fengmian:!1,zhaopinyaoqiu:!1,zhaopinrenshu:!1,fabushijian:!1,zhaopinzhuangtai:!1,sfsh:!1,shhf:!1}}},components:{wPicker:o},computed:{},onLoad:function(){var e=u(t.default.mark((function e(i){var a,r,u,o;return t.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a=n.getStorageSync("nowTable"),e.next=3,this.$api.session(a);case 3:if(r=e.sent,this.user=r.data,this.zhaopinzhuangtaiOptions="未满,已满".split(","),this.ruleForm.userid=n.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=n.getStorageSync("nickname")),!i.id){e.next=14;break}return this.ruleForm.id=i.id,e.next=12,this.$api.info("jianzhixinxi",this.ruleForm.id);case 12:r=e.sent,this.ruleForm=r.data;case 14:if(!i.cross){e.next=53;break}u=n.getStorageSync("crossObj"),e.t0=t.default.keys(u);case 17:if((e.t1=e.t0()).done){e.next=53;break}if(o=e.t1.value,"gongsimingcheng"!=o){e.next=23;break}return this.ruleForm.gongsimingcheng=u[o],this.ro.gongsimingcheng=!0,e.abrupt("continue",17);case 23:if("gongsileixing"!=o){e.next=27;break}return this.ruleForm.gongsileixing=u[o],this.ro.gongsileixing=!0,e.abrupt("continue",17);case 27:if("chenglishijian"!=o){e.next=31;break}return this.ruleForm.chenglishijian=u[o],this.ro.chenglishijian=!0,e.abrupt("continue",17);case 31:if("fengmian"!=o){e.next=35;break}return this.ruleForm.fengmian=u[o],this.ro.fengmian=!0,e.abrupt("continue",17);case 35:if("zhaopinyaoqiu"!=o){e.next=39;break}return this.ruleForm.zhaopinyaoqiu=u[o],this.ro.zhaopinyaoqiu=!0,e.abrupt("continue",17);case 39:if("zhaopinrenshu"!=o){e.next=43;break}return this.ruleForm.zhaopinrenshu=u[o],this.ro.zhaopinrenshu=!0,e.abrupt("continue",17);case 43:if("fabushijian"!=o){e.next=47;break}return this.ruleForm.fabushijian=u[o],this.ro.fabushijian=!0,e.abrupt("continue",17);case 47:if("zhaopinzhuangtai"!=o){e.next=51;break}return this.ruleForm.zhaopinzhuangtai=u[o],this.ro.zhaopinzhuangtai=!0,e.abrupt("continue",17);case 51:e.next=17;break;case 53:this.styleChange();case 54:case"end":return e.stop()}}),e,this)})));function i(n){return e.apply(this,arguments)}return i}(),methods:{styleChange:function(){this.$nextTick((function(){}))},chenglishijianChange:function(n){this.ruleForm.chenglishijian=n.target.value,this.$forceUpdate()},fabushijianConfirm:function(n){console.log(n),this.ruleForm.fabushijian=n.result,this.$forceUpdate()},zhaopinzhuangtaiChange:function(n){this.zhaopinzhuangtaiIndex=n.target.value,this.ruleForm.zhaopinzhuangtai=this.zhaopinzhuangtaiOptions[this.zhaopinzhuangtaiIndex]},fengmianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.fengmian=n.$base.url+"upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=u(t.default.mark((function n(){return t.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(!this.ruleForm.zhaopinrenshu||this.$validate.isIntNumer(this.ruleForm.zhaopinrenshu)){n.next=3;break}return this.$utils.msg("招聘人数应输入整数"),n.abrupt("return");case 3:if(!this.ruleForm.id){n.next=8;break}return n.next=6,this.$api.update("jianzhixinxi",this.ruleForm);case 6:n.next=10;break;case 8:return n.next=10,this.$api.add("jianzhixinxi",this.ruleForm);case 10:this.$utils.msgBack("提交成功");case 11:case"end":return n.stop()}}),n,this)})));function e(){return n.apply(this,arguments)}return e}(),optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,i=e.getFullYear(),t=e.getMonth()+1,a=e.getDate();return"start"===n?i-=60:"end"===n&&(i+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(i,"-").concat(t,"-").concat(a)},toggleTab:function(n){this.$refs[n].show()}}};e.default=s}).call(this,i("543d")["default"])},9193:function(n,e,i){"use strict";i.r(e);var t=i("757f"),a=i.n(t);for(var r in t)"default"!==r&&function(n){i.d(e,n,(function(){return t[n]}))}(r);e["default"]=a.a},a6f0:function(n,e,i){"use strict";(function(n){i("4037"),i("921b");t(i("66fd"));var e=t(i("380a"));function t(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,i("543d")["createPage"])},dfc2:function(n,e,i){},fd4e:function(n,e,i){"use strict";var t={"w-picker":function(){return Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(i.bind(null,"e98c"))}},a=function(){var n=this,e=n.$createElement;n._self._c},r=[];i.d(e,"b",(function(){return a})),i.d(e,"c",(function(){return r})),i.d(e,"a",(function(){return t}))}},[["a6f0","common/runtime","common/vendor"]]]);