fun main() {
    //Input: nums = [2,2,1]
    //Output: 1
    println(singleNumber(intArrayOf(2,2,1)))
}

fun singleNumber(nums: IntArray): Int {
    var result = 0
    nums.map { result = result xor it }
    return result
}