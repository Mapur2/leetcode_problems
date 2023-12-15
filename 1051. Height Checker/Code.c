int heightChecker(int* a, int n){
    int i=0,j=0,c=0,m,h[n];
     for(i=0;i<n;i++)
        h[i]=a[i];
    for(i=0;i<n-1;i++)
    {
        m=i;
        for(j=i+1;j<n;j++)
        {
            if(a[j]<a[m])
                m=j;
        }
        j=a[m];
        a[m]=a[i];
        a[i]=j;
    }
    for(i=0;i<n;i++)
        if(h[i]!=a[i])
            c++;
    return c;
}