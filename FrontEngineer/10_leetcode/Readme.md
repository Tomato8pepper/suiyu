[百度翻译](https://fanyi.baidu.com/)    
  
[Offical website](https://leetcode-cn.com/)     
[The detail explanation of github](https://github.com/azl397985856/leetcode)   
[The detail explanation of animation](https://github.com/MisterBooo/LeetCodeAnimation)  
[dynamic programming](https://www.bilibili.com/video/BV1GE411M7d4?from=search&seid=6838789658306410828)
[The green dot](https://leetcode-cn.com/u/yu-sui-jiang-nan-1/)

[875.爱吃香蕉的珂珂](https://leetcode-cn.com/problems/koko-eating-bananas/)
    Algorithm description:
        珂珂喜欢吃香蕉。这里有 N 堆香蕉，第 i 堆中有 piles[i] 根香蕉。警卫已经离开了，将在 H 小时后回来。珂珂可以决定她吃香蕉的速度 K （单位：根/小时）。每个小时，她将会选择一堆香蕉，从中吃掉 K 根。如果这堆香蕉少于 K 根，她将吃掉这堆的所有香蕉，然后这一小时内不会再吃更多的香蕉。珂珂喜欢慢慢吃，但仍然想在警卫回来前吃掉所有的香蕉。返回她可以在 H 小时内吃掉所有香蕉的最小速度 K（K 为整数）。
            输入: piles = [3,6,7,11], H = 8
            输出: 4




[005.最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)
    Algorithm description:
        给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
            输入: "babad"
            输出: "bab"
            注意: "aba" 也是一个有效答案。      



[011. 盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/description/)
    Argorithm description:
        给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
        说明：你不能倾斜容器，且 n 的值至少为 2。
            输入：[1,8,6,2,5,4,8,3,7]
            输出：49



[015. 三数之和](https://leetcode-cn.com/problems/3sum/)
    Argorithm description:
        给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
        注意：答案中不可以包含重复的三元组。
            给定数组 nums = [-1, 0, 1, 2, -1, -4]，
            满足要求的三元组集合为：  [ [-1, 0, 1], [-1, -1, 2] ]


[017. 电话号码的字母组合](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number)
    Argorithm description:
        给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
            示例:
            输入："23"
            输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].


[019. 删除链表的倒数第N个节点](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description)
    Argorithm description:
        给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
            示例：给定一个链表: 1->2->3->4->5, 和 n = 2.当删除了倒数第二个节点后，链表变为 1->2->3->5.
            说明：给定的 n 保证是有效的。



[022. 括号生成](https://leetcode-cn.com/problems/generate-parentheses)
    Argorithm description:
        数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
            输入：n = 3
            输出：[
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
                ]



[024. 两两交换链表中的节点  ](https://leetcode.com/problems/swap-nodes-in-pairs/description/)
    Argorithm description:
        给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
            给定 1->2->3->4, 你应该返回 2->1->4->3.


[029. 两数相除](https://leetcode.com/problems/divide-two-integers/description/)
    Argorithm description:
        给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。返回被除数 dividend 除以除数 divisor 得到的商。整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
            输入: dividend = 10, divisor = 3
            输出: 3
            解释: 10/3 = truncate(3.33333..) = truncate(3) = 3



[031. 下一个排列](https://leetcode.com/problems/next-permutation/description/)
    Argorithm description:
        实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。必须原地修改，只允许使用额外常数空间。
                以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
                1,2,3 → 1,3,2
                3,2,1 → 1,2,3
                1,1,5 → 1,5,1



[33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/)
    Argorithm description:
        假设按照升序排序的数组在预先未知的某个点上进行了旋转。 ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。 你可以假设数组中不存在重复的元素。 你的算法时间复杂度必须是 O(log n) 级别。
            示例 1:
            输入: nums = [4,5,6,7,0,1,2], target = 0
            输出: 4




[39. 组合总和](https://leetcode.com/problems/combination-sum/description/)
    Argorithm description: 
        给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 candidates 中的数字可以无限制重复被选取。
        说明：所有数字（包括 target）都是正整数。
            解集不能包含重复的组合。 
            示例 1： 
                输入：candidates = [2,3,6,7], target = 7,
                所求解集为：
                [
                [7],
                [2,2,3]
                ]





[40. 组合总和 II](https://leetcode.com/problems/combination-sum-ii/description/)
    Argorithm description: 
        给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 candidates 中的每个数字在每个组合中只能使用一次。
            说明：
                所有数字（包括目标数）都是正整数。 解集不能包含重复的组合。 
            示例 1: 
                输入: candidates = [10,1,2,7,6,1,5], target = 8,
                所求解集为:
                    [
                    [1, 7],
                    [1, 2, 5],
                    [2, 6],
                    [1, 1, 6]
                    ]




[46. 全排列](https://leetcode.com/problems/permutations/description/)
    Argorithm description: 
        给定一个 没有重复 数字的序列，返回其所有可能的全排列。
            示例: 
            输入: [1,2,3]
                输出:
                [
                [1,2,3],
                [1,3,2],
                [2,1,3],
                [2,3,1],
                [3,1,2],
                [3,2,1]
                ]




[47. 全排列 II](https://leetcode.com/problems/permutations-ii/description/)
    Argorithm description: 
        给定一个可包含重复数字的序列，返回所有不重复的全排列。
          示例: 
            输入: [1,1,2]
            输出:
            [
            [1,1,2],
            [1,2,1],
            [2,1,1]
            ]




[48. 旋转图像](https://leetcode.com/problems/rotate-image/description/)
    Argorithm description:
        给定一个 n × n 的二维矩阵表示一个图像。 将图像顺时针旋转 90 度。
        说明： 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
            示例 1:
                给定 matrix =  
                    [
                        [1,2,3],
                        [4,5,6],
                        [7,8,9]
                    ],

                    原地旋转输入矩阵，使其变为:
                    [
                        [7,4,1],
                        [8,5,2],
                        [9,6,3]
                    ]



[49](https://leetcode.com/problems/group-anagrams/description/)
    Argorithm description:
        给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
            示例: 
                输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
                输出:
                [
                ["ate","eat","tea"],
                ["nat","tan"],
                ["bat"]
                ]
                说明： 所有输入均为小写字母。
                        不考虑答案输出的顺序。




[55. 跳跃游戏](https://leetcode.com/problems/jump-game/description/)
    Argorithm description:
        给定一个非负整数数组，你最初位于数组的第一个位置。数组中的每个元素代表你在该位置可以跳跃的最大长度。判断你是否能够到达最后一个位置。
            示例 1:
            输入: [2,3,1,1,4]
            输出: true
            解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。




[56. 合并区间](https://leetcode.com/problems/merge-intervals/description/)
    Argorithm description: 
     给出一个区间的集合，请合并所有重叠的区间。
        示例 1:
            输入: intervals = [[1,3],[2,6],[8,10]',[15,18]]
            输出: [[1,6],[8,10],[15,18]]
            解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
            注意：输入类型已于2019年4月15日更改。 请重置默认代码定义以获取新方法签名。