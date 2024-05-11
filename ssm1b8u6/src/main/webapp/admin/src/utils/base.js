const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1b8u6/",
            name: "ssm1b8u6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1b8u6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校友会系统小程序"
        } 
    }
}
export default base
