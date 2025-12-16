class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sum1 = 0
        sum2 = 0
        nums2 = set(nums)
        for i in nums:
            sum1 += i
        for i in nums2:
            sum2 += i
        return sum2*2-sum1