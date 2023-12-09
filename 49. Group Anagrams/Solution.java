class Solution {
    public static int count(String s, char a)
    {
        int i=-1,l=s.length();
        for(int j=0;j<l;j++)
        {
            if(s.charAt(j)==a)
                i++;
        }
        return i;
    }
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> a = new ArrayList<List<String>>();
        int n=str.length,i,j,k;
        for(i=0;i<n;i++)
        { 
            List<String> b = new ArrayList<String>();          
            String w=str[i];
            b.add(w);
            for(j=i+1;j<n;j++)
            {
                int l=w.length(),ll=str[j].length();
                if(ll!=l)
                    continue;
               for(k=0;k<l;k++)
                {
                    char ch=w.charAt(k);
                    if(count(str[j],ch)!=count(w,ch))
                        break;
                }
                if(k==l)
                {    
                    b.add(str[j]);
                    for(k=j;k<n-1;k++)
                        str[k]=str[k+1];
                    n--;
                    j--;
                }
            }
            a.add(b);
        }
        
        return a;

    }
}