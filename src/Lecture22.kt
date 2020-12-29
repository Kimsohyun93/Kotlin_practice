//null check
// ?. : null safe operator
// ?: : elvis operator
// !!. : non-null assertion operator .. nullpointer exception error 나도록 방치

fun main() {
    var a: String? = null

    println(a?.toUpperCase()) //null

    println(a?:"default".toUpperCase()) //DEFAULT

    println(a!!.toUpperCase())  //error


    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }
    // a null -> 실행x , a not null -> 실행o


    //a==b : 내용의 동일성 -> 코틀린의 모든 클래스가 내부적으로 상속받는 Any라는 최상위 클래스의 equals() 함수가 반환하는 Boolean 값
    //a===b : 객체의 동일성 -> 가르키는 객체가 같아야 함
    var a22 = Product("콜라", 1000)
    var b22 = Product("콜라", 1000)
    var c22 = a22
    var d22 = Product("사이다",1000)

    println(a22==b22) // true
    println(a22===b22) //false

    println(a22==c22) //true
    println(a22===c22) //true

    println(a22==d22)  //false
    println(a22===d22) //false
}

class Product(val name: String, val price: Int) {
    //equals 함수 customize
    override fun equals(other: Any?): Boolean {
        if(other is Product)
        {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}