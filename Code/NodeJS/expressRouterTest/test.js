const express = require('express');
const app = express();

const mw1 = function (req, res, next) {
    console.log('middleware1');
    next();
}
app.use(mw1);

const mw2 = function (req, res, next) {
    console.log('middleware2');
    next();
}
app.use(mw2);

const router = require('./router');
app.use('/test', router);

// app.use((req, res,next) => {
//     res.send('全局中间件简易模式');
//     next();
// });

app.listen(3000, () => {
    console.log('Server is running on port 3000');
});
