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