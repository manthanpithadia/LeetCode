package DSA.Array

import kotlin.math.max

fun main() {
    println( fixedSizeWindow(input = intArrayOf(2, 3, 4, 1, 5), k = 2) )
    // input: abcabcbb
    println(dynamicSizeWindow("abcabcbb"))
}

fun dynamicSizeWindow(input:String):Int{
    var l = 0
    var maxLength = 0
    var subString = mutableSetOf<Char>()

    for(r in input.indices){
        while(input[r] in subString){
            subString.remove(input[l])
            l++
        }
        maxLength = max(maxLength, (r-l) + 1)
        subString.add(input[r])
    }
    return maxLength
}

/**
 * Time Complexity: O(n)
 * Space Complexity
 */
fun fixedSizeWindow(input: IntArray, k: Int): Int?{
    // Checking invalid input
    if(k>input.size) return null

    var currentSum = 0
    var maxSum = 0
    // Calculating Sum of 1st window
    for (i in 0..<k){
        currentSum+=input[i]
    }
    maxSum = currentSum
    for(i in k..<input.size){
        currentSum += (input[i] - input[i-k])
        maxSum = max(currentSum,maxSum)
    }
    return maxSum
}

