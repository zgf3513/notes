const express = require('express');
const router = express.Router();

router.get('/', (req, res) => {
    res.send({
        code: 200,
        msg: 'get:load router api success'
    });
});

router.get('/get/:id', (req, res) => {
    res.send({
        code: 200,
        msg: `get: ${req.params.id}`
    });
});

router.post('/add/:id', (req, res) => {
    res.send({
        code: 200,
        msg: `post: ${req.params.id}`
    });
});

module.exports = router;
