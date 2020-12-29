// nested class , inner class
fun main(){
    Outer.Nested().introduce() //Nested Class

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()  //Inner Class
    inner.introduceOuter()  //Outer Class

    outer.text = "Changed Outer Class"
    inner.introduceOuter()  //Changed Outer Class
}

class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }
    // Outer 안에 들어있지만 Outer와 Nested는 서로 안을 볼 수 없음

    inner class Inner {
        var text = "Inner Class"
        fun introduceInner() {
            println(text)
        }
        fun introduceOuter(){
            println(this@Outer.text)
        }
    }
}