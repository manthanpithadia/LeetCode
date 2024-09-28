package DSA.LinkedList

fun main() {
    val list = DoublyLinkedList()
    list.addNodeDoubly(2)
    list.addNodeDoubly(3)
    list.addNodeDoubly(6)
    list.addNodeDoubly(2)
    list.addNodeDoubly(3)
    list.reverseDoublyList()
    list.display()
}

data class DNode(
    var data: Int,
    var next: DNode? = null,
    var prev: DNode? = null
)

interface IDoublyLinkedList{
    var head: DNode?
    var tail: DNode?
    fun addNodeDoubly(value:Int)
    fun deleteNodeDoubly(value: Int)
    fun display()
    fun reverseDoublyList()
}

class DoublyLinkedList: IDoublyLinkedList{
    override var head: DNode? = null
    override var tail: DNode? = null

    override fun addNodeDoubly(value: Int) {
        // Create a new node.
        var newNode = DNode(value)

        //If the list is empty, set both head and tail to the new node.
        if(head==null){
            head = newNode
            tail = newNode
        }
        else{
            tail?.next = newNode
            newNode.prev = tail
            tail = newNode
        }
    }

    override fun deleteNodeDoubly(value: Int) {
        if(head==null) return

        if(head?.data == value) {
            head = head?.next
            head?.prev = null
        }
        var current = head

        while(current != tail && current?.next?.data != value){
            current = current?.next
        }

        if(current!=tail){
            current?.next = current?.next?.next
            if(current?.next!=null) {
                current?.next?.prev = current
                tail = current.next
            }
            else tail = current
        }
    }

    override fun display() {
        var current = head
        while (current!=null){
            print("${current.data}")
            current = current.next
            if(current!=null){
                print(", ")
            }
            else{
                print(".")
            }
        }
    }

    override fun reverseDoublyList() {
        var current = head
        var tempPrev: DNode? = null

        tail = head

        while (current!=null){
            tempPrev = current.prev
            current.prev = current.next
            current.next = tempPrev
            current = current.prev
        }

        if(tempPrev!=null){
            head = tempPrev.prev
        }
    }

}