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