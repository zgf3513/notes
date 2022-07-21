<?php
namespace China\Beijing\Shunyi;
class Student {
	
}
function getInfo() {
	echo '李白<br>';
}
namespace USA\Washington;
class Student {
	
}
function getInfo() {
	echo 'Lincoln<br>';
}
//引入类取别名
use China\Beijing\Shunyi\Student as ChinaStudent;
//引入函数
use function China\Beijing\Shunyi\getInfo as info1;

//测试
$stu=new ChinaStudent;
var_dump($stu);

getInfo();	//Lincoln
info1();	//李白
