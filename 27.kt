fun removeElement(nums: IntArray, element: Int): Int {
    var dict = IntArray(nums.size){0}
    var counter = 0
    for(i in nums.indices) {
        if(nums[i]!=element) dict[i]=1
    }
    for((i,d) in dict.withIndex()){
        if(d==1){
            nums[counter] = nums[i]
            counter++
        }
    }
    return counter
}