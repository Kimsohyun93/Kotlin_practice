import kotlin.coroutines.*

fun main(){

    val scope = GlobalScope

    scope.launch {
        for(i in 1..5){
            println(i)
        }
    }
    //코루틴은 스코프가 종료되면 같이 종료 -> 일정한 범위에서 코루틴 모두 실행될 때 까지 잠시 기다려줘야 됨

    runBlocking{
        val a = launch{
            for(i in 1..5){
                println(i)
                delay(10)
            }
        }

        val b = async {
            "async 종료"
        }

        println("async 대기")
        println(b.await())

        println("launch 대기")
        a.join()
//        println("launch 종료")
//        a.cancle()
        println("launch 종료료")
    }


    runBlocking {
        var result = withTimeoutOrnull(50){
            for(i in 1..10) {
                println(i)
                delay(10)
            }
            "Finish"
        }
        println(result)
    }
}

// 여러개 루틴을 시에 실행하고 싶을 때 -> 비동기처리 코루틴
//main루틴과 별도로 진행이 가능, 개발자가 루틴의 실행과 종료를 마음대로 제어
//제어범위 실행범위 제어 가능 -> Scope
//GlobalScope : 프로그램 어디서나 제어, 동작이 가능한 기본 범위
//CoroutineScope : 특정한 목적의 Dispatcher를 지정하여 제어 및 동작이 가능한 범위
//Dispatchers.Default : 기본적인 백그라운드 동작 / Dispatchers.IO : IO에 최적화 된 동작 / Dispatchers.Main : 메인(UI) 스레드에서 동작
// launch : 반환값이 없는 Job 객체 / async : 반환값이 있는 Deffered 객체