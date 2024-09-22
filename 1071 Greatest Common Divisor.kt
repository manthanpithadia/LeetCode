fun main() {
    println(gcdOfStrings("ABCDEF","ABC"))
}

fun gcdOfStrings(str1: String, str2: String): String {
    var dict = IntArray(size = 26)
    var result = ""
    for((i,c) in str2.withIndex()){
        if(str1[i]==str2[i] && dict[c-'A']==0){
            dict[c-'A']++
            result+=c
        }
   }
    return result
}