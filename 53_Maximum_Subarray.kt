class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = nums[0]
        var currentSum = nums[0]

        for(i in 1 until nums.size){
            
        currentSum = max(nums[i], nums[i] + currentSum)
        maxSum = max(currentSum, maxSum)
        }
        return maxSum
    }
}