fun main(){
    var a18 = Drink()
    a18.drink()

    var b18: Drink = Cola()
    b18.drink()

//    b.washDishes() ..error

    if(b18 is Cola){
        b18.washDishes() //if문 안에서 잠시 downcasting
    }

    var c18 = b18 as Cola
    c18.washDishes()
    b18.washDishes()  //not error .. return 값 뿐 아니라 b 자체도 downcasting

}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}를 마십니다")
    }
}
class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }
    fun washDishes() {
        println("${type}로 설거지를 합시다")
    }
}

// upcasting / downcasting
// upcasting -> 그냥 하면 됨, downcasting -> as or is
// as : 호환되는 자료형으로 변환해줌
// is : 형변환이 가능한지 먼저 체크한 후 형변환 (return & 변수 둘다)