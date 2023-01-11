package mathematics

fun main() {
    var n = readln().toInt()
    var count = 1
    while(n - count> 0) {
        n -= count
        count++
    }
    if (count%2!=0) print("${count-n+1}/$n")
    else print("$n/${count-n+1}")
}