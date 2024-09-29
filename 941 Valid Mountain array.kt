fun validMountainArray(arr: IntArray): Boolean {
    var n = arr.size
    if(n<3) return false
    // walk up
    var i = 0
    while(i+1<n && arr[i]<arr[i+1]) i++
    if(i==0 || i==n-1) return false
    // walk down
    while(i+1<n && arr[i]>arr[i+1]) i++

    return i==n-1
}