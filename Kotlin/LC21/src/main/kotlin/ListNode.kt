class ListNode(var `val`: Int, var next: ListNode?) {
    constructor(value: Int) : this(value, null)

    override fun toString(): String {
        val sb = StringBuilder()

        var tmp: ListNode? = this.next
        sb.append(this.`val`)
        while (tmp != null) {
            sb.append(" -> ").append(tmp.`val`)
            tmp = tmp.next
        }

        return sb.toString()
    }
}