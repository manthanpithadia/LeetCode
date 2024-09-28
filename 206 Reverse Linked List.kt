import DSA.LinkedList.Node

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
// For Node class please refer to LinkedList package
fun reverseList(head: Node?): Node? {
    var prev: Node? = null
    var current: Node? = head
    var next: Node? = null

    while(current!=null){
        next = current?.next
        current?.next = prev
        prev = current
        current = next
    }
    return prev
}
