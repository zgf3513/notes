// const fs = require('fs');
// const filePath = 'test1.txt';
// const data = '写入了一段文字';
// fs.writeFile(filePath, data, function(err) {
//     if (err) {
//         return console.log(err);
//     }
//     console.log('文件 ' + filePath + ' 已保存');
// })
// fs.readFile(filePath,'utf8', function (err, data) {
//     if (err) {
//         return console.log('文件读取失败\n'+err);
//     }
//     console.log(data);
// })
const path = require('path');
const pathStr = path.join('/a', '/b/c', '../d/e/f', 'g');
console.log(pathStr);

const pathStr2 = path.join(__dirname, '../test1.txt');
console.log(pathStr2);

const fpath = 'test1.txt';

const fullName = path.basename(fpath);
console.log(fullName);

const nameWithoutExt = path.basename(fpath, '.txt');
console.log(nameWithoutExt);

const fpath2 = 'test1.txt';
const ext = path.extname(fpath2);
console.log(ext);