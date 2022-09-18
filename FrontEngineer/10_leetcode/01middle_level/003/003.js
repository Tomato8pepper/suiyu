/*[003.无重复字符的最长子串](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)
    Algorithm description: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    输入: "abcabcbb"
    输出: 3 
    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
*/




var lengthOfLongestSubstring = function (s) {
    const set = new Set()
    let i = 0, j = 0, maxLength = 0
    if (s.length === 0) {
        return 0
    }

    for (i; i < s.length; i++) {
        if (!set.has(s[i])) {
            set.add(s[i])
            maxLength = Math.max(maxLength, set.size)

        }
        else {
            while (set.has(s[i])) {
                set.delete(s[j])
                j++
            }
            set.add(s[i])
        }
    }
    return maxLength
}