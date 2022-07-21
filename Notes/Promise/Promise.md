来源：尚硅谷https://www.bilibili.com/video/BV1GA411x7z1

# Promise

## 1、promise是什么

### 1.1、理解

1、抽象表达：

1. Promise是一门新的技术（ES6规范）

2. Promise是JS中进行异步编程的新解决方案

   备注：旧解决方案是单纯使用回调函数

2、具体表达

1. 从语法上来说：Promise是一个构造函数
2. 从功能上来说：Promise对象用来封装一个异步操作并可以获取其成功 失败的结果值

3、异步编程

fs文件操作

数据库操作

Ajax

定时器



## 2、为什么要使用Promise

### 2.1、指定回调函数的方式更加灵活

* 旧的：必须在启动异步任务前指定
* promise：启动异步任务 => 返回promise对象 => 给promise对象绑定回调函数（甚至可以在异步任务结束后指定/多个）

### 2.2、支持链式调用，可以解决回调地狱问题

1. 什么是回调地狱问题？
   回调函数嵌套使用，外部回调函数异步执行的结果是嵌套的回调执行条件
2. 回调地狱的缺点
   不便于阅读，不便于异常处理
3. 解决方案
   promise链式调用    #面试重点
4. 终极解决方案

## 3、初体验

### 3.1、案例

```html
<input type="button" value="抽奖" id="btn">

<script>
    function random(m,n){
        return Math.floor(Math.random()*(n-m+1)+m-1);
    }

    const btn = document.querySelector('#btn');

    btn.addEventListener('click',function(){

        /*setTimeout(()=>{
            let num = random(1,10);
            if(num === 1){
                alert('恭喜你中奖了');
            }else{
                alert('很遗憾，没有中奖');
            }
        },1000);*/

        // promise 形式实现
        // resolve（解决） 和 reject（拒绝） 都是函数类型的数据，只能调用一次
        const promise = new Promise((resolve, reject) => {
            setTimeout(()=>{
                let num = random(1,10);
                if(num === 1){
                    resolve();  // 将resolve的状态设置为成功
                }else{
                    reject(); // 将resolve的状态设置为失败
                }
            },1000);
        });
        // 调用then方法，传入两个函数，一个是resolve，一个是reject
        promise.then(
            ()=>{alert('恭喜你中奖了');},
            () => {alert('很遗憾，没有中奖')}
        ).catch(function(err){
            alert(err);
        });
    });
</script>
```

Promise传值

```javascript
const promise = new Promise((resolve, reject) => {
            setTimeout(()=>{
                let num = random(1,10);
                if(num === 1){
                    resolve(num);  // 将resolve的状态设置为成功
                }else{
                    reject(num); // 将resolve的状态设置为失败
                }
            },1000);
        });
        // 调用then方法，传入两个函数，一个是resolve，一个是reject
        promise.then(
            (data)=>{alert(`恭喜你中奖了，奖号为：${data}`);},
            (data) => {alert(`很遗憾，没有中奖，奖号为：${data}`);}
        ).catch(function(err){
            alert(err);
        });
```

Promise Node.js

```javascript
const fs = require('fs');

/*fs.readFile('./resources/content.txt', 'utf8', (err, data) => {
    if (err) {
        throw err;
    } else {
        console.log(data);
    }
})*/

// Promise 方式
let promise = new Promise((resolve, reject) => {
    fs.readFile('./resources/content.txt', 'utf8', (err, data) => {
        if (err) {
            reject(err);
        } else {
            resolve(data);
        }
    })
});
promise.then(
    (data) => {console.log(data)},
    (err) => {console.log(err)}
)
```

Promise Ajax

```html
<input type="button" id="btn" value="GET">
<script>
    const url = '';
    const btn = document.querySelector('#btn');

    btn.addEventListener('click', function () {
        const p = new Promise((resolve, reject) => {
            // 创建一个ajax对象
            const xhr = new XMLHttpRequest();
            // 设置请求方式和请求地址
            xhr.open('GET', url);
            // 发送
            xhr.send();
            // 设置回调函数
            xhr.onreadystatechange = function () {
                if (xhr.readyState === 4 && xhr.status >= 200 && xhr.status < 300) {
                    resolve(xhr.response);
                } else {
                    reject(`请求失败 ${xhr.status}`);
                }
            };
        });
        p.then(
            (data) => {
                alert(data);
            },
            (err) => {
                alert(err);
            }
        );
    });
</script>
```

Promise 封装

```javascript
/**
 * 封装一个函数读取文件内容
 * 参数：path 文件路径
 * 返回：Promise 对象
 */
const fs = require('fs');

function readFile(path) {
    return new Promise((resolve, reject) => {
        fs.readFile(path, 'utf8', (err, data) => {
            if (err) {
                reject(err);
            } else {
                resolve(data);
            }
        })
    })
}

readFile('./resources/content.txt').then(
    (data) => {console.log(data)},
    (err) => {console.log(err)}
)
```

