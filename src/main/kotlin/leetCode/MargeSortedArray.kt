package leetCode

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true


//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false

//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

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