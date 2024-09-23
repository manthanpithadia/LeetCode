import kotlin.math.max

fun main() {
    println(findMaxAverage(intArrayOf(1,12,-5,-6,50,3), 4))
}

fun findMaxAverage(nums: IntArray, k: Int): Double {
    // Sliding Window Technique
    var currentWindow = 0
    var maxSum = 0
    for(i in 0..<k){
        currentWindow += nums[i]
    }
    maxSum = currentWindow
    for(j in k..nums.size-1){
        currentWindow = currentWindow + nums[j] - nums[j-k]
        maxSum = max(currentWindow, maxSum)
    }
    return maxSum.toDouble()/k
}