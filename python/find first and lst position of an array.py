class Solution:
    def searchRange(self, nums, target):
        if target not in nums:
            return [-1, -1]
        if (len(nums) == 1) and target in nums:
            return [0,0]
        if (len(nums) == 2) and [target,target]==nums:
            return [0,1]
        if(nums.count(target) == 1):
            return [nums.index(target), nums.index(target)]
        i = nums.index(target)
        for j in range(i+1, len(nums)):
            if nums[j] != target:
                return [i,j-1]
        return [i, i+nums.count(target)-1]
