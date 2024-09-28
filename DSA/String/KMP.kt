package DSA.String

fun main() {
  kmp("ababcabcabababd", "ababd")
}

fun kmp(input: String, pattern: String){

    val N = pattern.length
    val M = input.length

    var pi = IntArray(N)
    pi = computePiArray("ababd",N,pi)
    var i  = 0 // ptr for input
    var j = 0 // ptr for pattern

    while (i<M){
        if(pattern[j]==input[i]){
            i++
            j++
        }
        if(j==N) {
            println("Pattern found at index ${i - j}")
            j = pi[j-1]
        }
        else if(i<M && pattern[j]!=input[i]){
            if(j!=0){
                j = pi[j-1]
            }
            else{
                i++
            }
        }
    }

}

fun computePiArray(pattern: String, M: Int, pi: IntArray):IntArray{
    var prev_ptr = 0
    pi[0] = 0
    var i = 1

    while(i<M){
        if(pattern[prev_ptr]==pattern[i]){
            prev_ptr++
            pi[i] = prev_ptr
            i++
        }
        else {
            if(prev_ptr==0) {
                pi[i] = 0
                i++
            }
            else prev_ptr = pi[prev_ptr-1]
        }
    }
    return pi
}

