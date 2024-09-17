// Time Complexity: O(n)
// Space Complexity: O(1)

fun findDuplicates(nums: IntArray): List<Int> {
    var result = mutableListOf<Int>()

    for(i in nums.indices){
        val index = Math.abs(nums[i]) - 1

        if(nums[index] < 0) result.add(index + 1)
        else nums[index] = -nums[index]
    }
    return result
}