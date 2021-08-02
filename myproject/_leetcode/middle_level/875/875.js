/* @param {number[]} piles
   @param {number} H
   @return {number} */
function canEatAllBananas(piles, H, mid) {
    let h = 0;
    for (let pile of piles) {
        h += Math.ceil(pile / mid);
    }

    return h <= H;
}
var minEatingSpeed = function (piles, H) {
    let lo = 1,
        hi = Math.max(...piles);
    // [l, r) ， 左闭右开的好处是如果能找到，那么返回 l 和 r 都是一样的，因为最终 l 等于 r。
    while (lo <= hi) {
        let mid = lo + ((hi - lo) >> 1);
        if (canEatAllBananas(piles, H, mid)) {
            hi = mid - 1;
        } else {
            lo = mid + 1;
        }
    }

    return lo; //  不能选择hi
};