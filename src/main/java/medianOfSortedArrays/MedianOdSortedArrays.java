package medianOfSortedArrays;

import java.util.ArrayList;
import java.util.List;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * <p>
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianOdSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<Integer> medianCache = new ArrayList<>();

        boolean twoNumsToComputeMedian = (len1 + len2) % 2 == 0;
        int medianIdx = (len1 + len2) / 2;

        int it1 = 0, it2 = 0;
        while (it1 < len1 && it2 < len2 && it1 + it2 <= medianIdx) {
            if (nums1[it1] <= nums2[it2]) {
                medianCache.add(nums1[it1]);
                it1++;
            } else {
                medianCache.add(nums2[it2]);
                it2++;
            }
        }
        for (; it1 < len1 && it1 + it2 <= medianIdx; it1++) {
            medianCache.add(nums1[it1]);
        }
        for (; it2 < len2 && it1 + it2 <= medianIdx; it2++) {
            medianCache.add(nums2[it2]);
        }

        return twoNumsToComputeMedian ? (medianCache.get(medianIdx - 1) + medianCache.get(medianIdx))/2.0 : medianCache.get(medianIdx);
    }
}
