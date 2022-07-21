const express =require('express');
const app = express();

const mw1 = function (req, res, next) {
    console.log('middleware1');
    next();
}

app.get('/mw1', mw1, (req, res) => {
    console.log('mw1');
    res.send(req.params);
});

app.get('/mw2', (req, res) => {
    throw new Error('mw2');
    res.send(req.params);
});

app.use(function (err, req, res, next) {
    console.log('mwerr');
    next(err);
});


app.listen(3000, () => {
    console.log('Server is running on port 3000');
});