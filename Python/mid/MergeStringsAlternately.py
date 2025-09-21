class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        result = ""
        short = min(len(word1), len(word2))
        for i in range(short):
            result += word1[i]
            result += word2[i]
        if len(word1) < len(word2):
            result += word2[short:]
        elif len(word1) > len(word2):
            result += word1[short:]
        return result
            
word1="abc"
word2="pqr"
print(Solution().mergeAlternately(word1, word2))   
