package DSA.Array

/**

 * You are given a sorted array of integers arr and a target sum target.
   Return the indices (1-based) of the two numbers such that they add up to the target.

 * Assume that there is exactly one solution, and you may not use the same element twice.
   You must solve the problem using the two-pointer technique.

*/

// Time Complexity: O(n) - without sorting
// Time Complexity: O(n log(n)) - with sorting
// Space Complexity: O(1)

fun main() {
    println( twoPointers(intArrayOf(2,7,11,15),9) )
}

fun twoPointers(input:IntArray, target: Int): Pair<Int, Int>? {
    var i = 0
    var j = input.size-1
    for(it in input){
        var sum = input[i]+input[j]
        when{
            sum<target -> i++
            sum>target -> j--
            else -> {
                return Pair(input[i],input[j])
            }
        }
    }
    return null
}