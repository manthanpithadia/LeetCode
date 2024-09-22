fun maxProduct(nums: IntArray): Int {
    var numsSorted = nums.sortedArray()
    var n = nums.size-1
    return (numsSorted[n]-1)*(numsSorted[n-1]-1)
}