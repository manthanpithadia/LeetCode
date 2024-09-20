fun moveZeroes(nums: IntArray): Unit {
    var nonZeroIndex = 0

    for(i in nums.indices){
        if(nums[i] != 0){
            nums[nonZeroIndex] = nums[i]
            nonZeroIndex++
        }
    }
    for (i in nonZeroIndex until nums.size){
        nums[i] = 0
    }
}