来源：哔哩哔哩 狂神

## 1、什么是JavaScript

### 1.1、概述

ECMAScript是JavaScript的一个标准

最新版本已经达到es6

但大部分浏览器还停留在es5代码

开发环境--线上环境，版本不一致

## 2、快速入门

### 2.1、引入JavaScript

1、内部标签使用

```js
<script>
    //....
</script>
```

2、外部标签使用

1.js

```

```

1.html

```
<script src="1.js"></script>
```

测试代码

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<!--    script标签内写js-->
<!--    外部引入-->
<!--    注意:script标签必须成对出现-->
    <script src="js/1-1.js"></script>
</head>
<body>

</body>
</html>
```

```
alert('hello world');
```

### 2.2、基本语法入门

```js
<script>
        // 严格区分大小写
        // 1.定义变量    变量类型 变量名 = 变量值
        var num = 1;
        // alert(num);
        // 2.条件控制
        if (2>1){
            alert(true);
        }
        // console.Log();   在浏览器控制台打印变量
        
    </script>
```

### 2.3、数据类型

数值，文本，图像，音频，视频

**变量**

```js
var a = 1;
```

**number**

js不区分小数和整数

```
123		// 整数123
123.1	// 浮点数123.1
1.23e1	// 科学计数法
-99		// 负数
NaN		// not a number
Infinity// 表示无限大
```

**String**

```
'abc'
"abc"
```

**Boolean**

```
true
false
```

**逻辑运算**

```
&&	两个都为真，结果为真
||	一个为真，结果为真
!	取反
```

**比较运算符**

```
=
==	等于（类型不一样，值一样，也会判断为true，尽量不要使用）
===	绝对等于（类型一样，值一样，结果为true）
```

*须知：*

* NaN===NaN，咋个与所有的数值都不相等，包括自己
* 只能通过isNaN(NaN)来判断这个数是否是NaN

*浮点数问题：*

```
console.log(1/3===1-2/3);
```

**尽量避免使用浮点数进行运算，存在精度问题**

**null和undefined**

* null	空
* undefined    未定义

**数组**

一系列相同类型的对象

Java中数组必须是相同类型，js中不需要这样

```js
var var = [1,2,3,'hello',null,true];
```

*取数组下标：*如果遇见了就会undefined

**对象**

对象是大括号，数组是中括号

每个属性用“,”隔开，最后一个不需要

```js
var person = {
        name:"张三",age:"18",tags:['1','2','3']
      };
```

取对象的值

```js
person.name
```

### 2.4、严格检查模式

```js
<script>
        // 代表严格检查模式,预览js的随意性导致产生的一些问题,
        // 局部变量建议都是以let去定义
        // 必须卸载js的第一行
        'use strict';
        // ES6  let
        i = 1;
        let i = 1;
    </script>
```

## 3、数据类型

### 3.1、字符串

1、正常字符串使用""双引号或''单引号包裹

2、注意转移字符 \

```js
\'
\n
\t
\u4e2d	unicode字符
\x41	Ascll字符
```

3、多行字符串编写

```js
// tab 上面 esc上面
      var msg = `
      hello
      你好
      1
      2
      `
```

4、模板字符串

```js
let name = "张三";
let  mag = `name=${name}`
```

5、字符串长度

```js
str.length
```

6、字符串的可变性，不可变

7、大小写转换

```
// 注意：这里是方法不是属性了
student.toUpperCase()
student.toLowerCase()
```

8、substring(start,end)

从第一个字符串截取到最后一个字符串，包头不包尾

### 3.2、数组

**Array可以包括任意数据类型**

```js
var arr = [1,2,3]
```

1、长度

```js
arr.length
```

*注意：*加入arr.length赋值，数组大小就会发生变化，如果赋值过小，元素就会丢失

2、indexOf，通过元素获得下标索引

字符串的"1"和数字1是不同的

3、slice(start,end)截取数组Array的一部分返回一个新数组，类似与substring，包头不包尾

4、push()，pop()

```js
push()	压入一个元素到尾部
pop()	弹出尾部的一个元素
```

5、unshift(),shift() 头部

```
unshift()	压入一个元素到头部
shift()		弹出头部的一个元素
```

6、排序sort()

7、元素反转reverse()

8、concat()

并没有修改数组，只是会返回一个新的数组

9、连接符join

打印拼接数组，使用特定的字符串连接

```js
['1','2','3']
arr.join('-')
"1-2-3"
```

10、多维数组

```js
arr = [[1,2],[3,4]]
```

数组：存储数据（如何存，如何取，方法都可以自己实现）

### 3.3、对象

若干个键值对

```js
var 对象名 = {
        属性名:属性值,
        属性名:属性值,
        属性名:属性值
      };
