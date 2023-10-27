fun main(args: Array<String>){
    var weight:Int=90
    var height:Double=1.8
    var BMI=weight/(height*height)
    println(BMI)
    if (BMI>18.5 && BMI<=22.9){
        println("Your Are Normal")
    }
    else if(BMI>23.0 && BMI<=24.9){
        println("Your Are Overweight")
    }
    else if(BMI>24.0 && BMI<=29.9){
        println("$BMI Your Are Pre-Obese")
    }
    else if(BMI>30.0 && BMI<=34.9){
        println("Your Are Obese Class I")
    }
    else if(BMI>35.0 && BMI<=39.9){
        println("Your Are Obese Class II")
    }
    else if(BMI>=40.0){
        println("Your Are Obese Class III")
}
    else{
        println("Your Are Underweight")
    }
    
}