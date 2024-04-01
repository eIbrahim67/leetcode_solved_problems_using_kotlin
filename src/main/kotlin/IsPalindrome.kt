class IsPalindrome {

    fun isPalindrome(x: Int): Boolean {
        if(x < 0)
            return false

        var f = x
        var y = 0

        while(f != 0) {
            val digit = f % 10
            val newResult = y * 10 + digit
            if ((newResult - digit) / 10 != y) {
                return false
            }
            y = newResult
            f /= 10
        }

        return x == y
    }

}