fun main(){
    UsingGeneric(A19()).doShouting()
    UsingGeneric(B19()).doShouting()
    UsingGeneric(C19()).doShouting()

    doShouting(B19())  //함수로 사용

}
fun <T :A19> doShouting(t: T) {
    t.shout()
}
open class A19 {
    open fun shout() {
        println("A가 소리칩니다")
    }
}

class B19 : A19() {
    override fun shout() {
        println("B가 소리칩니다")
    }
}
class C19 : A19() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

class UsingGeneric<T: A19> (val t : T){
    fun doShouting() {
        t.shout()
    }
}
//캐스팅 연산 - 프로그램 속도 저하
//generic : 함수나 클래스 선언 시 고정적 자료형 아닌 타입 파라미터 받아 사용(<T>)
//fun <T> genericFunc (var param:T){}