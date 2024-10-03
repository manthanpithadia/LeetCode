fun main() {
    //Input: nums = [2,3,1,1,4]
    //Output: true
    print(canJump(intArrayOf(3,2,1,0,4)))
}

fun canJump(nums: IntArray): Boolean {
    var goal = nums.lastIndex
    for(i in nums.lastIndex downTo 0){
        var diff = goal - i
        if(nums[i]>=diff){
            goal = i
            if(i==0) return true
        }
    }
    return false
}