package level_07

fun main() {
    val x = readln().toInt()

    repeat(x) {
        val k = readln().toInt()
        val n = readln().toInt()

        val array = Array<Int>(n) {0}
        for (i in 0 until n) {
            array[i] = i+1
        }
        val array2 = Array<Int>(n) {0}

        repeat(k) {
            for (j in 0 until n) {
                var sum = 0
                for (m in 0 .. j) {
                    sum += array[m]
                }
                array2[j] = sum
            }
            for (i in 0 until n) {
                array[i] = array2[i]
            }
        }
        println(array[n-1])
    }
}