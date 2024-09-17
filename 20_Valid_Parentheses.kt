import java.util.Stack

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val map = hashMapOf('(' to ')', '[' to ']', '{' to '}')

        for (c in s) {
            when {
                map.containsKey(c) -> stack.push(c)  // Push the opening bracket onto the stack
                map.containsValue(c) -> {
                    if (stack.isEmpty() || map[stack.pop()] != c) {
                        return false  // Mismatch or unbalanced
                    }
                }
            }
        }
        
        return stack.isEmpty()  // True if all brackets are matched
    }

