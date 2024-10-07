fun main() {
    println(gcdOfStrings("ABCABC","ABC"))
}

fun gcdOfStrings(str1: String, str2: String): String {
    if(str1 + str2 != str2 + str1) return ""

    val gcd = gcd(str1.length, str2.length)

    return str1.substring(0,gcd)
}

fun gcd(a : Int, b : Int) : Int{
    return if(b==0) a else gcd(b, a % b)
}