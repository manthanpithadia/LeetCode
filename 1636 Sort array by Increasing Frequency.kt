fun main() {
    //Input: nums = [1,1,2,2,2,3]
    //Output: [3,1,1,2,2,2]
    println(frequencySort(intArrayOf(1,1,2,2,2,3)).contentToString())
}

fun frequencySort(nums: IntArray): IntArray {
    var map = hashMapOf<Int,Int>()
    for(n in nums){
        map[n] = map.getOrDefault(n,0) + 1
    }

    return nums.sortedWith(compareBy<Int>{map[it]}.thenByDescending {it}).toIntArray()
}