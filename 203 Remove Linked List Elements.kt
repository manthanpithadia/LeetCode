import DSA.LinkedList.Node

fun removeElements(head: Node?, data: Int): Node? {
    var dummy = Node(-1)
    dummy.next = head
    var current = head
    var prev = dummy

    while(current!=null){
        if(current?.data== data){
            prev?.next = current?.next
        }
        else{
            prev = current
        }
        current = current?.next
    }
    return dummy?.next
}