class Solution {
    fun romanToInt(s: String): Int {
        val nums = IntArray(s.length + 1)
        var ans = 0
        for (i in 0 ..< nums.size - 1) {
            when (s[i]) {
                'I' -> nums[i] = 1
                'V' -> nums[i] = 5
                'X' -> nums[i] = 10
                'L' -> nums[i] = 50
                'C' -> nums[i] = 100
                'D' -> nums[i] = 500
                'M' -> nums[i] = 1000
            }
        }

        /*var b: Boolean = true
        for (i in 0 ..< nums.size - 1) {
            if (!b) {
                b = true
                continue
            }
            if (nums[i] >= nums[i + 1]) {
                ans += nums[i]
            } else {
                ans += nums[i + 1] - nums[i]
                b = false
            }
            // ans += (nums[i] >= nums[i + 1] ? nums[i] : nums[i + 1] - nums[i++]) en java
            // ans += if (nums[i] >= nums[i + 1]) nums[i] else nums[i + 1] - nums[i++] ""en kotlin""
        }*/
        var i: Int = -1
        while (++i < nums.size - 1) {
            ans += if (nums[i] >= nums[i + 1]) nums[i] else nums[i + 1] - nums[i++]
        }
        return ans
    }
}
