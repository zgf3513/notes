const express =require('express');
const cors = require('cors');
const APIRouter = require('./APIRouter');

const app = express();
app.use(cors());
app.use('/api', APIRouter);

app.listen(3000, () => {
    console.log('Server is running on port http://localhost:3000');
});