package longestPalindromicSubstring

import spock.lang.Specification
import spock.lang.Unroll

class LongestPalinbdromicSubstringTest extends Specification {
    @Unroll
    def "should found longest palindrom"() {
        when:
        def longestPalindrom = new LongestPalinbdromicSubstring().longestPalindrome(sample)

        then:
        longestPalindrom == expected || longestPalindrom.size() == expected.size()

        where:
        sample                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       || expected
        "babad"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      || "bab"
        "cbbd"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       || "bb"
        "babaddtattarrattatddetartrateedredividerb"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  || "ddtattarrattatdd"
        "iopsajhffgvrnyitusobwcxgwlwniqchfnssqttdrnqqcsrigjsxkzcmuoiyxzerakhmexuyeuhjfobrmkoqdljrlojjjysfdslyvckxhuleagmxnzvikfitmkfhevfesnwltekstsueefbrddxrmxokpaxsenwlgytdaexgfwtneurhxvjvpsliepgvspdchmhggybwupiqaqlhjjrildjuewkdxbcpsbjtsevkppvgilrlspejqvzpfeorjmrbdppovvpzxcytscycgwsbnmspihzldjdgilnrlmhaswqaqbecmaocesnpqaotamwofyyfsbmxidowusogmylhlhxftnrmhtnnljjhhcfvywsqimqxqobfsageysonuoagmmviozeouutsiecitrmkypwknorjjiaasxfhsftypspwhvqovmwkjuehujofiabznpipidhfxpoustquzyfurkcgmioxacleqdxgrxbldcuxzgbcazgfismcgmgtjuwchymkzoiqhzaqrtiykdkydgvuaqkllbsactntexcybbjaxlfhyvbxieelstduqzfkoceqzgncvexklahxjnvtyqcjtbfanzgpdmucjlqpiolklmjxnscjcyiybdkgitxnuvtmoypcdldrvalxcxalpwumfx" || "ykdky"
    }
}
