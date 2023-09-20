package bird.define

class Bird{
    var name:String="pipi"
    var wing:Int=2
    var leg:String="short"
    var color:String="red"
    
    fun fly()=println("Fly wing: $wing")
    fun sing(vol:Int)=println("Sing vol: $vol")
    
}

fun main(){
    val bibi=Bird()
    bibi.color="yellow"
    
    println("bibi.color: ${bibi.color}")
    bibi.fly()
    bibi.sing(5)
}
