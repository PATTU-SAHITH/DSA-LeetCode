class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.lstrip()
        s = list(s)

        if s=="":
            return 0

        sign = 1
        try:
            if str(s[0])=="-":
                sign = -1
                s=s[1:]
            elif str(s[0])=="+":
                sign = 1
                s=s[1:]
        except(IndexError):
            return 0
        

        y=""
        for i in s:
            try:
                x = int(i)
                y+=i
            except(ValueError):
                break       
        
        try:
            y = int(y)*sign
            int_max = 2**31 - 1
            int_min = -2**31
            if y > int_max:
                return int_max
            elif y < int_min:
                return int_min
            return y
        except(ValueError):
            return 0