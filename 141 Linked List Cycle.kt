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
fun hasCycle(head: Node?): Boolean {
    var slow = head
    var fast = head

    while(fast?.next !=null && fast!=null){
        slow = slow?.next       // move by 1
        fast = fast?.next?.next // move by 2
        if(slow==fast) return true
    }
    return false
}
