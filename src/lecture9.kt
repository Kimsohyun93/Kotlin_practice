fun main(){
    var a =Person1("박보영", 1990)
    var b = Person1("전정국", 1997)

    var c = Person1("이루다")
    var d = Person1("차은우")
}

class Person1 (var name:String, val birthYear:Int){
    init {
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다")
    }

    constructor(name:String) : this(name, 1997){
        println("보조생성자가 사용되었습니다")
    }
}


