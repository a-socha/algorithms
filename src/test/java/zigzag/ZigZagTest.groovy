package zigzag

import spock.lang.Specification

class ZigZagTest extends Specification {
    def "should convert string properly"() {
        when:
        String converted = new ZigZag().convert(toConvert, rows)

        then:
        converted == expectedResult

        where:
        toConvert        | rows || expectedResult
        'PAYPALISHIRING' | 3     | 'PAHNAPLSIIGYIR'
        'ABC'            | 2     | 'ACB'
    }
}
