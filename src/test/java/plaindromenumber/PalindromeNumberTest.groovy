package plaindromenumber

import spock.lang.Specification


class PalindromeNumberTest extends Specification {
    def "should check if number is palindrome"() {
        expect:
        new PalindromeNumber().isPalindrome(givenInt) == expectedResult

        where:
        givenInt || expectedResult
        121 || true
        10 || false
        11 || true
        0 || true

    }
}
