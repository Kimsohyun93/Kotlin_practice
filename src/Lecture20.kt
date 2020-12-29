fun main(){

    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a)
    {
        print("${fruit}:")
    }
    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2,8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}


//collection subclass중 하나
//데이터를 원하는 순서대로 넣음
//         - List<out T> : 생성시에 넣은 객체를 변경 불가
//         - MutableList<T> : 생성시 넣은 객체를 변경 가능