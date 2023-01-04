package level_06

fun main() {
    val array = Array<Int>(26) {0}
    var n = readln()

    n = n.toUpperCase()

    for (i in n) {
        array[i.toInt()-65] ++
    }
    var max = 0
    var count = 0
    var index = 0
    for (i in 0..25) {
        if (max < array[i]) {
            max = array[i]
            index = i
            count = 0
        } else if (max == array[i]) {
            count ++
        }
    }

    if (count > 0) {
        print("?")
    } else {
        print((index+65).toChar())
    }
}