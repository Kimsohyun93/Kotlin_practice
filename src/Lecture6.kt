fun main(){
    //while
    var a = 0
    while(a<5){
        println(a++)
    }

    //do while
    var b = 0

    do{
        println(a++)
    } while (a<5)

    //for
    for(i in 0..9 step 3) {
        print(i)
    }
    for(j in 9 downTo 0 step 3) {
        print(j)
    }
    for(l in 'a'..'c') {
        print(l)
    }
}