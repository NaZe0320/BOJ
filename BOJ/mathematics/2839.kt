package level_07

fun main() {
    var n = readln().toInt()
    var count = n/5

    var x = n%5

    when (x) {
        0 -> {println(count)}
        else -> {
            while (true) {
                if (x%3!=0) {
                    if (count >= 1) {
                        count--
                        x += 5
                    } else {
                        println(-1)
                        break
                    }
                } else {
                    count += x/3
                    println(count)
                    break
                }
            }
        }
    }
}