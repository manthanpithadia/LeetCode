class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x>=0){
            //reverse the number; compare it with x and if match return true else false
            var num = x
            var reversed = 0

            while (num != 0){
                val digit = num % 10
                num /= 10
                reversed = reversed * 10 + digit
            }
            if(reversed == x) return true
        }
        return false
    }
}