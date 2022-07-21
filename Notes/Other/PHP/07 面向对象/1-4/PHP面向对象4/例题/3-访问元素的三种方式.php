<?php
namespace China\Beijing\Shunyi;
function getInfo() {
	echo '顺义...<br>';
}

namespace China\Beijing;
function getInfo() {
	echo '北京...<br>';	
}
//访问空间元素的三种方式
getInfo();					//非限定名称访问	北京...			
\China\Beijing\getInfo();	//完全限定名称访问		北京...
Shunyi\getInfo();			//限定名称访问		顺义...
//转成绝对路径如下：
// \China\Beijing\Shunyi\getInfo();