```

js中，(....)表示一个对象，键值对描述属性xxx:xxx，属性之间使用都好隔开，最后一个不加

JavaScript中的所有的键都是字符串，值是任意对象

1、对象赋值的问题

```js
person.name = "张三"
```

2、使用一个不存在的对象属性不会报错，undefined

3、动态删减属性

```js
delete person.name
```

4、动态的添加：直接给新的属性添加值即可

```js
person.haha="haha"
```

5、判断属性值是否在咋个对象中（包括父类）

```
'age' int person
```

6、判断一个属性是否是咋个对象自身拥有的hasOwnProperty()

```
person.hasOwnProperty('toString')
```

### 3.4、流程控制

if判断

```js
if(){

}else if{

}else{

}
```

while循环

```js
while(){

}
do(){
    
}whlie()
```

for循环

```js
for(let i = 0;i < xx;i++){
    
}
```

forEach循环

```js
arr.forEach(function (value){
          console.log(value)
      })
```

for-in循环

```js
for (let arrKey in arr) {
	console.log(arr[arrKey])
}
```

for-of循环

```
for (let number of arr) {
    console.log(number)
}
```

3.5、Map和Set

**ES6的新特性**

Map：

```js
var map = new Map([['tom',1],['张三',2]]);
map.get('tom');			// 通过key获取value
map.set('admin',1234);	// 增加元素
map.delete('tom');		// 删除元素
```

Set：无序不重复的集合

```js
var set = new Set([1,1,2,3,3]);
set.has(1);		// 判断set中是否存在值
set.add(4);		// 增加元素
set.delete(1);	// 删除元素
```

## 4、函数及面向对象

### 4.1、函数定义

#### 4.1.1、绝对值函数

**定义方式一**

```js
function abs(x){
    if(x>=0){
        return x;
    }else if(x<0){
        return -x;
    }
}
```

一旦执行到return代表函数结束，返回结果

如果没有执行return，函数执行也会返回结果，结果就是undefined

**定义方式二**

```js
var abs = function(x){
	if(x>=0){
        return x;
    }else if(x<0){
        return -x;
    }
}
```

这是一个匿名函数，但是可以把结果赋值给前面的变量，通过变量就可以调用函数

**方式一和方式二等价**

#### 4.1.2、参数问题

JavaScript可以传任意个参数也可以不穿参数

参数进来是否存在问题？

假设不存在参数如何规避？

```js
function abs(x){
	if(Typeof x !== 'number'){
        throw 'not a number';
    }
    if(x>=0){
        return x;
    }else if(x<0){
        return -x;
    }
}
```

#### 4.1.3、argument

arguments是一个免费赠送的关键字

代表传递进来的所有参数，是一个数组

```js
function abs(x){
    if(argument.length>1;){
        throw 'argument out of length';
    }
    if(x>=0){
        return x;
    }else if(x<0){
        return -x;
    }
}
```

**问题：**argument会包含所有的参数，我们有时候想要使用多余的参数来进行附加操作，需要排除已有参数

#### 4.1.4、rest

ES6新特性：***获取除了已定义的参数之外的所有参数***

*以前*

```js
if (arguments.length>2){
	for (let i = 0; i < arguments.length; i++) {
	}
}
```

**现在**

```js
function aaa(a,b,...rest){
	console.log(a);
	console.log(b);
	console.log(rest);
}
```

rest参数只能写在最后面，必须用...标识

### 4.2、变量的作用域

在JavaScript中，var定义的变量实际上是有作用域的，假设在函数体内声明，则在函数体外则不可使用---（非要想实现的话后面可以研究*闭包*）

```js
function fun(){
	var x = i;
	x = x +i;
}
 = x+2;
