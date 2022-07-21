<?php
class A {
	public function __construct() {
		var_dump($this);
	}
}
class B extends A {
	
}
new A();	//object(A)#1 (0) { } 
echo '<br>';
new B();	//object(B)#1 (0) { } 

