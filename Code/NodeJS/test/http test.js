const http = require('http');
const server = http.createServer();
// server.on('request', function(req, res) {
//     res.writeHead(200, {'Content-Type': 'text/plain'});
//     res.end(   'Hello World\n');
// })
// server.on('listening', function(req) {
//     console.log(`Your request url is ${req.url}, adn request method is ${req.method}`);
// })
// server.on("request", function(req, res) {
//     res.writeHead(200, {'Content-Type': 'text/plain'});
//     res.end(   'Hello World\n');
// })
server.on('request', function(req, res) {
    const url = req.url;
    let content = '404 not found';
    if (url === '/' || url === '/index') {
        content = 'you\'re at index page';
    }
    if (url === '/about') {
        content = 'you\'re at about page';
    }
    res.writeHead(200, {'Content-Type': 'text/plain'});
    res.end(content);
})
server.listen(3000, function() {
    console.log('Server is running at http://localhost:3000');
})