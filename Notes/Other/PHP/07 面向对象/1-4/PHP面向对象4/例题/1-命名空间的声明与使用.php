<?php
namespace China;	//定义命名空间
function getInfo() {
	echo '我是中国人<br>';
}

namespace USA;		//定义命名空间
function getInfo() {
	echo 'I am a America<br>';
}
//调用
getInfo();			//I am a America
\USA\getInfo();		//I am a America
\China\getInfo();	//我是中国人
