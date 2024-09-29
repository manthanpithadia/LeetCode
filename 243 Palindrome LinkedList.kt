import DSA.LinkedList.Node

fun reverseLinkedList(head:Node?):Node?{
    var current: Node? = head
    var prev: Node? = null
    var next: Node? = null

    while(current!=null){
        next = current.next
        current.next = prev
        prev = current
        current = next
    }
    return prev
}

fun isPalindrome(head:Node?):Boolean{
    if(head?.next == null) return true

    var slow: Node? = head
    var fast: Node? = head

    while (fast?.next!=null){
        slow = slow?.next
        fast = fast.next?.next
    }

    var head = head
    var rHead = reverseLinkedList(slow)

    while (head!=null && rHead!=null){
        if(head?.data!=rHead?.data) return false
        head = head?.next
        rHead = rHead?.next
    }

    return (rHead==null)
}