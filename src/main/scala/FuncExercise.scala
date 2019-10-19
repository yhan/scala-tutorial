object FuncExercise {

    def countWords(sentence: String): Int = {
        val words: Array[String] = sentence.split(' ')
        words.map(w => 1).reduce(_+_ )
    }

    def chain(l: List[Int]): Double = {
        //filter out the odd number, square them and finally sum them up
        l.filter(_ % 2 != 0).map(x => Math.sqrt(x)).reduce(_ + _)
    }
}

