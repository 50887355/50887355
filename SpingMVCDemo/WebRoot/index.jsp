<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
   <script src="../../js/vue/vue.js"></script>
   <script src="../../js/vue/vue-resource.js"></script>

  <body>
   adfasd <br>
   <a href="page/helloworld">hello world</a>
   <div id="app"></div>
   
       <script type="text/javascript">
    	var  web = new Vue({
    		 el:'#app',
    		 data:{
    			 apiUrl: <%=basePath%>+'helloWorld'
    		 },
    		 methods: {
    			 closeDialog: function() {
						this.show = false
					},
					getCustomers: function() {
						// 定义vm变量，让它指向this,this是当前的Vue实例
						var vm = this,
							callback = function(data) {
								// 由于函数的作用域，这里不能用this
								vm.$set('gridData', data)
							}
						ajaxHelper.get(vm.apiUrl, null, callback)
					},
					createCustomer: function() {
						var vm = this,
							callback = function(data) {
								vm.$set('item', {})
								// 添加成功后，重新加载页面数据
								vm.getCustomers()
							}
							// 将vm.item直接POST到服务端
							ajaxHelper.post(vm.apiUrl, vm.item, callback)
							this.show = false
					}
				}
    	});
    
    </script>
  </body>
</html>