```

如果两个函数使用了相同的变量命名，只要在函数内部，就不冲突。内部函数可以访问外部函数成员，反之则不行

假设在JavaScript中函数查找变量从自身函数开始，由内向外查找，假设外部存在咋个同名的函数变量，则函数会屏蔽外部函数的变量

```js
function fun1(){
	let i = 1;
	function fun2(){
		let i = 'A';
		console.log(i);
	}
}
```

提升变量的作用域

```js
      function fun1(){
          var x = "x"+y;
          console.log(x);
          var y = "y";
      }
```

结果：xundefined

说明js执行引擎自动提升了y的声明，但是不会提升变量y的赋值

```js
      function fun1(){
      	  var y;
          var x = "x"+y;
          console.log(x);
          var y = "y";
      }
```

这个是在JavaScript建立之初就存在的特性。养成规范：所有的变量都放在函数头部，不要乱放，便于代码维护；

```js
function fun1(){
	var x,y,z;
}
```

#### 4.2.1、全局变量window

```js
var x = 'xxx';
alert(x)
alert(window.x);	//默认所有的全局变量，都会自动绑定在window对象下
```

alert()这个函数本身也是一个window变量

```js
      var x = 'xxx';
      window.alert(x);
      var old_alert = window.alert;
      window.alert = function (){

      }
      // 发现alert失效了
      window.alert(123);
      // 恢复
      window.alert = old_alert;
      window.alert(456);
```

JavaScript实际上只有一个全局作用域，仍和变量（函数也可以视为变量），假设没有在函数作用范围内找到，就会向外查找，如果在全局作用域都没有找到，报错*RefrenceError*

***规范：***

由于我们所有的全局变量都会绑定到我们的window上，如果不同的js文件，使用了相同的全局变量，冲突-->如果能够减少冲突？

```js
// 唯一全局变量
var APP = {}
// 定义全局变量
APP.name = "test";
APP.add = function (a,b){
	return a+b;
}
```

把自己的代码全部放入自己定义的唯一空间名字中，降低全局命名冲突为题

#### 4.2.2、局部作用域

```js
function fun(){
	for (var i = 0; i < 100; i++) {
		console.log(i);
 	}
	console.log(i+1);// i出了作用域还可以使用
}
```

ES6 let关键字，解决局部作用域冲突问题

```js
function fun(){
	for (let i = 0; i < 100; i++) {
		console.log(i);
 	}
	console.log(i+1);// uncaught ReferenceError: i is not defind
}
```

建议使用let去定义局部作用域的变量

#### 4.2.3、常量

在ES6之前，怎么定义常量：只要用全部大写字母命名的变量就是常量，建议不要修改这样的值。

在ES6中引入了常量关键字	const

### 4.3、方法

#### 4.3.1、定义方法

方法就是把函数放在对象里面，对象只有两个东西：属性和方法

```js
function getAge(){
    let now = new Date().getFullYear();
    return now-this.birth;
}
var test = {
	name:'张三',
	birth:2000,
	age:function (){
		// 今年年月-出生年月
		let now = new Date().getFullYear()
		return now-this.birth;
	}
}
// 属性
test.name;
// 方法，一定要带()
test.age();
```

this代表什么

```js
function getAge(){
    let now = new Date().getFullYear();
    return now-this.birth;
}
var test = {
	name:'张三',
	birth:2000,
	age:getAge
}

