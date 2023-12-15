class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        int i,j, n=matrix[0].length,m=matrix.length;
        int a[][]=new int[n][m];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[j][i]=matrix[i][j];
            }
        }
        return a;
    }
}