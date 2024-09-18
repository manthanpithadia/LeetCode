import java.util.Hashtable

fun isAnagram(s: String, t: String): Boolean {
    val dict = IntArray(26)

    for (ch in s) {
        dict[ch - 'a']++
    }

    for (ch in t) {
        dict[ch - 'a']--
    }

    for (c in dict) {
        if (c != 0) {
            return false
        }
    }
    return true
}
