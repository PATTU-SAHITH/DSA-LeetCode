class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        y = str(x)
        try:
            y = int(y[::-1])
            if x==y:
                return True
            else:
                return False

        except(ValueError):
            return False