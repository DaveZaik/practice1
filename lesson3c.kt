//functions with parameters
fun Personal_details(name:String,age:Int){
    println("The name of the employee is $name and he/she is $age years old")
}
fun performance (marks:Int,name:String){
    print("Student name is: $name ")
    if (marks<40)println("Failed")
    else if(marks>=40 && marks<50)println("Grade D")
    else if(marks>=50 && marks<60)println("Grade C")
    else if(marks>=60 && marks<70)println("Grade B")
    else if(marks>=70 && marks<=100)println("Grade A")
}

//functions with return statement
//the value of the function will be the return statement
//the return something in a fuction,declare the data type when defining the function
//the function becomes a value

fun SI(p:Int,r:Int,t:Int):Int{
    var simple_interest=p*r*t/100
    return simple_interest
}
//a function to validate an email
fun validate_email(email:String):Boolean{
    val validEmail="^[A-Za-z0-9+]+@(.+)"
    //regular express to check if email matches with conditions
    return Regex (validEmail).matches(email)
}

//create a function that validates  a password and test if a given password is valid
fun validatePassword(password: String):Boolean{
val validatepassword="^[A-Za-z0-9+]+!"
}
    
fun main (args:Array<String>){
    //call the other functions
    Personal_details("Doris",21)
    performance(50,"Jane")
    var si=SI(40000,10,2)
    println(si)
    println(SI(120000,3,1))

    //check if email is valid
    if (validate_email("Max@gmail3.com")){
        println("Email is valid")
    }
    else{
        println("Email is not valid")
    }
    //test for password validation
    val password="Something123"
    println(validatePassword)
}