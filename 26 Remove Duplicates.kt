// Solution 1
fun removeDuplicates(nums: IntArray): Int {
    var hashMap = mutableMapOf<Int,Int>()
    var j = 0
    for(i in nums){
        if(i !in hashMap.values){
            hashMap[j] = i
            j++
        }
    }
    for(i in 0..<hashMap.size){
        nums[i] = hashMap[i]!!
    }
    return j
}
// Solution 2: More optimized
fun removeUnique(nums: IntArray): Int {
    var hashMap = mutableMapOf<Int,Int>()
    var unique = 0
    for(i in nums.indices){
        if(nums[i] !in hashMap.values){
            hashMap[unique] = nums[i]
            nums[unique] = nums[i]
            unique++
        }
    }
    return unique
}
