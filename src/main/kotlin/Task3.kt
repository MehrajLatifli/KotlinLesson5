import java.util.*

fun main(args:Array<String> ) {

    println("\nFactorial: ${Factorial(InputNumber())} ")
    println("\nFactorial: ${Factorial2(InputNumber())} ")
}

fun InputNumber():Int{

    var scanner = Scanner(System.`in`)
    print("Enter number: ")


    var number: Int? = null
    while (number == null || number <= 0) {
        if (scanner.hasNextInt()) {
            number = scanner.nextInt()
            if (number <= 0) {
                println("\nPlease enter a valid number (positive integer).")
                print("Enter number: ")
            }
        } else {
            println("Please enter a valid number (positive integer).")
            print("Enter number: ")
            scanner.next()
        }
    }


    return number
}

fun Factorial(number:Int):Int{

    var fact =1

    for (i in 1..number)
    {

        fact=fact*i
    }

    return  fact
}

fun Factorial2(number:Int):Int{

    var index =1
    var fact =1

    while (index<=number)
    {
        fact *= index
        index++
    }

    return  fact
}