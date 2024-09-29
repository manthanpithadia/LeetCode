import java.util.Stack

fun main() {
 var s = "aacc"
    var t = "ccac"
    println(s.toCharArray().sort().toString())
    println(t.toCharArray().sort().toString())
    println(s.toSortedSet()==t.toSortedSet())

}
