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