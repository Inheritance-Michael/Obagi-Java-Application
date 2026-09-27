package chapter1

fun main() {
    print("Enter your weight in kilograms: \n")
    val  weight = getWeight()

    print("Enter your height in meters: \n ")
    val height = getHeight()

    val bmi = weight / (height * height)

    if (bmi < 18.5){
        println("You are underweight. ")
    }else if(bmi >= 18.5 && bmi > 24.9){
        println("You have a normal weight. ")
    }else{
        println("You are not overweight. ")
    }
}

fun getWeight(): Double {
    val weight = readln().toDouble()
    return weight
}

fun getHeight(): Double {
    val height = readln().toDouble()
    return height
}
