package interviewquestions;

public class TwoDArray {
	
	static int r=3,c=5;
	
	private static int first(int array[], int low, int high) {
		if(high>=low)
		{
			int mid = low+(high-low)/2;
			if((mid==0 ||(array[mid-1]==0))&&(array[mid]==1) )
             return mid;
			
			else if(array[mid]==0)
				first(array,mid+1,high);
			
			first(array,low,mid-1);

		}
		return -1;
	}
	
	private static int findRowWithMax1s(int[][] array) {
		
		int row_index =0, max =-1;
		int i=0,index;
		
		for(i=0;i<r;i++)
		{
			index = first(array[i],0,c-1);
			if(index!=-1 && c-index>max)
				max = c-index;
			row_index = i;
		}
		
		
		return row_index;
	}
	
	public static void main(String[] args) {
		int array[][] = {{0,0,0,1,1},{0,0,1,1,1},{0,1,1,1,1}};
		System.out.println("row with max 1's is:"+findRowWithMax1s(array));
	}


}