// test.getAge()	ok
// getAge()			NaN window
```

this是无法指向的，是默认指向调用它的那个对象

#### 4.3.2、apply

在js中可以控制this的指向

```js
getAge.apply(test,[]);// 指向了test这个对象,参数为空
```

## 5、内部对象

标准对象

```js
typeof 123
"number"
typeof '123'
"string"
typeof true
"boolean"
typeof NaN
"number"
typeof []
"object"
typeof {}
"object"
typeof Math.abs
"function"
typeof undefined
"undefined"
```

### 5.1、Date

**基本使用**

```js
now.getFullYear();// 年
now.getMonth();// 月   0~11代表月
now.getDate();// 日
now.getHours();// 时
now.getMinutes();// 分
now.getSeconds();// 秒
now.getDay();// 星期
now.getTime()// 时间戳   全世界统一1970年1月1日0时0分0秒开始到现在的毫秒数
new Date(1234567890);// 时间戳转时间
now.toLocaleString();// 输出本地时间
```

**转换**

```js
now.toLocaleDateString()
'2021/11/16'
now.toGMTString()
'Tue, 16 Nov 2021 03:27:24 GMT'
```

### 5.2、JSON

*json是什么？*

JSON(JavaScript Object Notation, JS 对象简谱) 是一种轻量级的数据交换格式。它基于 ECMAScript (欧洲计算机协会制定的js规范)的一个子集，采用完全独立于编程语言的文本格式来存储和表示数据。简洁和清晰的层次结构使得 JSON 成为理想的数据交换语言。 易于人阅读和编写，同时也易于机器解析和生成，并有效地提升网络传输效率。

在JavaScript一切皆对象，任何js支持的类型都可以用JSON来表示

格式：

* 对象都用{}
* 数组都用[]
* 所有的键值对都是用key:value

JSON和js对象的转换

```js
      var user = {
          name:'张三',
          age:18,
          sex:'男'
      }
      // 对象转换为json字符串
      var jsonUser = JSON.stringify(user);
      //json字符串转化为对象
      JSON.parse('{"name": "张三", "age": 18, "sex": "男"}');
```

JSON和js对象的区别

```js
var obj = {a:'hello',b:"hellob"}
var json = '{"a":"hello","b":"hellob"}'
```

### 5.3、Ajax

* 原生的js写法	xhr 异步请求
* jQuery封装好的方法 $("#name").ajax("")
* axios 请求

## 6、面向对象编程

### 6.1、什么是面向对象

JavaScript，Java，C#....面向对象

JavaScript有一些区别

类：模板 原型对象

对象：集体的实例

在JavaScript中需要换一下思维方式

#### 6.1.1、原型：

```js
      var user = {
          name:'张三',
          age:18,
          sex:'男',
          run:function (){
              console.log(this.name+"跑步");
          }
      }

      var lisi={
          name: '李四'
      }

      // 原型对象
      lisi.__proto__ = user;
```

#### 6.1.2、class继承

class关键字在ES6引入的

```js
      // 定义一个学生类
      class Student{
          constructor(name) {
              this.name = name;
          }
          hello(){
              alert('hello');
          }
      }
var zhangsan = new Student('张三');
zhangsan.hello();
```

继承

```js
      // 定义一个学生类
      class Student{
          constructor(name) {
              this.name = name;
          }
          hello(){
              alert('hello');
          }
      }
      class pupil extends Student{
          constructor(name,grade) {
              super(name);
              this.grade = grade;
          }
          
          myGrade(){
              alert('我的成绩'+this.grade);
          }
      }

      var zhangsan = new Student('张三');
      var xiaohong = new pupil('小红',100);
