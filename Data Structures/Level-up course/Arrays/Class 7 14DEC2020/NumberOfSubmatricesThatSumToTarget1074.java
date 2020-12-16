// https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/submissions/

class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int k) {
        int n = matrix.length, m = matrix[0].length;
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
        
        int count = 0;
        for(int base = 0; base < n; base++){
            for(int row = base; row < n; row++){
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0,1);
                int sum = 0;
                
                for(int j=0; j<m; j++){
                    sum += matrix[row][j] - (base != 0 ? matrix[base-1][j] : 0);
                    count += map.getOrDefault(sum - k, 0);
                    map.put(sum, map.getOrDefault(sum, 0)+1);
                }
            }
        }
        
        return count;
    }
}