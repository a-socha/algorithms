package reverseInteger

import spock.lang.Specification

class ReverseIntegerTest extends Specification {
    def "should reverse properly"() {
        when:
        def result = new ReverseInteger().reverse(givenInt as int)

        then:
        result == expectedResult

        where:
        givenInt          || expectedResult
        123               || 321
        -321              || -123
        Integer.MAX_VALUE || 0
    }
}
