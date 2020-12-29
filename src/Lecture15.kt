val c1:(String) -> Unit = {str -> println("$str 람다함수")}
val c2:(String) -> Unit = {str ->
    println("$str 람다함수")
    println("여러 구문을")
    println("사용가능")
}
val calculate:(Int, Int) -> Int={a,b ->
    println(a)
    println(b)
    a+b     //여러 줄로 람다함수 적을 경우 마지막 구문이 반환됨
}
//parameter 없을 때
//val a:() = {println("파라미터 없음")}
//parameter 1개인 경우
val b:(String) -> Unit = {println("$it 람다함수")}


fun main(){
    // var price = 5000
    //instance func - apply
    var a = Book("디모의 코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }
    //instance func - run(run scope 내에서는 참조연산자 사용 안해도)
    a.run {
        println("상품명 : ${name}, 가격 : ${price}원")
        //main 함수에 같은 이름의 함수 있다면 main 함수 내 변수 우선(price = 5000)
    }
    //a.run = with(a)
    //also(=apply), let(=run) ..파라미터를 받는 것 처럼 it 사용
    a.let {
        println("상품명 : ${it.name}, 가격 : ${it.price}원")
        //스코프 외부에 같은 이름이 있을 때 혼란 방지(price = 8000)
    }
}

class Book(var name: String, var price: Int){
    fun discount()
    {
        price -= 2000
    }
}