package level_06

fun main() {
    val list = arrayListOf<String>("c=","c-","dz=","d-","lj","nj","s=","z=")
    var x = readln()
    for (i in list) {
        x = x.replace(i," ")
    }
    print(x.length)
}