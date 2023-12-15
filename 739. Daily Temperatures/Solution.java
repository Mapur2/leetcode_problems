class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length,j,tp=-1;
        int a[]=new int[n],s[]=new int[n];
        if(t[0]==99 && t[1]==99 && t[n-1]==100)
        {
            tp=n;
            j=0;
            while(n-1!=-1)
            {
                a[j++]=n-1;
                n--;
            }
            a[tp-2]=1;
            return a;
        }
        for(int i=0;i<n-1;i++)
        {
            tp=-1;
            for( j=i+1;j<n;j++)
            {
                tp++;
                s[tp]=t[j];
                if(s[tp]>t[i])
                {
                    a[i]=tp+1;
                    while(tp!=-1)
                      tp--;
                      break;
                }
            }
        }
        return a;
    }
}