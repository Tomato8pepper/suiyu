let response = `
<html>
<head>
<body>
    <div></div>
</body>
</head>
</html>
`

//解析成DOM树
// 分词(词法分析) (FSM) -> 语法分析(LL LR) -> AST(抽象语法树)(DOM树)
//var a = 'string'
//拿出标签名(开始  结束)
let currentToken = null;
function parseDom(html) {
    let state = data;
    for (let c of html) {
        state = state(c);
    }
}
function data(c) {
    if (c === '<') {
        return tagOpen
    }
    return data;
}
function tagOpen(c) {
    if (c === '/') {
        currentToken = {
            type: 'endTag',
            tagName: ''
        }
        return tagName;
    } else {
        currentToken = {
            type: 'startTag',
            tagName: c
        }
        return tagName;
    }

}
// <  tagOpen  tagName >
function tagName(c) {
    if (c.match(/[a-z]/)) {
        currentToken.tagName += c;
        return tagName;
    } else if (c === '>') {
        console.log(currentToken);
        return data;
    }
    // else if (c === '/')
}

parseDom(response);