package mathematics

fun main() {
    val br = System.`in`.bufferedReader()

    val x = br.readLine()
    val arr1 = ArrayList<Int>()
    val arr2 = ArrayList<String>()
    x.split("+","-").map { arr1.add(it.toInt()) }
    x.split("0","1","2","3","4","5","6","7","8","9").map { if (it=="+") arr2.add(it) else if (it=="-") arr2.add(it) else null}

    var sum = 0

    for (i in arr2.indices) {
        if (arr2[i] == "-") {
            var num = i + 1
            while (num <= arr2.size-1 && arr2[num] != "-") {
                sum += arr1[num+1]
                num ++
            }
        }
    }
    var nor = arr1[0]
    for (i in arr2.indices) {
        if (arr2[i]== "+") {
            nor += arr1[i+1]
        } else {
            nor -= arr1[i+1]
        }
    }
    println(nor-sum*2)
}

//1회 틀림
//사유 - 문제 이해를 잘못함 - 괄호를 1번만 써서 최소값을 구하는걸로 잘못 파악함.