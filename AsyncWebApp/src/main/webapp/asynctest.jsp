<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AsyncTest</title>
</head>
<body>

<h1>ASYNC WEB APP  WITH XMLHHTP REQUEST AND JAVASCIPT</h1>

<p id=mla></p>
<script type="text/javascript">

async function getFile(){
	let mlaPromise=new Promise(function(resolve)); 
	
	{
		let request=new XMLHttpRequest();
		request.open('GET','AsyncServlet');
		request.onload=funcyion()
		{
			if(request.status==200){
				resolve(request.response);
			}
			else{
				resolve("NO data Available");
			}
		};
		request.send();
		
	});
	document.getElementById("mla").innerHtml=await mlaPromise;
	
}
getFile();
</body>
</html>