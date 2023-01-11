package level_07

fun main() {
    val x = readln().split(" ")
    val a = x[0].toInt()
    val b = x[1].toInt()
    val v = x[2].toInt()

    if (v==a) {
        print(1)
    } else {
        if ((v-a)%(a-b)!=0) {
            print((v-a)/(a-b)+2)
        } else {
            print((v-a)/(a-b)+1)
        }
    }
}