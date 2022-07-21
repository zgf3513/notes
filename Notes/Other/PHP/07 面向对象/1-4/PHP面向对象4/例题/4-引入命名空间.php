<?php
namespace China\Beijing\Shunyi;
function getInfo() {
	echo '李白<br>';
}
namespace USA;
function getInfo() {
	echo 'Lincoln<br>';
}
//引入命名空间
use China\Beijing\Shunyi;	
//测试
getInfo();			//Lincoln
Shunyi\getInfo();	//李白

