fun main() {
    val solution = Solution()

    val list1: ListNode? = null
    val list2: ListNode? = ListNode(0)
    val expected: ListNode? = ListNode(0)

    println(list1)
    println(list2)
    println(expected)
    val result: ListNode? = solution.mergeTwoLists(list1, list2)
    println(result)
    println(result.toString() == expected.toString())
}
