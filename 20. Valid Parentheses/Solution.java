class Solution {
    public boolean isValid(String s) {
        int i,j,t=-1;
        int n=s.length();
        if(n==1)
        return false;
        char w[]=new char[n];
        for(i=0;i<n;i++)
        {
            j=0;
            char ch=s.charAt(i);
            if(ch=='{'||ch=='(' || ch=='[')
            {
                t++;
                w[t]=ch;
                j=1;
            }
            else if(t>-1)
            {  
                if((ch=='}' && w[t]=='{')||
            (ch==')'&&w[t]=='(') || (ch==']' && w[t]=='['))
                {
                    t--;
                    j=1;
                }
            }
            if(j==0)
                return false;
        }
        if(t!=-1)
            return false;
        return true;
    }
}