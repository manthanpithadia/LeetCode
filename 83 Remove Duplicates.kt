import DSA.LinkedList.Node

// Refer to LinkedList.Node package for Node definition
fun deleteDuplicates(head: Node?): Node? {
    var current = head
    while(current!=null){
        // if 2 values are same then skip next node
        if(current?.data == current?.next?.data) current?.next = current?.next?.next
        // else keep traversing
        else current = current?.next
    }
    return head
}