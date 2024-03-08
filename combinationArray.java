import java.util.*;

class comb {
    public static void main(String[] args) {
        int s[]={1,2,3};
        comb(s);
    }
    public static void comb(int s[]) {
        int n=s.length;
        List<Integer> l=new ArrayList<>();
        helper(s,0,n,0,l);

    }
    static void helper(int s[],int i,int n, int c, List<Integer> l)
    {
        if(i==n)
            return;
        if(c==n)
        {
            if(!l.isEmpty() && l.contains(num(s)))
                return;
            l.add(num(s));
            printArr(s);
        }
        else
        {
            int j;
            for(j=i;j<n;j++)
            {
                int t=s[i];
                s[i]=s[j];
                s[j]=t;
                helper(s,i,n,c+1,l);
                t=s[i];
                s[i]=s[j];
                s[j]=t;
            }
            helper(s,i+1,n,0,l);
        }
    }
    static int num(int a[])
    {
        int i=0;
        for (int j = 0; j < a.length; j++) {
            i=i*10+a[j];
        }
        return i;
    }
    static void printArr(int a[])
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
