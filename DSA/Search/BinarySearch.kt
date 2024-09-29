package DSA.Search

fun main() {
    println( binarySearch(intArrayOf(1,4,4,5,7,8,8,9), 4) )
}
fun binarySearch(nums: IntArray, target: Int):Int{
    // Binary Search
    var l = 0
    var h = nums.lastIndex

    while (l<=h){
        var mid = (h+l)/2
        when{
            target == nums[mid] -> return mid
            target < nums[mid] -> h = mid -1
            else -> l = mid + 1
        }
    }
    return -1
}