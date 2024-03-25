class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) {
            return null
        }
        var l1 = list1
        var l2 = list2
        var minorNode = minor(l1, l2)
        val ans = ListNode(minorNode.`val`)
        when (minor(l1, l2)) {
            l1 -> l1 = l1.next
            l2 -> l2 = l2.next
        }
        var tmp = ans

        while (l1 != null || l2 != null) {
            minorNode = minor(l1, l2)
            tmp.next = ListNode(minorNode.`val`)
            tmp = tmp.next!!
            when (minorNode) {
                l1 -> l1 = l1.next
                l2 -> l2 = l2.next
            }
        }

        return ans
    }

    private fun minor(a: ListNode?, b: ListNode?): ListNode {
        return if (a == null) {
            b!!
        } else if (b == null || a.`val` < b.`val`) {
            a
        } else {
            b
        }
    }
}
