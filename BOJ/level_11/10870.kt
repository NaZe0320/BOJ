package level_11

fun main() {
    val x = readln().toInt()
    print(fibo(x))
}

fun fibo(n: Int): Int {
    return if (n > 1) {fibo(n-1) + fibo(n-2)} else n
}