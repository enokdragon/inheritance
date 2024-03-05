//+propertyName: String
//+commercialRate: $5/1000sqft
//+multiProperty: Boolean

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