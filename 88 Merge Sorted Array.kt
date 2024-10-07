class Solution {
    var ptr = 0
    var heap = IntArray(0)
    var capacity = 0
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        capacity = nums1.size
        heap = IntArray(nums1.size)
        for(i in 0..m-1){insert(nums1[i])}
        nums2.forEach{insert(it)}

        for(i in 0..nums1.lastIndex){
            nums1[i] = removeMin()
        }
    }

    // Solving this using minHeap
    fun parent(i:Int) = (i-1)/2
    fun left(i:Int) = (i * 2) + 1
    fun right(i:Int) = (i * 2) + 2

    fun swap(index1:Int, index2:Int){
        var temp = heap[index1]
        heap[index1] = heap[index2]
        heap[index2] = temp
    }

    fun insert(element: Int){
        if(ptr==capacity) throw IllegalStateException("Heap is Full")
        heap[ptr] = element
        ptr ++

        //heapify from bottom to top
        var index = ptr - 1
        while(index!=0 && heap[parent(index)] > heap[index]){
            swap(index, parent(index))
            index = parent(index)
        }
    }

    fun removeMin():Int{
        if(ptr==0) throw IllegalStateException("Heap is Empty")
        var root = heap[0]
        heap[0] = heap[ptr-1]
        ptr--

        // Heapify downwards
        heapifyDown(0)
        return root
    }

    fun heapifyDown(index: Int){
        var left = left(index)
        var right = right(index)
        var smallest = index

        if(left<ptr && heap[left]<heap[smallest]){
            smallest = left
        }

        if(right<ptr && heap[right]<heap[smallest]){
            smallest = right
        }

        if(smallest!=index){
            swap(smallest,index)
            heapifyDown(smallest)
        }
    }
}