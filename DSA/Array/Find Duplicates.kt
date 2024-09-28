package DSA.Array

fun main() {
    findingDuplicates()
}

fun findingDuplicates(){
    // Find Duplicates into this - give optimal solution
    var array = arrayOf('f','i','n','d','i','n','g')
    var h = 0
    var x = 0

    for(it in array){
        x = 1
        x = x shl (it.code -97) // shl: shifting left by array[index] ASCII - 97 bits
        // Now performing masking operation
        if(x and h > 0){    // Masking - to check if bits are on in h or not by comparing x
            println(it)
        }
        else{
            h = h or x  // Merging - to merge bits of x into H so that we get to know whether number is value is repeating or not
        }
    }
}
