import kotlin.math.max

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    // Sort the IntArray by the starting interval number
    // check if interval1.end >= interval2.start
    //      -> yes {result.add(arrayOf(interval1.start,interval2.end))}
    //      -> no {result.add(interval1,interval2)}

    // assume that list is already sorted
    if(intervals.size==1) return intervals

    val sortedIntervals = intervals.sortedBy { it[0] }
    var list = mutableListOf<IntArray>()

    var prevInterval = sortedIntervals[0]
    var start = 0
    var end = 1

    for(i in 1 until sortedIntervals.size){
        var currentInterval = sortedIntervals[i]

        if(prevInterval[end]>=currentInterval[start]){
            // Merge both of them
            prevInterval[end] = max(prevInterval[end],currentInterval[end])
        }
        else{
            // No Overlapping then add to the final result
            list.add(prevInterval)
            prevInterval = currentInterval
        }
    }
    // add Last merged interval
    list.add(prevInterval)
    return list.toTypedArray()
}

