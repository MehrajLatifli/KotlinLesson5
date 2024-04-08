import java.util.*

fun main(args:Array<String> ) {


    println("\nSalary: ${Salary(InputDay())} ")
}


fun Salary( day:Int):Double{

    if(day<=20){

      return day*15.toDouble()
    }
    else{

        return day*15.toDouble()+ (day -20)*20
    }
}

fun InputDay():Int{

    var scanner = Scanner(System.`in`)
    print("Enter day: ")


    var day: Int? = null
    while (day == null || day <= 0) {
        if (scanner.hasNextInt()) {
            day = scanner.nextInt()
            if (day <= 0) {
                println("\nPlease enter a valid day (positive integer).")
                print("Enter day: ")
            }
        } else {
            println("Please enter a valid day (positive integer).")
            print("Enter day: ")
            scanner.next()
        }
    }


    return day
}