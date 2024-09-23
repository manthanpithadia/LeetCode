import kotlin.math.max

fun maxSubArray(nums: IntArray): Int {
        var maxSum = nums[0]
        var currentSum = nums[0]

        for(i in 1 until nums.size){
            
        currentSum = max(nums[i], nums[i] + currentSum)
        maxSum = max(currentSum, maxSum)
        }
        return maxSum
}

// Kadane's Algorithm
fun kadaneAlgorithm(nums: IntArray): Int{
        var maxSum = Int.MIN_VALUE
        var currentSum = 0

        for(i in nums){
                currentSum += i
                maxSum = max(currentSum, maxSum)

                if(currentSum<0) currentSum = 0
        }
        return maxSum
}
