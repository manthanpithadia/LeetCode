fun main() {
    println(uniqueMorseRepresentations(arrayOf("a")))
}

fun uniqueMorseRepresentations(words: Array<String>): Int {
    val dict = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    for((index, word) in words.withIndex()){
        var temp = ""
        for(c in word){
            temp += dict[c-'a']
        }
        words[index] = temp
    }
    return words.toSet().size
}