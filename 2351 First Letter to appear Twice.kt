// Time Complexity: O(N)
// Space Complexity: O(1)

fun repeatedCharacter(s:String):Char{
    val dict = IntArray(26)
    for(c in s){
        if(dict[c-'a']==1){
            return c
        }
        else dict[c-'a']++
    }
    return 'a'
}