```javascript
/**
 * util.promisify使用
 */
const fs = require('fs');
const util = require('util');

// 返回一个新的函数  --> promise 对象
let readFile = util.promisify(fs.readFile);

readFile('./resources/content.txt').then(
    (data) => {console.log(data.toString())},
    (err) => {console.log(err)}
)
```

```javascript
  function sendAjax(utl){
    return new Promise(
        (resolve, reject) => {
            const xhr = new XMLHttpRequest();
            xhr.open('GET', url);
            xhr.send();
            xhr.onreadystatechange = function(){
                if(xhr.readyState === 4 && xhr.status >= 200 && xhr.status < 300){
                    resolve(xhr.response);
                }else{
                    reject(`请求失败 ${xhr.status}`);
                }
            };
        }
    )
  }
  sendAjax('https://www.xxx.com').then(
      (data) => {
          alert(data);
      },
      (err) => {
          alert(err);
      }
  );
```

### 3.2、Promise的状态改变

1. pending（未决定的）变为resolved / fullfilled（成功）
2. pending变为rejected（失败）

说明：只有这两种，且一个promise对象只能改变一次

无论变为成功还是失败，都会有一个结果数据

成功的结果数据一般为value，失败的结果数据一般为reason

### 3.3、Promise对象的值

实力对象中的另一个属性 PromiseResult

保存着异步任务对象成功或者失败的结果

* resolve
* reject

### 3.4、Promise的基本流程

![Desktop Screenshot 2022.07.20 - 23.37.20.79](C:/Users/Administrator/Videos/Desktop/Desktop%20Screenshot%202022.07.20%20-%2023.37.20.79.png)

## 4、如何使用Promise

### 4.1、API

1. Promise构造函数：Promise(executor){}

   1. executor函数：执行器 (resolve,rejecte) => {}
   2. resolve函数：内部定义成功时我们调用的函数 value => {}
   3. rejecte函数：内部定义失败时我们调用的函数 reason => {}

   说明：executor会在Promise内部立即同步调用，异步执行器中执行

2. Promise.prototype.then方法：(onResolved, onRejected) => {}

   1. onResolved函数：成功的回调函数 (value) => {}
   2. onRejected函数：失败的回调函数 (reason) => {}

   说明：指定用于得到成功value的成功回调和用于得到失败reason的失败回调返回一个新的promise对象

3. Promise.prototype.catch方法：(onRejected) => {}

   1. onRejected函数：失败的回调函数 (reason) => {}

   说明：then()的语法糖相当于：then(undefined,onRejected)

4. Promise.resolve方法：(value) =>{}

   1. value：返回成功的数据或promise对象

   说明：返回一个成功/失败的promise对象 如果传入的参数为非promise类型的对象，则返回的结果为成功的promise对象；如果传入的参数为promise对象，则参数的结果决定了resolve的结果，即传入的promise对象成功，则返回成功，传入的promise对象失败，则返回失败

5. Promise.reject方法：(reason) => {}

   1. reason：失败的原因

   说明返回一个失败的promise对象

6. Promise.all方法：(promise) => {}

   1. promise：包含n个promise得到数组

   说明：返回一个新的promise，只有所有的promise都成功才成功，只要有一个失败了就直接失败，且结果就为失败的这个promise的结果

7. Promise.race方法：(promise) => {}

   1. promise：包含了n个promise的数组

   说明：返回一个新的promise，第一个完成的promise结果状态就是最终的结果状态

### 4.2、Promise的几个关键问题

1. 如何改变promise的状态

   1. resolve(value)：如果当前是pending就会变为resolved
   2. reject(reason)：如果当前是pending就会变为rejected
   3. 抛出异常：如果当前是pending就会变为rejected

2. 一个promise指定多个成功/失败回调函数都会调用吗？

   当promise改变为对应状态时都会调用，即promise状态变为resolve或rejecte后，then才会回调，否则不执行

3. 改变promise状态和指定回调函数谁先谁后

   1. 都可能，正常情况下是先指定回调再改变状态，但也可以先改变状态再指定回调

   2. 如何先改变状态再指定回调

      1. 在执行中直接调用resolve()/reject()
      2. 延迟更长时间才调用then()

   3. 什么时候才能得到数据

      1. 如果先指定的回调，那当状态发生改变时，回调函数就会调用，得到数据
      2. 如果先改变的状态，那当指定回调时，回调函数就会被调用，得到数据

