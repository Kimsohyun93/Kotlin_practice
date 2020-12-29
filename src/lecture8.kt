fun main(){
    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)

//    println("안녕하세요, ${a.birthYear}년생 ${a.name}입니다")
    a.introduce()
}

class Person (var name:String, val birthYear:Int){
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다")
    }
}