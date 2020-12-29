fun main(){

    var bitData: Int = 0b10000

    bitData = bitData or(1 shl 2)   //0b10000 or 0b100
    println(bitData.toString(2))  //0b10100

    var result = bitData and(1 shl 4)   //0b10100 and 0b10000
    println(result.toString(2))    //0b10000

    println(result shr 4)   //0b1

    bitData = bitData and((1 shl 4).inv()) //0b10100 and 0b01111
    println(bitData.toString(2))    //0b00100

    println((bitData xor(0b10100)).toString(2)) //0b10000
}
//비트 연산 : 정수형의 데이터를 비트단위로 나누어 데이터를 좀 더 작은 단위로 담아 경제성 높임
//        -변수 하나의 여러개의 값을 담아 사용할 수 있음 ..but 부하를 무시할 수 없다
//        -> flag값을 처리하거나 네트워크 등에서 프로토콜의 데이터 양 줄이기 위해 사용

//bitwise shift operators
//        -shl : 부호비트를 제외한 모든 비트를 좌측으로 밀어주는 기능
//        -shr : 부호비트를 제외한 모든 비트를 우측으로 밀어주는 기능
//        -uslr : 부호비트를 포함하여 모든 비트를 우측으로 밀어주는 기능

//bitwise operators
//        - and(원하는 위치의 비트를 확인하는 용도, 0으로 만들어주고 싶은 bit에만 0을 넣어 연산해주어 비트를 clear하는 방법)
//        - or (비트값을 1로 만들고 싶은 부분만 1로 넣어 연산)
//        - xor (비트들이 같은지 확인할 때 사용)
//        - inv() : 비트 모두 반전