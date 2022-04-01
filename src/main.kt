fun main(){
    var max=Bus("minibus","Toyota",23,"Grey")
    var car=Car("Forester","subaru",5,"silver black")
    car.carry(4)
    car.identity()
    car.calculateParkingFee(2)

    max.calculateParkingFee(5)

}

open class Car ( var model:String,  var make:String,   var capacity:Int, var color:String) {
    fun carry(people: Int) {
        var total= people-capacity

        if (people<=capacity){
            println("carry $people passengers")
        }
        else
            println("overcarrying by $total ")
    }
    fun identity() {
        println("I am a $color $make $model")

    }

    open fun calculateParkingFee(hours: Int): Int {
        var parkingFee = 20
        var total1=parkingFee * hours
        println(total1)
        return total1
    }
}

class Bus(model:String, make:String,capacity:Int,color:String):Car(model,make,capacity,color) {
    fun maxTripFare(fare: Double): Double {
        var max = 20
        var totalAmount = max * fare
        println(totalAmount)
        return totalAmount
    }

    override fun calculateParkingFee(hours: Int): Int {
        var product=hours*capacity
        println(product)
        return product

    }
}