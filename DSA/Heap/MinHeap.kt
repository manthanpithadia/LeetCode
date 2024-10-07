package DSA.Heap

fun main() {
    var array = intArrayOf(3, 10, 5, 6, 2, 20,  1)
    var minHeap = MinHeap(array.size)
    array.forEach {minHeap.insert(it)}
    for(i in 0..array.lastIndex){
        print("${minHeap.removeMin()}, ")
    }
}

class MinHeap(private val capacity: Int) {
    private var ptr = 0
    private val heap = IntArray(size = capacity)

    private fun parent(i: Int) = (i - 1) / 2
    private fun left(i: Int) = 2 * i + 1
    private fun right(i: Int) = 2 * i + 2

    private fun swap(index1: Int, index2: Int) {
        var temp = heap[index1]
        heap[index1] = heap[index2]
        heap[index2] = temp
    }

    // public function to insert into minHeap
    fun insert(element: Int) {
        if (ptr == capacity) throw IllegalStateException("Heap is Full")

        heap[ptr] = element
        ptr++
        var index = ptr - 1 // last element index of heap
        while (index != 0 && heap[parent(index)] > heap[index]) {
            swap(parent(index),index)
            index = parent(index)
        }
    }

    private fun heapifyUp() {

    }

    fun removeMin():Int{
        if(ptr==0) throw IllegalStateException("Heap is Empty")
        val root = heap[0]

        // last element of heap will be at the top
        heap[0] = heap[ptr-1]
        ptr--

        heapifyDown(0) // once we heapifyDown the top element will be the smallest
        return root
    }

    private fun heapifyDown(index: Int) {
        var smallest = index
        var left = left(index)
        var right = right(index)

        if(left<ptr && heap[left] < heap[smallest]){
            smallest = left
        }
        if(right<ptr && heap[right] < heap[smallest]){
            smallest = right
        }

        if(smallest!=index){
            swap(smallest, index)
            heapifyDown(smallest)
        }
    }

    fun getMin(): Int{
        if(ptr==0) throw IllegalStateException("Heap is Empty")
        return heap[0]
    }
}