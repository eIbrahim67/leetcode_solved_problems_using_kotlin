class IsSameAfterReversals {
    fun isSameAfterReversals(num: Int): Boolean {

        if (num == 0)
            return true

        var newNum = num

        var lastDigit = newNum % 10

        while (lastDigit == 0){

            newNum /= 10

            lastDigit = newNum % 10

        }

        return newNum == num

    }
}