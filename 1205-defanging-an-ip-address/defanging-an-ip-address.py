class Solution(object):
    def defangIPaddr(self, address):
        """
        :type address: str
        :rtype: str
        """
        address = address.split(".")
        for i in range(len(address)):
            if i==0:
               address[i]=address[i]+"["
            elif i==len(address)-1:
                address[i]="]"+address[i]
            else:
                address[i]="]"+address[i]+"["
        return ".".join(address)