fun main() {
    //Example 1:
    //Input: word = "USA"
    //Output: true

    //Example 2:
    //Input: word = "FlaG"
    //Output: false
    println(detectCapitalUse("FFFFFFFFFFFFFFFFFFFFf"))
}

fun detectCapitalUse(word: String): Boolean {
    if(word.length>1){
        when(word[0].isUpperCase()){
            true-> return (isAllUpperCase(word.substring(startIndex = 1)) || isAllLowerCase(word.substring(startIndex = 1)))
            false-> return isAllLowerCase(word.substring(startIndex = 1))
        }
    }
    return true
}

fun isAllLowerCase(s: String):Boolean{
    for(c in s){
        if(!c.isLowerCase()) return false
    }
    return true
}

fun isAllUpperCase(s:String): Boolean{
    for (c in s){
        if(!c.isUpperCase()) return false
    }
    return true
}