let getNowFormatDate = function() {
    var date = new Date()
    var year = date.getFullYear()
    var month = date.getMonth() + 1
    var day = date.getDate()
    if(month >= 1 && month <= 9) {
        month = "0" +　month

    }
    if(day >= 1 && day <= 9 ) {
        day = "0" + day
    }

    var currentDate = year + '年' + month +　'月' + day + '日'
    return currentDate
}

module.exports = {
    getNowFormatDate
}

