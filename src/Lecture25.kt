//Data class : equals(), hashcode(), toString(), copy(), componentX() 자동 구현
//Enum class : 상태를 구분하기 위한 객체들을 여러개 생성하고 그중 하나를 선택하여 나타냄
fun main(){

    val a = General("보영",212)

    println(a==General("보영", 212))  //equals()
    println(a.hashCode())   //hashcode()
    println(a)  //toString()

    val b = Data("루다", 306)

    println(b==Data("루다", 306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id=618))

    //componentX()
    val list = listOf(Data("보영", 212),
                    Data("루다", 306),
                    Data("아린", 618))

    for((a, b) in list){
        println("${a}, ${b}")
    } // a : component1, b : component2

    //Enum class
    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)

}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)

enum class State(val message: String){
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다") ;
    fun isSleeping() = this == State.SLEEP
}
