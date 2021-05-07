function validate(){
	var name=document.myform.n1.value;
	var password=document.myform.p1.value;
	if(n1==null||n1=="")
	{
		alert("name canot be blank");
		return false;
	}
	else if(p1.length<6)
	{
		alert("worng");
		return false;
	}
}