4. promise.then()返回新的promise的结果状态由什么决定

      1. 简单表达：由then()指定的回调函数执行的结果决定
      2. 详细表达：

         1. 如果抛出异常，新promise变为rejected，reason为抛出的异常
         2. 如果返回的时非promise的任意值，新promise变为resolved，value返回的值
         3. 如果返回的是另一个新的promise，此promise的结果就会成为新promise的结果

5. promise如何连多个操作任务？

      1. 通过promise的then()返回一个新的promise，可以开成then()的链式调用
      2. 通过then()的链式调用串联多个同步/异步任务

6. promise异常穿透

      1. 当前使用promise的then链式调用时，可以在最后指定失败的回调
      2. 前面任何操作出了异常，都会传到最后失败的回调中处理

7. 中断promise链

      1. 当使用promise的then链式调用时，在中间中断，不在调用后面的回调函数
      2. 办法：在回调函数中返回一个pendding状态的promise对象

## 5、自定义Promise

```javascript
class Promise{
    constructor(executor){
        // 添加属性
        this.status = 'pending';    // 初始状态
        this.value = undefined;   // 初始值
        this.callbacks = [];    // 回调函数
        let self = this;    // 保存this

        function callback(status, value) {
            // 如果状态是pending，则改为对应status
            if (self.status === 'pending') {
                self.status = status;
                self.value = value;
            }
            // 如果有回调函数，则执行回调函数
            setTimeout(() => {
                if (self.callbacks.length > 0) {
                    self.callbacks.forEach(callback => {
                        callback.reject(value);
                    })
                }
            });
        }

        function resolve(value) {
            callback('resolved', value);
        }

        function reject(value) {
            callback('rejected', value);
        }

        // 同步调用执行器函数
        try {
            executor(resolve, reject);
        } catch (e) {
            reject(e)
        }
    }

    // then方法
    then(onResolve, onRejected) {
        const self = this;
        // 判断回调函数的参数
        if (typeof onResolve !== 'function') {
            onResolve = value => value; // 等同于 value => {return value}
        }
        if (typeof onRejected !== 'function') {
            onRejected = reason => {
                throw reason;
            };
        }
        return new Promise((resolve, reject) => {
            function callback(status) {
                try {
                    // 执行成功的回调函数
                    let result = status(self.value);
                    // 如果回调函数返回的是promise，则继续执行promise的then函数
                    if (result instanceof Promise) {
                        result.then(resolve, reject);
                    } else {
                        resolve(result);
                    }
                } catch (e) {
                    reject(e);
                }
            }

            // 如果状态是resolved，则执行onResolve函数
            if (this.status === 'resolved') {
                setTimeout(() => {
                    callback(onResolve);
                });
            }
            // 如果状态是rejected，则执行onRejected函数
            if (this.status === 'rejected') {
                setTimeout(() => {
                    callback(onRejected);
                });
            }
            // 如果状态是pending，则添加回调函数
            if (this.status === 'pending') {
                this.callbacks.push({
                    resolve: function () {
                        callback(onResolve);

                    },
                    reject: function () {
                        callback(onRejected);
                    }
                });
            }
        });
    }

    // catch方法
    catch(onRejected) {
        return this.then(undefined, onRejected);
    }

    // resolve方法
    static resolve(value) {
        return new Promise((resolve, reject) => {
            if (value instanceof Promise) {
                value.then(resolve, reject);
            } else {
                resolve(value);
            }
        });
    }

    // reject方法
    static reject(reason) {
        return new Promise((resolve, reject) => {
            reject(reason);
        });
    }

    // all方法
    static all(promises) {
        return new Promise((resolve, reject) => {
            let results = [];
            let count = 0;
            promises.forEach((promise, index) => {
                promise.then(result => {
                    results[index] = result;
                    count++;
                    if (count === promises.length) {
                        resolve(results);
                    }
                }, reject);
            });
        });
    }

    // race方法   感觉是由bug的，和官方的不一样，按照前面的案例，应该是res2的结果
    static race(promises) {
        return new Promise((resolve, reject) => {
            promises.forEach((promise) => {
                promise.then(resolve, reject);
            })
        })
    }
}
```

## 6、async与await

### 6.1、async 函数

* 函数的返回值为promise对象
* promise对象的结果由async函数执行的返回值决定：如果返回值是一个非promise对象，则返回成功的promise对象，值为返回的值；如果返回的是promise对象，则由返回的promise决定；抛出异常则为失败的promise对象，值为抛出的结果

### 6.2、await 函数

* await右侧的表达式一般为promise对象，但也可以是其他的值
* 如果表达式是promise对象，await返回的是promise成功的值
* 如果表达式是其他的值，直接将此值作为await的返回值

6.3、注意：

* await必须写在async函数中，但async函数中可以没有await
* 如果await的promise失败了，就会抛出异常，需要通过try-catch捕获异常