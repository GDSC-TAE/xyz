fun main() {
    var num : Int = 6
    var factorial : Int = 1
    do{
        factorial *= num
        num--
    }while(num > 0)
    println("Factorial of 6 is $factorial")
}
