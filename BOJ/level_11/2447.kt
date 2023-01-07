package level_11

/*
fun main() {
    val n = readln().toInt()

    for(i in 0 until n) {
        for (j in 0 until n) {
            star(i,j,n)
        }
        println()
    }
}

fun star(i: Int, j: Int, n: Int) {
    if((i/n)%3==1 && (j/n)%3 ==1) {
        print(" ")
    } else {
        if(n/3==0) {
            print("*")
        } else {
            star(i,j,n/3)
        }
    }
}
*/

private lateinit var arr: Array<Array<String>>

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    arr = Array<Array<String>>(n) { Array<String>(n) {" "} }

    star(0,0,n-1,n-1, n/3)

    for (i in arr) {
        for (j in i) {
            bw.write(j)
        }
        bw.write("\n")
    }
    bw.flush()
}

fun star(startX: Int, startY: Int, endX: Int, endY: Int, n: Int) {
    var count = 0
    for (i in startX .. endX step n) {
        for (j in startY .. endY step n){
            count ++
            if (count!=5) {
                if (n==1) {
                    arr[i][j] = "*"
                } else {
                    star(i,j,i+n-1,j+n-1,n/3)
                }
            }
        }
    }
}
