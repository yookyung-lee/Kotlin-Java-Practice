//mobile software lecture


fun main() {

//list
    val greenNumbers= listOf(1,4,23)
    val redNumbers=listOf(17,2)
    val total= greenNumbers.count()+ redNumbers.count()
    println("total: $total")
    
    ///set
    val SUPPORTED= setOf("HTTP", "HTTPS", "FTP")
    val requested="smtp"
    val isSupported=requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
   
   //map
   val number2word= mapOf(1 to "one", 2 to "two", 3 to "three")
   val n=2
   println("$n is spelt as '${number2word[n]}'")
}
