//Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

//For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

import java.util.*;

public class ClassRooms
{
	public static int solution(int n,int[][] intervals)
	{
		int tmp = 0,room = 0;
		int arr[] = new int[10000];
		for(int i = 0;i < n;i++)
		{
			arr[intervals[i][0]] = 1;
			arr[intervals[i][1]] = -1;
		}
		
		for(int i = 0;i < 10000;i++)
		{
			tmp += arr[i];
			if(tmp > room)
			{
				room = tmp;
				//System.out.println(room);
			}
		}
		return room;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int intervals[][] = new int[n][2];
		
		for(int i = 0;i < n;i++)
		{
			intervals[i][0] = sc.nextInt();
			intervals[i][1] = sc.nextInt();
		}
		
		System.out.println(solution(n,intervals));
	}
}
