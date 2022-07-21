const express =require('express');
const app = express();

app.use(express.json());
app.use(express.urlencoded({extended: false}));

app.get('/:id', (req, res) => {
    // 默认情况下，如果不配置解析表单数据的中间件，则req.body默认为 undefined
    console.log(req.body)
    res.send(req.params);
})


app.listen(3000, () => {
    console.log('Server is running on port 3000');
});