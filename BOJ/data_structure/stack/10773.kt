package data_structure.stack

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val stack = Stack<Int>()
    repeat (br.readLine().toInt()) {
        val x = br.readLine().toInt()

        if (x == 0) {
            stack.pop()
        } else {
            stack.push(x)
        }
    }
    var sum = 0
    for (i in stack) {
        sum += i
    }
    println(sum)
}