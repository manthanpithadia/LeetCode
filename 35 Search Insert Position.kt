import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

fun searchInsert(nums: IntArray, target: Int): Int {
    // Binary Search
    var low = 0
    var high = nums.size-1
    var mid = 0
    while(low<=high){
        mid = (low+high)/2
        when{
            nums[mid] == target -> return mid  // Target found
            nums[mid] < target -> low = mid + 1  // Search right half
            else -> high = mid - 1  // Search left half
        }
    }
    return low
}

class SearchInsertTest {

    @Test
    fun testSearchInsert_targetExists() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        val result = searchInsert(nums, target)
        assertEquals(2, result) // Target exists at index 2
    }

    @Test
    fun testSearchInsert_targetNotExists_insertPosition() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        val result = searchInsert(nums, target)
        assertEquals(1, result) // Target should be inserted at index 1
    }

    @Test
    fun testSearchInsert_targetLessThanAll() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 0
        val result = searchInsert(nums, target)
        assertEquals(0, result) // Target should be inserted at index 0
    }

    @Test
    fun testSearchInsert_targetGreaterThanAll() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        val result = searchInsert(nums, target)
        assertEquals(4, result) // Target should be inserted at the end
    }

    @Test
    fun testSearchInsert_emptyArray() {
        val nums = intArrayOf()
        val target = 3
        val result = searchInsert(nums, target)
        assertEquals(0, result) // Target should be inserted at index 0
    }
}

