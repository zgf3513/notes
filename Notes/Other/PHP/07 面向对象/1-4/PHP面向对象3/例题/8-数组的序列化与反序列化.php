<?php
//数组的序列化
/*
$stu=['tom','berry','ketty'];
$str=serialize($stu);		//序列化
file_put_contents('./stu.txt',$str);
*/

//数组的反序列化
$str=file_get_contents('./stu.txt');
$stu=unserialize($str);		//反序列化
print_r($stu);	//Array ( [0] => tom [1] => berry [2] => ketty ) 