package longesstSubstringWithoutRepeatingCharacters

import spock.lang.Specification


class LongestSubstringWithoutRepeatingCharsTest extends Specification {
    def "should work"() {
        expect:
        new LongestSubstringWithoutRepeatingChars().lengthOfLongestSubstring(s) == expected

        where:
        s          | expected
        "abcabcbb" | 3
        "dvdf"     | 3
    }
}
