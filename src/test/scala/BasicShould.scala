
import org.scalatest.FunSuite

class BasicShould extends FunSuite{
    test("Can chain filter map and reduce"){
        val list = (1 to 2).toList
        val result = FuncExercise.chain(list)
        assertResult(1.0)(result)
    }

    test("Can count words of a sentence") {
        val numberOfWords: Int = FuncExercise.countWords(sentence)
        assertResult(4)(numberOfWords)
    }

    val sentence = "Have a good day"

    test("Can count words - 1"){
        val r = WordCounters.count1(sentence)
        println("The result of word counting is: " + r)

        assertResult((15,4,0))(r)
    }

    test("Can convert sequence of sequence to flat sequence"){
        val phrases = Array("Hi there", "how is going", "are you still there?")

        val flat = phrases.flatMap(_.split(' '))

        assertResult(Array("Hi", "there", "how", "is", "going", "are", "you", "still", "there?"))(flat)

    }
}
