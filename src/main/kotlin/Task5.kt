import java.util.*

fun main(args:Array<String> ) {

    CalculatorBMI(Inputweight(),Inputheight())
}

fun Inputweight():Double{

    var scanner = Scanner(System.`in`)
    print("Enter weight(kg): ")


    var weight: Double? = null
    while (weight == null || weight <= 0) {
        if (scanner.hasNextDouble()) {
            weight = scanner.nextDouble()
            if (weight <= 0) {
                println("\nPlease enter a valid weight (positive integer).")
                print("Enter weight(kg): ")
            }
        } else {
            println("Please enter a valid weight (positive integer).")
            print("Enter weight(kg): ")
            scanner.next()
        }
    }


    return weight
}

fun Inputheight():Double{

    var scanner = Scanner(System.`in`)
    print("Enter height(m): ")


    var height: Double? = null
    while (height == null || height <= 0) {
        if (scanner.hasNextDouble()) {
            height = scanner.nextDouble()
            if (height <= 0) {
                println("\nPlease enter a valid height (positive integer).")
                print("Enter height(m): ")
            }
        } else {
            println("Please enter a valid height (positive integer).")
            print("Enter height(m): ")
            scanner.next()
        }
    }


    return height
}

fun CalculatorBMI( weight: Double, height: Double)
{

    var calc = weight/(height*height)

    println("\nAnswer: ${calc}")

    when (calc) {
        18.5 -> {
            println("\nLight weight")
        }

        in 18.5..25.0  -> {
            println("\nNormal weight")
        }

        in 25.0..30.0  -> {
            println("\nHeavy weight")
        }

       30.0 -> {
            println("\nHeavy weight")
        }

        else -> {
            print("\nThe fallacy of choice")

        }
    }
}