//singleton Pattern : 클래스의 인스턴스를 단 하나만 만들어 사용

fun main() {
    //object
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()
    println(Counter.count)

    //companion object
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
}
object Counter{
    //이미 객체이므로 따로 선언할 필요 없음음
   var count = 0

    fun countUp() {
        count++
    }
    fun clear(){
        count = 0
    }
}
class FoodPoll(val name:String){
    companion object {
        var total = 0
    }
    var count = 0
    fun vote() {
        total++
        count++
    }
}