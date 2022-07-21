<?php
$lang='en';
//类
class Student{
}
//匿名函数
if($lang=='ch'){
	$fun=function(){
		echo '我是一名学生';
	};
}else{
	$fun=function(){
		echo 'i am a studnet';
	};
}
//绑定
$stu=new Student;
$fun->call($stu);	//i am a studnet

