class ReverseInt {
    fun reverseInt(x: Int): Int {
        var f = x
        var y = 0

        while(f != 0) {
            val digit = f % 10
            val newResult = y * 10 + digit
            if ((newResult - digit) / 10 != y) {
                return 0 // Overflow
            }
            y = newResult
            f /= 10
        }

        return y
    }
}