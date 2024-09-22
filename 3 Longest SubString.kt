import kotlin.math.max

fun lengthOfLongestSubstring(input: String): Int {
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

