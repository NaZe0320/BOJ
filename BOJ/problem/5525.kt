package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val s = br.readLine()

    var cnt = 0 //검사 시작 위치
    var check = true

    var ans = 0

    while (cnt < m-(n*2)) { //최대로 가능한 검사 시작 위치
        if (s[cnt]=='I') {
            for (i in 1 ..n*2) {
                if ((i%2==1 && s[cnt+i]!='I')||(i%2==0 && s[cnt+i]=='I') ){
                    //?
                } else {
                    cnt += i
                    check = false
                    break
                }
            }
            if (check) {
                ans++
                cnt += n*2
                while (cnt < m-2 && check) {
                    if (s[cnt+1]=='O' && s[cnt+2]=='I') {
                        ans ++
                        cnt += 2
                    } else {
                        check = false
                    }
                }
            }
            check = true
        } else {
            cnt++ //I가 아니면 바로 다음꺼 검사
        }
    }
    bw.write("$ans")
    bw.flush()
    bw.close()
}