```

本质：查看对象类型

#### 6.1.3、原型链

proto

![image-20211116121103523](E:\Notes\JavaScript\img\image-20211116121103523.png)

## 7、操作BOM对象（重点）

### 7.1、浏览器介绍

JavaScript和浏览器的关系

JavaScript的诞生就是为了让他能够在浏览器中运行

BOM：浏览器对象模型

* IE 6~12
* Chrome
* Safari
* FireFox
* Opera
* 第三方：QQ浏览器，360浏览器

### 7.2、window

window代表浏览器窗口

```js
window.innerHeight
275
window.innerWidth
1258
window.outerHeight
725
window.outerWidth
1272
// 窗口内部高度和外部高度
```

#### 7.2.1、Navigator

Navigator，封装了浏览器的信息

```js
navigator.appCodeName
'Mozilla'
navigator.appVersion
'5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36'
navigator.platform
'Win32'
```

大多数时候不会使用navigatior对象，因为会被人为修改

不建议使用这些属性来判断和编写代码

#### 7.2.2、screen

代表屏幕的尺寸

```js
screen.width
1536
screen.height
864
```

#### 7.2.3、location

location代表当前页面的URL信息

```js
host:主机
href:链接
protocol:协议
reload:f reload()刷新网页
location.assign('url')跳转
```

#### 7.2.4、document

document代表当前页面，HTML，DOM文档书

获取具体的文档数结点

获取cookie

```js
document.cookie
```

劫持cookie的原理

```js
<script src="aaa.js"></script>
恶意获取cookie上传到他的服务器
```

服务器端可以设置cookie：httpOnly

#### 7.2.5、history

history代表浏览器的历史记录

```js
history.back()		后退
history.forward()	前进
```

## 8、操作DOM对象（重点）

DOM：文档对象模型

核心：

浏览器网页就是一个Dom树形结构

* 更新：更新Dom节点
* 遍历Dom节点：得到Dom节点
* 删除：删除一个Dom节点
* 添加：添加一个新的节点

要操作哟个Dom节点就必须先获得咋个Dom节点

### 8.1、获得Dom节点

```js
      let p1 = document.getElementById('p1');
      let p2 = document.getElementsByClassName('p2');
      let h1 = document.getElementsByTagName('h1');
      let father = document.getElementById('father');
      // 获取父节点下所有子节点
      let children = father.children;
      father.firstChild;
      father.lastChild;
```

这是原生代码，之后尽量使用jQuery

8.2、更新Dom节点

操作文本

* div1.innerText = '123'	修改文本的值
* div1.innerHTML='<strong>123</strong>'	可以解析HTML文本标签

操作JS

* id1.style.color = 'yellow';// 属性使用字符串包裹
* id1.style.fontsize= '20px';// - 转 驼峰命名问题
* id1.style.padding = '2em‘

### 8.2、删除节点

删除节点的步骤：先获取父节点，再通过父元素删除自己

```js
<body>
<div id="father">
    <h1>标题1</h1>
    <p id="p1">p1</p>
    <p class="p2">p2</p>
</div>
  <script>
      'use strict';
      var self = document.getElementById('p1')
      var father = self.parentElement;
      father.removeChild(self)
  </script>
```

注意：删除多个节点的时候，children是在时刻变化的，删除节点的时候一定要注意

### 8.3、插入节点

我们获得了某个Dom节点，假设咋个Dom节点，我们通过InnerHTML就可以增加一个元素了，但是如果咋个Dom节点已经存在元素了，我们就不能能这么干了，会产生覆盖

追加

```js
<body>
<p id="js">js</p>
<div id="list">
    <p id="se">JavaSE</p>
    <p id="ee">JavaEE</p>
    <p id="me">JavaME</p>
</div>
  <script>
      var js = document.getElementById('js');
      var list = document.getElementById('list');
      list.appendChild(js);// 追加到后面
  </script>
```

创建一个新的标签，实现插入

```js
<div id="list">
    <p id="se">JavaSE</p>
    <p id="ee">JavaEE</p>
    <p id="me">JavaME</p>
</div>
<script>
var list = document.getElementById('list');
    // 通过js创建一个新节点
    var newP = document.createElement('p');// 创建一个p标签
    newP.id = 'newP';
    newP.innerText = 'hello';
    list.appendChild(newP)
