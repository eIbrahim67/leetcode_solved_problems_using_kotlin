public class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        var len = 0
        var len2 = s.length - 1

        var c = s[len2]

        while(c == ' ' ){
            len2--
            c = s[len2]

        }

        while(c != ' ' ){
            len++

            if (len < s.length && len2 > 0){
                len2--
                c = s[len2]
            }else
                break

        println("3")


        }
        return len
    }
}