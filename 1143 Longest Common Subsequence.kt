import kotlin.math.max

fun main() {
    println(longestCommonSubsequence("abcde","ace"))
}

fun longestCommonSubsequence(text1: String, text2: String): Int {
    var m = text1.length
    var n = text2.length

    var dp = Array(m+1) { Array(n+1) { 0 } }

    for(i in m-1 downTo 0){
        for(j in n-1 downTo 0){
            if(text1[i]==text2[j])
                dp[i][j] = 1 + dp[i+1][j+1]
            else
                dp[i][j] = max(dp[i][j+1], dp[i+1][j])
        }
    }
    return dp[0][0]
}