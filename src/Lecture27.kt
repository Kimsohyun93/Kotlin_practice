fun main(){
    val namelist = listOf("박수영","김지수","김다현","신유나","김지우")
    namelist.forEach{ print(it + " ")}
    println()

    println(namelist.filter{ it.startsWith("김")})
    println(namelist.map{ "이름 : " + it})

    println(namelist.any{ it == "김지연"})
    println(namelist.all{ it.length == 3})
    println(namelist.none{ it.startsWith("이")})

    println(namelist.first{ it.startsWith("김") })
    println(namelist.last{ it.startsWith("김") })
    println(namelist.count{ it.contains("지") })
}
//컬렉션 함수 : list, set, map, array 에 일반함수 람다함수 형태를 사용하여 for 문 없이도 아이템 순회하거나 조건을 걸고 구조 변경까지 가능
