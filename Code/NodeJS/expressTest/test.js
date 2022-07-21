const express = require('express');

const app = express()

app.get('/', (req, res) => {
    const data = req.query;
    console.log(data);
    res.send(data);
});

app.get('/:id', (req, res) => {
    const params = req.params;
    console.log(params);
    res.send(params);
});

app.listen(3000, () => {
    console.log('Server is running on port 3000');
});