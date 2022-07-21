const express = require('express');
const router = express.Router();


router.get('/get/:id', (req, res) => {
    res.send(req.params);
});

module.exports = router;