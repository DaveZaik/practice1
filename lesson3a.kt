// kotlin when statement
fun main(args: Array<String>) {
    //create a program to display the season based on a given month
    var month:String="april"
    when (month){
        "December","January","February" ->println("spring")
        "March","april","may" ->println("winter")
        "June","July","August" ->println("summer")
        "September","October","November" ->println("Autum")
    }
    

    // CREATE A PROGRAM TO DISPLAY THE NAME OF AN OBJECT BASED ON AN INPUT
    var object1:String="earth"
    when (object1){
        "sun" ->println("$object1 is a star")
        "earth" ->println("$object1 is a planet")
        "moon" ->println("$object1 is a satelite")
    }
}