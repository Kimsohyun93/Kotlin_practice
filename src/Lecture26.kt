fun main() {
    // Set : 순서가 정렬되지 않으며 중복이 허용되지 않는 컬렉션
    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a){
        println("${item}")
    }
    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))

    // Map : 객체를 넣을 때 그 객체를 찾아낼 수 있는 key를 쌍으로 넣어줌
    val b = mutableMapOf("레드벨벳" to "음파음파",
                        "트와이스" to "FANCY",
                        "ITZY" to "ICY")

    for(entry in b){
        println("${entry.key} : ${entry.value}")
    }
    b.put("오마이걸", "번지")
    println(b)

    b.remove("ITZY")
    println(b)

    println(b["레드벨벳"])
}