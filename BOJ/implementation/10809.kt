package level_06

fun main() {
    val array = Array<Int>(26) {-1}
    val n = readln()
    var count = 0
    for (i in n) {
        if (array[i.toInt()-97] == -1)
            array[i.toInt()-97] = count
        count++
    }
    for (i in array) {
        print("$i ")
    }
}