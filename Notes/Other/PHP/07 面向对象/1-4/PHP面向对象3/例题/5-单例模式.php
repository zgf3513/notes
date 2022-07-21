<?php
//三私一公
class DB {
	//静态的属性用来保存对象的单例
	private static $instance;
	//私有的构造方法阻止在类的外部实例化
	private function __construct() {
		
	}
	//私有的__clone()阻止在类的外部clone对象
	private function __clone() {
		
	}
	public static function getInstance() {
		//保存的值不属于DB类的类型就实例化
		if(!self::$instance instanceof self)
			self::$instance=new self();
		return self::$instance;
	}
}
//测试
$db1=DB::getInstance();
$db2=DB::getInstance();
var_dump($db1,$db2);	//object(DB)#1 (0) { } object(DB)#1 (0) { } 


