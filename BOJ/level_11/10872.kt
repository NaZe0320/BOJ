package level_11

fun main() {
    val x = readln().toInt()
    println(factorial(x))
}

fun factorial(n:Int): Int {
    return if (n > 0) n * factorial(n-1) else 1
}