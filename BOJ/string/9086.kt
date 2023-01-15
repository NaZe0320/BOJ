package string

fun main() {
    val br = System.`in`.bufferedReader()
    repeat(br.readLine().toInt()) {
        val arr = br.readLine()
        print("${arr[0]}${arr[arr.length-1]}")
        println()
    }
}