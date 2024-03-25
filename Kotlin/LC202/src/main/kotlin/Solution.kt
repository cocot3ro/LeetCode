class Solution {
    fun isHappy(n: Int): Boolean {
        var sb: StringBuilder = StringBuilder().append(n)

        while (sb.length > 1) {
            var sos = 0
            for (i in sb.indices) {
                sos += (sb[i] - '0') * (sb[i] - '0')
            }
            sb = StringBuilder().append(sos)
        }

        val s: String = sb.toString()
        return s == "1" || s == "7"
    }
}