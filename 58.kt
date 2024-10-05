fun main() {
    println(lengthOfLastWord("Hello World"))
    var s = "Hellow World"
    println(s[s.lastIndex])
    println(s.last())
}

fun lengthOfLastWord(s: String): Int {
    var count = 0

    for(i in s.lastIndex downTo 0){
        if(s[i]!=' ') count++
        else{
            if(count>0 && s[i]==' ') break
        }
    }
    return count
}