</script>
```

### 8.4、插入前面

insert

```js
<p id="js">js</p>
<div id="list">
    <p id="se">JavaSE</p>
    <p id="ee">JavaEE</p>
    <p id="me">JavaME</p>
</div>
<script>
    var ee = document.getElementById('ee');
    var js = document.getElementById('js');
    var list = document.getElementById('list');
    // 要包含的节点.insertBefore(新节点,目标节点)
    list.insertBefore(js,ee);
</script>
```

## 9、操作表单（验证）

表单是什么	form DOM树

* 文本框 text
* 下拉框 select
* 单选框 radio
* 多选框 checkbox
* 隐藏域 hidden
* 密码框 password
* ......

表单的目的：提交信息

```js
<form method="post">
    用户名<input type="text" id="username">
    <br>
    性别
    <input type="radio" name="sex" value="男" id="boy">男
    <input type="radio" name="sex" value="女" id="girl">女
</form>
<script>
    var input_text = document.getElementById('username');
    var boy = document.getElementById('boy');
    var girl = document.getElementById('');
    // 得到输入框的值
    input_text.value;
    // 修改输入框的值
    input_text.value='123';

    // 对于单选框，多选框等固定的值只能获取当前的值
    boy.checked;// 查看返回的结果是否为true，如果为true，则代表已选择
```

```js
<!--绑定表单提交时间-->
<!--onsubmit是一个提交的函数-->
<form action="#" method="post" onsubmit="cl()">
    账号<input type="text" id="user"><br>
    密码<input type="password" id="pass"><br>
    <input type="hidden" id="md5-pass" name="pass">
    <input type="submit">
</form>
<script>
   function cl(){
       var name = document.getElementById('user');
       var pass = document.getElementById('pass');
       var md5pass = document.getElementById('pass');
       console.log(name.value);
       // MD5算法
       md5pass.value = md5(pass.value);
       console.log(md5(pass.value));
       //可以校验判断表单
       return false;
   }
</script>
```

## 10、jQuery

JavaScript和jQuery：库

jQuery里存在大量的JavaScript函数

#### 10.1、获取

```
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
```

或者官网下载

文档：https://jquery.cuishifeng.cn/

jQuery公式

```
公式：$(selector).action// 选择器就是css的选择器
```

#### 10.2、初体会

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
公式：$(selector).action
<a href="" id="test">点我</a>
<a href="" class="test">点我</a>
<script>
    //选择器就是css的选择器
    $('#test').click(function (){alert('hello')})
    $('.test').click(function (){alert('hello')})
</script>
</body>
</html>
```

#### 10.3、选择器

```js
    // 原生js
    // 标签选择器
    // document.getElementsByTagName()
    // id选择器
    // document.getElementById()
    // 类选择器
    // document.getElementsByClassName()
    // jQuery   css中的选择器都能使用
    // $('p')   标签选择器
    // $('#id') id选择器
    // $('.class')  class选择器
```

#### 10.4、事件

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
获取鼠标当前的坐标
<div id="move" style="width: 500px;height: 500px;background: gray">
在这里移动鼠标试试
</div>
<script>
    //当网页元素加载完毕后相应事件
    $(function (){
        $('#move').mousemove(
            function (e){
                $('#move').text('x:'+e.pageX+'y:'+e.pageY);
            }
        )
    });
</script>
</body>
</html>
```

#### 10.5、操作DOM

```js
<ul id="ul">
    <li class="1">1</li>
    <li name="2">2</li>
</ul>
<script>
    $('#ul li[name=2]').text()//获得值
    $('#ul li[name=2]').text('')//设置值
    $('#ul li[name=2]').html();//获得值
    $('#ul li[name=2]').html('<strong>123</strong>');//设置值
</script>
```

css的操作

```js
$('#ul li[name=2]').css("color","red");
```

元素的显示和隐藏：本质	display:none;

```js
$('#ul li[name=2]').show()
$('#ul li[name=2]').hide()
```

**未来Ajax();**

```js
$('#id').ajax
```

Layui--layer

Element-ui

Ant-Design

