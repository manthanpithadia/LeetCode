import java.util.Stack


fun main() {
    //Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
    //Output: 22
    println(evalRPN(tokens = arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")))
}

fun evalRPN(tokens: Array<String>): Int {
    var statck = Stack<Int>()
    var result = 0
    var n1 = 0
    var n2 = 0
    for (t in tokens) {
        when (t) {
            "+" -> { statck.push(statck.pop() + statck.pop()) }
            "-" -> {
                n1 = statck.pop()
                n2= statck.pop()
                statck.push(n2-n1)
            }
            "*" -> { statck.push(statck.pop() * statck.pop()) }
            "/" -> {
                n1 = statck.pop()
                n2= statck.pop()
                statck.push(n2/n1)
            }
            else -> statck.push(t.toInt())
        }
    }
    return statck.pop()
}