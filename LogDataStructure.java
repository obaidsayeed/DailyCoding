//You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

//record(order_id): adds the order_id to the log
//get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.

public class LogDataStructure
{
	int n;
	int logrecords[];
	int curr_id;
	
	public LogDataStructure(int n)
	{
		this.n = n;
		this.logrecords[] = new int[n];
		this.curr_id = 0;
	}
	
	public void record(int order_id)
	{
		logrecords[curr_id] = order_id;
		curr_id = (curr_id + 1)%n;
	}
	
	public int get_last(int i)
	{
		int pos = (curr_id - i + n)%n;
		return logrecords[pos];
	}
	
}
