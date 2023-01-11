package level_06

fun main() {
    val n = readln().toInt()

    var count = 0

    for (x in 0 until n) {
        val list = arrayListOf<Char>()
        var before: Char = ' '
        var check = true
        for (i in readln()){
            if (list.contains(i)) {
                if (before != i) {
                    check = false
                    break
                }
            } else {
                list.add(i)
                before = i
            }
        }
        if (check) count ++
    }
    print(count)
}