class Solution:
    def reverseDegree(self, s: str) -> int:

        total = 0
        count = 1
        for ch in s:
            total += (26 - (ord(ch) - ord('a')))*count
            count = count+1
        return total
        