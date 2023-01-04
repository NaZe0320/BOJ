package level_07

fun main() {
    val n = readln().toInt()
    var count = 0
    var room = 1
    do{
        room += (6 * count)
        count ++
    } while (n > room)
    print(count)
}