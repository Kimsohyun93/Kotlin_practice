fun main(){
    // associatedBy : 아이템에서 key룰 추출하여 map으로 변환
    // groupBy : key가 같은 아이템끼리 배열로 묶어 map으로 만듦
    // partiton : 아이템에 조건을 걸어 두 개의 컬렉션으로 나누어 줌
    data class Person(val name: String, val birthYear : Int)

    val personList = listOf(Person("유나",1982),
                            Person("조이", 1996),
                            Person("츄", 1999),
                            Person("유나", 2003))
    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })

    val (over98, under98) = personList.partition { it.birthYear > 1998}
    println(over98)
    println(under98)

    //flatMap{} : 아이템마다 만들어진 컬렉션을 합쳐서 반환
    //getOrElse(){} : 인덱스 위치에 아이템 있으면 아이템 반환, 아닌경우 default 반환
    //collectionA zip collectionB : 컬렉션 2개 아이템을 1:1 pair로 매칭하여 새 컬렉션 만들어 줌

    val numbers = listOf(-3, 7, 2, -10, 1)
    println(numbers.flatMap { listOf(it*10, it+10) })

    println(numbers.getOrElse(1){50})
    println(numbers.getOrElse(10){50})

    val names = listOf("A", "B", "C", "D")
    println(names zip numbers)
}