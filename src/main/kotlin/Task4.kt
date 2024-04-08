import java.util.*

fun main(args:Array<String> ) {

    Calculators(InputNumbers(),InputString(),InputNumbers())

}




fun Calculators( number1: Double, operator: String, number2: Double)
{

    when (operator) {
        "+" -> {
            println(number1 + number2)
        }

        "-"  -> {
            println(number1 - number2)
        }

        "*"  -> {
            println(number1 * number2)
        }

        "/"  -> {
            println(number1 / number2)
        }

        else -> {
            print("\nThe fallacy of choice")

        }
    }
}

fun InputString():String{

    var scanner = Scanner(System.`in`)
    print("Enter operation: ")


    var opetation: String? = null
    while (opetation == null || opetation =="") {
        if (scanner.hasNext()) {
            opetation = scanner.next()

        } else {
            println("Please enter a valid opetation.")
            print("Enter operation: ")
            scanner.next()
        }
    }


    return opetation
}

fun InputNumbers():Double{

    var scanner = Scanner(System.`in`)
    print("Enter number: ")


    var number: Double? = null
    while (number == null || number <= 0) {
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble()

        } else {
            println("Please enter a valid number (positive double).")
            print("Enter number: ")
            scanner.next()
        }
    }


    return number
}