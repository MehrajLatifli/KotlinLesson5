fun main(args:Array<String> ) {

    Function1()
    Function2("Hello World")
    println(Function3("Hello World"))

}

fun Function1(){
    println("Hello World")
}

fun Function2(text: String, text2: String=""){
    println(text)
}

fun Function3(text: String):String{
    return text
}