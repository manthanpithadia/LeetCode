
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var sum = 0
        for(i in nums.indices step 2){
            sum += minOf(nums[i],nums[i+1])
        }
        return sum
    }
