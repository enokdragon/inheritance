/**
 * @author Enok Dragon
 * Class Customer
 * @param
 * customer name, customer address, customer phone number, square footage of yard
 * property name, multiproperty(boolean)
 * display data function
 * calculate quote function
 * 3/5/2024
 */
import kotlin.jvm.internal.Ref.BooleanRef

class Residential(senior: Boolean,
                customerName: String,
                customerAddress: String,
                customerPhone: String,
                squareFootage: Double): Customer(customerName, customerPhone, customerAddress, squareFootage){

                    var senior: Boolean
                    init {
                        this.senior = senior
                    }

    fun calculate(squareFootage: Double, senior: Boolean){
        var cost: Double = (squareFootage / 1000.0) * 6.0
        if (senior == true){
            cost = cost * 0.85
            println("For $squareFootage square feet it will cost $$cost")
        }else{
            println("For $squareFootage square feet it will cost $$cost")

        }
    }

    fun display(){
        println("Quote from Dragon's Landscaping for $customerName")
        println("Customer Address: $customerAddress")
        println("Customer Phone Number: $customerPhone")
        if(senior){
            println("SENIOR DISCOUNT APPLIED")
        }
    }
                }
