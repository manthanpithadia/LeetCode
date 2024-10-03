fun main() {
    //nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    //[4,9]
    println(intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)).contentToString())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val result = mutableListOf<Int>()

    for(n in nums1){
        map[n] = map.getOrDefault(n,0) + 1
    }

    for (n in nums2){
        if(map.getOrDefault(n,0)>0){
            result.add(n)
            map[n] = map[n]!! - 1
        }
    }
    return result.toIntArray()
}