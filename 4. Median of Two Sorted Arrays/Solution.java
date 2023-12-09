class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int l=nums1.length,l2=nums2.length,ln=l+l2;
        double a[]=new double[l+l2];
        int i,j=0;
        for(i=0;i<l;i++)
        a[j++]=nums1[i];
        for(i=0;i<l2;i++)
        a[j++]=nums2[i];

        for(i=0;i<ln-1;i++)
        {
            for(j=0;j<ln-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    double t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        if((l+l2)%2!=0)
            return a[(l+l2)/2];
        else
        {  
            return (a[(ln-1)/2]+a[(ln-1)/2+1])/2;
        }
    }
}