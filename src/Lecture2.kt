fun main(){

    var intValue:Int = 1234
    var longValue:Long = 1234L
    var intValueByHex:Int = 0x1af //16진수
    var intValueByBin:Int = 0b10110110 //2진수

    var doubleValue:Double = 123.5
    var doubleValueWithexp:Double = 123.5e10
    var floatValue:Float = 123.5f

    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'

    var booleanValue:Boolean = true

    val stringValue = "one line string test"
    val multiLineStringValue = """multiline
        |string
        |test""
    """.trimMargin()
    println(multiLineStringValue)
}