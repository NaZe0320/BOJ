package level_11

private var count = 0

fun main() {
    val n = readln().toInt()

    repeat(n) {
        println("${isPalindrome(readln())} $count")
        count = 0
    }
}

fun recursion(s: String, l: Int, r:Int): Int {
    count++
    return if (l >= r) 1
            else if (s[l] != s[r]) 0
            else recursion(s,l+1,r-1)
}

fun isPalindrome(s: String): Int {
    return recursion(s, 0, s.length-1)
}