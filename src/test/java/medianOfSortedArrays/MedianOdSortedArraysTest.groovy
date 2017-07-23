package medianOfSortedArrays

import spock.lang.Specification
import spock.lang.Unroll

class MedianOdSortedArraysTest extends Specification {
    @Unroll
    def "should find median"() {
        when:
        def median = new MedianOdSortedArrays().findMedianSortedArrays(nums1 as int[], nums2 as int[])

        then:
        median == expectedResult

        where:
        nums1 | nums2 || expectedResult
        [1,3] | [2] || 2.0
        [1,2] | [3,4] || 2.5
    }
}
