//Given a list of numbers and a number k,return whether any two numbers from the list add up to k

import java.util.*;
public class SumOfNumbers
{

	public boolean solution(int n,int nums[],int K)
	{
	    if(n == 0)
	    {
	        return false;
	    }
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0;i < n;i++)
		{
			if(arr.contains(K - nums[i]) == true)
			{
				return true;
			}
			arr.add(nums[i]);
		}
		return false;
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
        
        int K = sc.nextInt();
        SumOfNumbers obj = new SumOfNumbers();
        
        System.out.println(obj.solution(n,nums,K));
    }
}
