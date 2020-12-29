fun main(){
    EventPrinter().start()
}
interface EventListener{
    fun onEvent(count:Int)
}
class Counter1(var listener: EventListener) {
    fun count(){
        for(i in 1..100){
            if(i%5==0) listener.onEvent(i)
        }
    }
}

//class EventPrinter : EventListener {
//    override fun onEvent(count: Int) {
//        print("${count}-")
//    }
//    fun start(){
//        val counter = Counter1(this)
//        counter.count()
//    }
//}
//이름이 없는 object를 만들어 사용할 수도 있음(상속X)
class EventPrinter {
    fun start() {
        val counter = Counter1(object:EventListener{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}