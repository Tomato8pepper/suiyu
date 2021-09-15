import { getUrl } from './helper.js'

const getSeller = getUrl('/api/seller')
const getGoods = getUrl('/api/goods')


export {
    getSeller,
    getGoods
}