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
