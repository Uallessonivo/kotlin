package leetCode

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.


//Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].


//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.


fun main() {
    val mergeSortedArray = MergeSortedArray()

    println(mergeSortedArray.merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2, 5, 6), 3))
}

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val mergedArray: IntArray = (nums1.dropLast(n).toIntArray() + nums2)
        mergedArray.sort()

        for (i in mergedArray.indices) {
            nums1[i] = mergedArray[i]
        }
    }
}