import org.scalatest.FunSuite

class OopShould extends FunSuite {
    test("auxiliary ctor ") {
        val person = new Person(42)
        assertResult(42)(person.age)
        assertResult("")(person.name)
        assertResult(Char.MaxValue)(person.genre)
    }
}
