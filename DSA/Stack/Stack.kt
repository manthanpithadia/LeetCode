package DSA.Stack

import kotlin.test.Test
import kotlin.test.assertEquals

fun main() {
    var stack = Stack<Int>(5)
    stack.push(5)
    stack.traverse()
    println( stack.peek())
    stack.pop()
}

class Stack<T>(private val size: Int): IStack<T>{
    private val stack = Array<Any?>(size){null}
    private var top = -1

    override fun push(data: T) {
        // check if stack is full or not
        if(top==size-1) {
            println("Stack is Full")
            return
        }
        top++
        stack[top] = data
    }

    override fun pop() {
        // Check if stack is empty or not
        if(top==-1){
            println("Stack is Empty")
            return
        }
        println("${stack[top]} is popped")
        stack[top] = null
        top--
    }

    override fun peek(): T? {
        // Check if stack is empty of not
        if(top==-1) return null
        return stack[top] as T
    }

    override fun isEmpty(): Boolean = top==-1

    override fun traverse() {
        if(this.isEmpty()) return
        for(i in top downTo 0){
            print("${stack[i]}")
            if(i>0) print(", ")
            else print(".")
        }
    }
}

interface IStack<T>{
    // To add data
    fun push(data: T)

    // To remove element from top
    fun pop()

    // To get value of top element
    fun peek(): T?

    // to check if it is empty or not
    fun isEmpty() : Boolean

    fun traverse()
}

// Unit Test
class StackTest{
    @Test
    fun peekTest(){
        val stack = Stack<Int>(2)
        stack.push(10)
        val target = 10
        val result = stack.peek()
        assertEquals(target,result)
    }
}