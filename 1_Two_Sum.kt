
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()
    
        for((index, value) in nums.withIndex()){
            val k = target - value
            if(map.containsKey(k)){
                return intArrayOf(map[k]!!, index)
            }
            map[value] = index
        } 
        return intArrayOf()
    }
