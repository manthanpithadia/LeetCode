import java.util.Stack

fun main() {
    println(firstRecurringChar("DBCABA"))
    println(firstRecurringChar("ABCA"))
    println(firstRecurringChar("BCABA"))
    println(firstRecurringChar("ABC"))
}

fun firstRecurringChar(str:String):Char? {
    var map = mutableMapOf<Char,Int>()
    for(i in str.indices){
       var k = map.getOrDefault(str[i],0) + 1
        if(k<=1) map[str[i]] = k
        else return str[i]
    }
    return null
}

