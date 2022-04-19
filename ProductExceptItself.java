public class ProductExceptItself
{
    public int solution(int n,int nums[])
    {
    	int ltproduct[] = new int[n];
    	int rtproduct[] = new int[n];
    	ltproduct[0] = 1;
    	rtproduct[n-1] = 1;
    	int i;
    	int ltsum = 1;
    	int rtsum = 1;
    	
    	for(i = 1;i < n;i++)
    	{
    	    ltproduct[i] = nums[i-1]*ltsum;
    	    ltsum = ltproduct[i];
    	    rtproduct[n - i - 1] = nums[n - i]*rtsum;
    	    rtsum = rtproduct[n - i - 1]; 
    	}
    	
    	for(i = 0;i < n;i++)
    	{
    	    nums[i] = ltproduct[i]*rtproduct[i];
    	}
    	
    	return nums;
    }
    
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int nums[] = new int[n];
    	
    	for(int i = 0;i < n;i++)
    	{
    	    nums[i] = sc.nextInt();
    	}
    	
    	ProductExceptItself obj = new ProductExceptItself();
    	System.out.println(obj.solution(n,nums));
    }
}
