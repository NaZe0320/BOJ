package level_07

fun main() {
    val x = readln().split(" ")

    var len = if (x[0].length >= x[1].length) {
        x[0].length
    } else {
        x[1].length
    }
    val a = Array<Int>(len){0}
    val b = Array<Int>(len){0}
    val c = Array<Int>(len+1){0}

    var lenA = x[0].length
    for (i in x[0]) {
        a[lenA-1] = i.code-48
        lenA--
    }
    var lenB = x[1].length
    for (i in x[1]) {
        b[lenB-1] = i.code-48
        lenB--
    }

    for (i in 0 until len) {
        val n = a[i] + b[i]
        c[i] += n
        if (c[i]>=10) {
            c[i] %= 10
            c[i+1] += 1
        }
    }

    if (c[len]==0) {
        for (i in len-1 downTo 0) {
            print(c[i])
        }
    } else {
        for (i in len downTo 0) {
            print(c[i])
        }
    }
}