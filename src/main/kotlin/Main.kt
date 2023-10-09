fun main (){

    val itemCount = 100
    val itemPrice =100
    val discount1 = 100
    val discount2 = 0.05
    val discount1Start = 1_000
    val discount2Start = 10_000
    val regularClient = false
    val regularClientDiscount = 0.01


    var totalPrice = itemCount*itemPrice

    var  result  = if (totalPrice>discount2Start) totalPrice*(1-discount2)
    else if (totalPrice>discount1Start) totalPrice-discount1 else totalPrice

    var finalResult = if (regularClient) result*(1-regularClientDiscount) else result

    println("Total price: $finalResult")

}

