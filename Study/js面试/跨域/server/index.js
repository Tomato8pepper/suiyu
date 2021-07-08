const http = require('http')

http.createServer((req, res) => {
    if(req.url.includes('/api')) {
        let json = {
            code: 0
        }
        res.end(`${JSON.stringify(json)}`)
    } else {
        res.end('');
    }
})
.listen(8088, () => {
    console.log(8088);
})