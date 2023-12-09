int maxSubArray(int* nums, int numsSize){
   	int n=numsSize;
	int i=0,j;
   int s= 0,si,c=0,ei,ms=0;  
	for( i=0; i< n; i++)  
	{   c++;
    s+= nums[i];  
    if(s>ms)  
    {   
        ei=i;
        si=i-c+1;
        ms=s; 
    }  
   if(s<0)  
   {    
      c=0;
      s=0;   
    }  
	} 
	if(ms==0)//if all -ve numbers
	{
		ms=nums[0];
		
		for(i=1;i<n;i++)
		{
		if(nums[i]>ms)
			{
				ms=nums[i];
				si=i;
				ei=i;
			}
	    }
	}
	return ms;
}