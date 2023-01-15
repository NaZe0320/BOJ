package string

fun main() {
    val br = System.`in`.bufferedReader()

    val x = br.readLine()
    var y = ""
    for(i in x) {
        y += if (i in 'a'..'z') {
            (i.code - 32).toChar()
        } else {
            (i.code + 32).toChar()
        }
    }
    println(y)
}