fun main() {
    println(search(nums = intArrayOf(4,5,6,7,0,1,2), target = 0))
}

fun search(nums: IntArray, target: Int): Int {
    val p = pivot(nums)

    val leftSide = binarySearch(0, p - 1, nums, target)
    val rightSide = binarySearch(p, nums.size - 1, nums, target)
    if (leftSide >= 0) return leftSide
    if (rightSide >= 0) return rightSide
    return -1
}

fun binarySearch(left: Int, right: Int, nums: IntArray, target: Int): Int {
    if (left > right) return -1
    val mid = (left + right) / 2
    if (nums[mid] == target) return mid
    if (nums[mid] < target) return binarySearch(mid + 1, right, nums, target)
    return binarySearch(left, mid - 1, nums, target)
}

fun pivot(nums: IntArray): Int {
    var low = 0
    var high = nums.size - 1
    while (low < high) {
        if (nums[low] <= nums[high]) return low
        val mid = (low + high) / 2
        if (nums[mid] > nums[high]) {
            low = mid + 1
        } else {
            high = mid
        }
    }
    return low
}