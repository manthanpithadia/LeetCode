
import java.util.Stack
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    // by using hash map and stack
    val map = mutableMapOf<Int,Int>()
    val stack = Stack<Int>()

    for(num in nums2){
        while(stack.isNotEmpty() && num > stack.peek()){
            map[stack.pop()] = num
        }
        stack.push(num)
    }
    // if there are remaining elements then set it's value to -1
    while(stack.isNotEmpty()) map[stack.pop()] = -1

    return nums1.map{map[it] ?: -1}.toIntArray()
}

class UnitTest{
    @Test
    fun nextGreaterElement_leetCodeTest(){
        val nums1 = intArrayOf(4,1,2)
        val nums2 = intArrayOf(1,3,4,2)
        val target = intArrayOf(-1,3,-1)
        val result = nextGreaterElement(nums1,nums2)
        assertContentEquals(target,result)
    }
}