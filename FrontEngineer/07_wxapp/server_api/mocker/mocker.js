module.exports = {      //向外输出一个反馈
    'GET /articles'(req, res){ 
        return res.json({
            code: 0,
            articles: [{
              date: '7-22',
              items: [{
                title: 'aaaa',
                pic: 'https://puui.qpic.cn/vpic/0/l0034780bcp_160_90_3.jpg/0',
                id: 1
              }, {
                title: 'bbbb',
                pic: 'https://puui.qpic.cn/vpic/0/l0034780bcp_160_90_3.jpg/0',
                id: 2
              }, {
                title: 'ccc',
                pic: 'https://puui.qpic.cn/vpic/0/l0034780bcp_160_90_3.jpg/0',
                id: 3
              }]
            }, {
              date: '7-21',
              items: [{
                title: 'dddd',
                pic: 'https://puui.qpic.cn/vpic/0/l0034780bcp_160_90_3.jpg/0',
                id: 4
              }, {
                title: 'eeee',
                pic: 'https://puui.qpic.cn/vpic/0/l0034780bcp_160_90_3.jpg/0',
                id: 5
              }, {
                title: 'ffff',
                pic: 'https://puui.qpic.cn/vpic/0/l0034780bcp_160_90_3.jpg/0',
                id: 6
              }]
            }]
          })
    }
}    