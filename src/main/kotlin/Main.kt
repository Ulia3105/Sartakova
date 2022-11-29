fun main() {
    //// определение объёма прямоугольного параллелепипеда
    println("Hello! Please specify three sides and I will calculate the volume")
    println("Enter the first side:")
    val side1=readln()
    println("Enter the second side:")
    val side2=readln()
    println("Enter the third side:")
    val side3=readln()
    val volume=side1.toInt() *side2.toInt()*side3.toInt()
    println("The volume is equal to " )
    println(volume)



}