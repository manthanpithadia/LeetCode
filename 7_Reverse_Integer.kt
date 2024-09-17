
    fun reverse(x: Int): Int {
        var num = x
        var reversed = 0

        while(num!=0){
            val digit = num % 10
            num /= 10

            // Check the overflow
            if(reversed > Int.MAX_VALUE/10 || ((reversed == Int.MAX_VALUE/10) && digit > 7)) return 0
            if(reversed < Int.MIN_VALUE/10 || ((reversed == Int.MIN_VALUE/10) && digit < -8)) return 0

            reversed = reversed * 10 + digit
        }
        return reversed
    }
