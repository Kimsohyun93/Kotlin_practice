
val aa = "패키지 스코프"

class B {
    //val aa = "클래스 스코프"
    fun print(){
        println(aa)
    }
}
fun main(){
    //val aa = "함수 스코프"
    println(aa)
    B().print()
}