fun main(){
    var t = Tiger()
    t.eat()

    var r = Rabbit()
    r.eat()
    r.sniff()

    var d = Dog1()
    d.eat()
    d.run()
}

open class Animal1{
    open fun eat() {
        println("음식을 먹습니다")
    }
}

//override
class Tiger : Animal1(){
    override fun eat(){
        println("고기를 먹습니다")
    }
}

//abstract
abstract class Animal2(){
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit : Animal2(){
    override fun eat() {
        println("당근을 먹습니다")
    }
}

//interface
interface Runner{
    fun run()
}
interface Eater{
    fun eat(){
        println("음식을 먹습니다")
    }
}

class Dog1 : Runner, Eater {
    override fun run(){
        println("우다다다 뜁니다")
    }
    override fun eat(){
        println("허겁지겁 먹습니다")
    }
}