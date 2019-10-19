object Basics extends App {
    def run = {
        val l = List("Hello ", "World")
        val str = l.reduce((acc, e) => {
            println(acc)
            acc + e
        })
        str
    }

    def sumListOfInt: Int = {
        val l = (2 to 10)
        val sum = l.reduce((acc, e) => {
            println(acc)
            acc + e
        })
        sum
    }

    println(sumListOfInt)
}


