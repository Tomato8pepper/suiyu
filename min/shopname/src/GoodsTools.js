let obj = {
    goodsObj:{'1': 1, '2': 2},
    addShopcart({id,num}){
        // 新加key或者追加value
        if(this.goodsObj[id]) {
            this.goodsObj[id] += num;
        } else {
            this.goodsObj[id] = num;
        }
        console.log(this.goodsObj);
    },
    deleteGoods(){

    }
}
window.test = obj;
export default obj;