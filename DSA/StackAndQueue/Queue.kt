package DSA.StackAndQueue

fun main() {
    var queue = FixedSizeQueue(5)
    queue.enQueue(20)
    queue.enQueue(0)
    queue.enQueue(5)
    queue.enQueue(45)
    queue.enQueue(3)
    queue.printQueue()
    queue.enQueue(45)
    queue.deQueue()
    queue.enQueue(45)
    queue.printQueue()
}

class FixedSizeQueue(private val capacity: Int) {
    val queue = IntArray(capacity)
    var front = 0
    var rear = 0
    var size = 0

    fun enQueue(value: Int) {
        if (size == capacity) {
            println("Queue is full. Cannot add $value")
            return
        }
        queue[rear] = value
        size++
        println("Added $value to the queue.")
    }

    // Remove an element from the queue
    fun deQueue(): Int? {
        if (front==rear) {
            println("Queue is empty. Cannot remove element.")
            return null
        }
        val removedElement = queue[front]
        front = (front + 1) % capacity  // Increment front circularly
        size--
        println("Removed $removedElement from the queue.")

        return removedElement
    }

    // Print all elements in the queue
    fun printQueue() {
        if (size == 0) {
            println("Queue is empty.")
            return
        }
        println("Queue elements: ")
        for (i in 0 until size) {
            print(queue[(front + i) % capacity].toString() + " ")
        }
        println()
    }
}