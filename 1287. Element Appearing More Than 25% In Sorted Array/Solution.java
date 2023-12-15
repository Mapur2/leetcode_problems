class Solution {
    public int findSpecialInteger(int[] a) {
        int n=a.length,j,i,k=a[0];
        double p,c=0.0,pp=25.0;
        for(i=0;i<n;i++)
        {
            j=i;
            while(j<n && a[i]==a[j])
            {    
                c++;
                j++;
            }
            p=(c/n)*100;
            //System.out.println(a[i]+" "+p);
            if(p>=pp)
            {
                 k=a[i];
                 pp=p;
                 System.out.println(a[i]+" "+p);
            }   
            c=0.0;
        }
        return k;
    }
}