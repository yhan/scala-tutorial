object WordCounters {

    def count1(s: String) : (Int, Int, Int) = {
        val c = s.length // Number of chars
        val w = s.split("\\w+").size // Number of words
        val l = s.count(_ == '\n') // number of lines - 1
        (c, w, l)
    }
}
