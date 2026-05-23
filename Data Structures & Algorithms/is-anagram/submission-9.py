class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        l1=list(s)
        l2=list(t)

        l1.sort()
        l2.sort()

        print(l1)
        print(l2)
        print(l1 == l2)

        return l1 == l2

        