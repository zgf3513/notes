/**
 * 读取html 1，2，3的内容
 */

const fs = require('fs');
const util = require('util');
const readFileAsync = util.promisify(fs.readFile);

// 普通办法
// fs.readFile('./resources/1.html', 'utf8', (err, data1) => {
//     if (err) {
//         console.log(err);
//     } else {
//         fs.readFile('./resources/2.html', 'utf8', (err, data2) => {
//             if (err) {
//                 console.log(err);
//             } else {
//                 fs.readFile('./resources/3.html', 'utf8', (err, data3) => {
//                     if (err) {
//                         console.log(err);
//                     } else {
//                         console.log(`${data1}${data2}${data3}`);
//                     }
//                 });
//             }
//         });
//     }
// });

// async/await办法
async function readFile() {
    try {
        let data1 = await readFileAsync('resources/1.html', 'utf8');
        let data2 = await readFileAsync('resources/2.html', 'utf8');
        let data3 = await readFileAsync('resources/3.html', 'utf8');
        return `${data1}${data2}${data3}`;
    }catch (err) {
        console.log(err);
    }
}

readFile().then(data => {
    console.log(data);
}, err => {
    console.log(err);
})