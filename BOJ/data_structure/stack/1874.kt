package data_structure.stack

import java.util.Stack

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val stack = Stack<Int>()

    val arr = ArrayList<Int>()
    val arr2 = ArrayList<String>()

    var check = true
    repeat(n) {
        arr.add(br.readLine().toInt())
    }
    var cnt = 1
    var x = 0
    while (x < n) {
        for (i in cnt .. arr[x]) {
            stack.push(i)
            arr2.add("+")
            cnt++
        }
        stack.pop()
        arr2.add("-")
        if (x < n-1 && stack.isNotEmpty()) {
            if (arr[x] > arr[x+1]) {
                if (stack.last() == arr[x+1]) {
                    x++
                    stack.pop()
                    arr2.add("-")
                } else {
                    check = false
                }
            }
        }
        x++
    }

    if (check) {
        for (i in arr2) {
            println(i)
        }
    } else {
        println("NO")
    }
}