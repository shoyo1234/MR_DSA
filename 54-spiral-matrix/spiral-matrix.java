class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //store our final spiral order
        List<Integer> result = new ArrayList<>();
        
        //define the boundaries of the matrix
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        // keep looping until all layers are processed
        while (top <= bottom && left <= right) {
            
            // move left → right across the top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;  // top row is done, move boundary down
            
            // move top → bottom along the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;  // right column is done, move boundary left
            
            // move right → left across the bottom row
            // check is needed to avoid duplicate rows
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;  // bottom row is done, move boundary up
            }
            
            // move bottom → top along the left column
            // again, check to avoid duplicates
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;  // left column is done, move boundary right
            }
        }
        
        return result;  // final spiral order
    }
}