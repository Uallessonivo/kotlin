package leetCode

// Given an integer array nums, find the subarray which has the largest sum and return its sum.

//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.


//Example 2:
//
//Input: nums = [1]
//Output: 1


//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23


fun main() {
    val response = MaxSubArray()

    println(response.maxSubArray(intArrayOf(5,4,-1,7,8)))
}

class MaxSubArray {
    fun maxSubArray(nums: IntArray): Int {
        var maxSub = nums[0]
        var curSum = 0

        for (n in nums) {
            if (curSum < 0) {
                curSum = 0
            }
            curSum += n
            maxSub = Math.max(maxSub, curSum)
        }

        return maxSub
    }
}