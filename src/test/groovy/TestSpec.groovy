import spock.lang.Specification


class TestSpec extends Specification {

    def "some test"() {
        given: "some int value a initialized to 1"
        int a = 1

        expect: "a is equal to 1"
        a == 1
    }
}