class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var i = 1
        outer@
        while (i <= strs[0].length) {
            val prefix = strs[0].substring(0, i)
            for (str in strs) {
                if (!str.startsWith(prefix)) {
                    break@outer
                }
            }
            i++
        }
        return strs[0].substring(0, i - 1)
    }
}
