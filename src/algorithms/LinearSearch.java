package algorithms;

public class LinearSearch {

	/*
	 * public static void main(String[] args) { List<Integer> no =
	 * Arrays.asList(1,2,3,9); List<Integer> list = Arrays.asList(1,2,4,4,9);
	 * Integer sum = 8; System.out.println(hasPairWithSum(no,sum));
	 * System.out.println(hasPairWithSum(list,sum)); }
	 * 
	 * private static boolean hasPairWithSum(List<Integer> list, Integer sum) {
	 * 
	 * Map<Integer,Integer> comp = new HashMap<Integer,Integer>();
	 * //HashSet<Integer> s= new HashSet<Integer>(); for(int value:list) {
	 * 
	 * if(!comp.isEmpty() && comp.get(value)!=comp.get(comp.size()-1)) return true;
	 * comp.put(sum-value, sum-value); } return false; }
	 */
	public static void main(String[] args) {
		int arr[] = {2,9,5,7,23,17,43};
		int x=17;
		System.out.println("the position for given number is:" +findNumber(arr,x));
	}

	private static int findNumber(int[] arr, int x) {
for(int i=0; i<=arr.length; i++)
{
	if(arr[i]==x)
		return i;
}
return -1;
	}

}
