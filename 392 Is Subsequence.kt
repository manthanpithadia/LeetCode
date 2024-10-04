fun main() {
    print(isSubsequence(s= "abc",t= "ahbgdc"))
}

fun isSubsequence(s: String, t: String): Boolean {
    var map = IntArray(size = 26){0}
    var i = 0
    var j = 0
    var match = 0
    while(i<s.length && j<t.length){
        if(s[i]==t[j]){
            match++
            i++
            j++
        }
        else{
            j++
        }
    }
    return match == s.length
}