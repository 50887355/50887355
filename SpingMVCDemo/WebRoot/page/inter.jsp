<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML >
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
   <script src="<%=basePath%>js/vue/vue.js"></script>
   <script src="<%=basePath%>js/vue/vue-resource.js"></script>

  <body>
   过来了 显示值 <br>
   	<div id="app">
			<div class="container">
				<simple-grid :data-list="gridData" :columns="gridColumns">
				</simple-grid>
			</div>
		</div>

		<template id="grid-template">
			<table>
				<thead>
					<tr>
						<th v-for="col in columns">
							{{ col | capitalize}}
						</th>
					</tr>
				</thead>
				<tbody>
					<tr v-for="(index,entry) in dataList">
						<td v-for="col in columns">
							{{entry[col]}}
						</td>
					</tr>
				</tbody>
			</table>
		</template>
		
		<script>
			Vue.component('simple-grid', {
				template: '#grid-template',
				props: ['dataList', 'columns']
			})
			
				
		</script>
		<script>
		alert(0);
		Vue.http.post(<%=basePath%>+'user/query').then(function(response){
		    // 响应成功回调
		    console.log(response);
		}, function(response){
		    // 响应错误回调
			  alert(response);
		});
		
		alert(1);
		</script>
  </body>
</html>
