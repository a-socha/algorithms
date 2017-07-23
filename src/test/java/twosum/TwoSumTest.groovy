package twosum

import spock.lang.Specification
import spock.lang.Unroll

class TwoSumTest extends Specification {
    @Unroll
    def "should twoSum work properly"() {
        when:
        int[] res = new Solution().twoSum(nums as int[], target)

        then:
        res == (expectedRes as int[])

        where:
        nums           | target || expectedRes
        [2, 7, 11, 15] | 9      || [0, 1]
        [3, 2, 4]      | 6       | [1, 2]


    }
}
