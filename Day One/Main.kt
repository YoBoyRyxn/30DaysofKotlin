fun main(args: Array<String>) {

    println("Enter Price of the Item to Buy: ")
    var itemPricedValue = Integer.parseInt(readln())

    println("Enter Your Hourly Wage: ")
    val wage = Integer.parseInt(readln())

    println("Enter How Many Days You Work Daily: ")
    var weeklyDateDays = Integer.parseInt(readln())

    println("Enter Hours You Work Daily: ")
    var hoursWorked = Integer.parseInt(readln())

    val init = getOperator(wage, weeklyDateDays, hoursWorked) as Int;
    val itemInitReturn = itemPricedValue / init as Int

    println("You Will Have: To Wait $itemInitReturn Weeks to Buy Item:")

}

fun getOperator(a: Int, b:Int, c:Int): Int {

    val args = a * b * c as Int
    return args as Int

}

