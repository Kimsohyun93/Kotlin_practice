fun main() {
    //Const
    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    //lateinit
    val a = LateInitSample()

    println(a.getLateInitText())
    a.text="새로 할당된 값"
    println(a.getLateInitText())

    //lazy - 변수를 처음 사용할 때 실제로 초기화하므로 실행시간 최적화 할 수 있음
    val number: Int by lazy {
        println("초기화를 합니다")
        7 //return
    }
    println("코드를 시작합니다")
    println(number)
    println(number)
}

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when(foodName)
        {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("${foodName}의 가격은 ${price}원 입니다")
    }
    companion object{
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
    //변수의 경우 런타임 시 객체를 생성할 때 시간이 더 소요됨
}

class LateInitSample {
    lateinit var text: String
    fun getLateInitText(): String {
        if(::text.isInitialized){
            return text
        } else {
            return "기본값"
        }
    }
}