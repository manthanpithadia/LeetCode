package DSA.LinkedList

fun main() {
    val list = LinkedList()
    list.addNode(2)
    list.addNode(3)
    list.addNode(6)
    list.addNode(2)
    list.addNode(3)
    list.tail?.next = list.head
}

data class Node(
    var data: Int,
    var next: Node? = null
)

internal class LinkedList(): ILinkedList{
    override var head: Node? = null
    override var tail: Node? = null

    override fun addNode(data: Int) {
        val newNode = Node(data)
        if(head == null){
            head = newNode
            tail = newNode
        }
        else{
            tail?.next = newNode
            tail = newNode
        }
    }

    override fun displayNodes() {
        var ptr = head
        while(ptr!=null){
            print("${ptr?.data}")
            ptr = ptr.next
            if(ptr!=null){
                print(", ")
            }
            else{
                print(".")
            }
        }
    }

    override fun deleteNode(value: Int) {
        //If the list is empty, return.
        if (head==null) return

        //If the node to be deleted is the head, update the head to head.next.
        if(head?.data == value){
            head = head?.next
            if(head==null) tail = null
            return
        }

        //Traverse the list to find the node before the node to be deleted.
        var current = head
        while (current!=tail  && current?.next?.data!=value){
            current = current?.next
        }

        if(current!=tail){ // I am at the 1 node before the deleting node
            current?.next = current?.next?.next
            //If deleting the tail, update the tail pointer.
            if(current?.next == null) tail = current
        }
    }

    override fun searchNode(value: Int): Boolean {
        //Start from the head.
        var current = head
        var index = 0
        //Traverse through the list while comparing each node's data with the target value.
        while (current!=null){
            if(current.data == value){
                //Return true if found,
                println("value Found at $index")
                return true
            }
            current = current.next
            index++
        }

        //else return false.
        return false
    }

    override fun reverseList() {
        //Use three pointers: prev (null), current (head), and next (null).
        var prev:Node? = null
        var current:Node? = head
        var next:Node? = null

        //Traverse the list, reversing the next pointers.
        tail = head
        while (current!=null){
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head = prev
    }

}

interface ILinkedList{
    var head:Node?
    var tail: Node?
    fun addNode(data:Int)
    fun displayNodes()
    fun deleteNode(value: Int)
    fun searchNode(value: Int): Boolean
    fun reverseList()
}