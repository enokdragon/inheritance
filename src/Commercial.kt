//+propertyName: String
//+commercialRate: $5/1000sqft
//+multiProperty: Boolean
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
open class Commercial(propertyName: String,
                 customerName: String,
                 customerAddress: String,
                 customerPhone: String,
                 squareFootage: Double,
                multiProperty: Boolean): Customer(customerName, customerAddress, customerPhone, squareFootage){

    var multiProperty: Boolean
    var propertyName: String

    init {
                        this.propertyName = propertyName
                        this.multiProperty = multiProperty
                    }
                    fun calculate(squareFootage: Double, multiProperty: Boolean){
                        var cost: Double = (squareFootage / 1000.0) * 5.0
                        if (multiProperty == true){
                            cost = cost * 0.9
                            println("For $squareFootage square feet it will cost $$cost")
                        }else{
                            println("For $squareFootage square feet it will cost $$cost")

                        }
                    }

                    fun display(){
                        println("Quote from Dragon's Landscaping for $propertyName for $customerName")
                        println("Customer Address: $customerAddress")
                        println("Customer Phone Number: $customerPhone")
                    }
                }
