fun main() {
    println(findMin(intArrayOf(3,4,5,1,1,2)))
}

fun findMin(nums: IntArray):Int{
    var l = 0
    var r = nums.lastIndex
    var mid = -1
    while(l<r){
        mid = (l+r)/2
        // Shrink From Left if you find mid is > right
        if(nums[mid]>nums[r]) l = mid+1
        // Shrink From Right
        else r = mid
    }
    return nums[r]
}