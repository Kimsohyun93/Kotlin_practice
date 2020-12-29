fun main(){
    b(::a)

    val c : (String)->Unit = {str -> println("$str 람다함수")}
//  val c = {str:String -> println("$str 람다함수")}   ..타입추론
    b(c)
}
fun a (str:String){
    println("$str 함수 a")
}
//String을 받고 return은 없음

fun b (function: (String)->Unit){
    function("b가 호출한")
}

