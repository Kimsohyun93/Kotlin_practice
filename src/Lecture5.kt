fun main(){
    var a = 7

    //if
    if(a>10){
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    //when -> switch
    doWhen(1)
    doWhen("Dimo")
    doWhen(12L)
    doWhen(3.14)
    doWhen("Kotlin")

}

fun doWhen(a: Any) {
    when(a) {
        1 -> println("정수 1 입니다")
        "Dimo" -> println("Dimo Kotlin")
        is Long -> println("Long Type")
        is String -> println("Not String Type")
        else -> println("어떤 조건도 만족하지 않음")
        // 부등호 연산 불가, 여러 조건 성립할 때도 먼저 부합하는 조건 실행
    }
/*    var result = when(a) {
*        1 -> "정수 1 입니다"
*        "Dimo" -> "Dimo Kotlin"
*        is Long -> "Long Type"
*        is String -> "Not String Type"
*        else -> "어떤 조건도 만족하지 않음"
*    }*/
}