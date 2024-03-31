class Solution:
    def searchMatrix(self, matrix, target) :
        for i in range(len(matrix)):
            if target >= matrix[i][0] and target <= matrix[i][-1]:
                return target in matrix[i]