<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XMLHttp&amp:JS</title>
</head>
<body>

<h1>ASYNC WEB APP  WITH XMLHHTP REQUEST AND JAVASCIPT</h1>

<p id=mla></p>
<script type="text/javascript">

function mlaData(input){
	document.getElementById("mla").innerHtml=input;
}

let mlaPromise=new Promise(function(resolve,reject));
{
	let input=0;
	if(input==0){
		resolve("Success..");
	}
	else{
		reject("Fsilure/Rejected/Deny etc");
		mlaPromise.then(
				function(value){
					mlaData(value);
				}
				function(error){
					mlaData(value);
				})}
	}}
	

</script>

</body>
</html>