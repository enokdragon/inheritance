/**
 * @author Enok Dragon
 * Class Customer
 * @param
 * customer name, customer address, customer phone number, square footage of yard
 * 3/5/2024
 */
open class Customer(customerName: String,
                    customerAddress: String,
                    customerPhone: String,
                    squareFootage: Double){

    var customerPhone: String
    var customerAddress: String
    var customerName: String
    var squareFootage: Double


    init {
        this.customerName = customerName
        this.customerAddress = customerAddress
        this.customerPhone = customerPhone
        this.squareFootage = squareFootage
    }

}


//+ customerName: String
//+ customerAddress: String
//+ customerPhone: String
//+ squareFootage: Double
