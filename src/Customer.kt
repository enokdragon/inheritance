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
