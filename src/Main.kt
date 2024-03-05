/**
 * @author Enok Dragon
 * @date 3/5/2024
 * Main Function
 * Uses Customer,Commercial, and Residential Classes
 */
import kotlin.system.exitProcess

fun main() {
    println("Welcome to Dragon's Lawn Care\nEnter the number next to your desired type of transaction")
    println("1.Commercial")
    println("2.Residential")
    println("3.Done")
//    var test = 40
//    test = test + 60
//    println(test)
    var choice = readln()
    var choiceInt = choice.toInt()
    //try {
        if(choiceInt == 1){         //commercial customer
            println("Please enter your property name.")
            var propName = readln()
            println("Please enter your customer name.")
            var customerName = readln()
            println("Please Enter your address")
            var address = readln()
            println("Please Enter your phone number")
            var phone = readln()
            println("Please Enter your yard's square footage")
            var squareFootage = readln().toDouble()
            println("If you have multiple properties, enter 1")
            var multi: String = readln()
            var multiProp: Boolean
            if (multi == "1"){      //changes multi into a boolean for multiProperty to be passed to class
                multiProp = true
            }else{
                multiProp = false
            }
            var commercialCustomer = Commercial(propName, customerName, address, phone, squareFootage, multiProp)
            commercialCustomer.display()
            commercialCustomer.calculate(squareFootage, multiProp)

        }else if(choice.toInt() == 2){      //Residential customer
            println("Please enter your name.")
            var name = readln()
            println("Please Enter your address")
            var address = readln()
            println("Please Enter your phone number")
            var phone = readln()
            println("Please Enter your yard's square footage")
            var squareFootage = readln().toDouble()
            println("Are you a senior? If so inout the number 1")
            var elderly = readln()
            var senior: Boolean
            if (elderly == "1"){      //changes elderly into a boolean for senior to be passed to class
                senior = true
            }else{
                senior = false
            }
            var residentialCustomer = Residential(senior, name, address, phone, squareFootage)
            residentialCustomer.display()
            residentialCustomer.calculate(squareFootage, senior)

        }else if (choice == "3"){   //done
            exitProcess(return)
        }else{
            println("Unknown input")
        }

    //}catch{NumberFormatException}{
    //    println("Unknown input")
    //}

}
