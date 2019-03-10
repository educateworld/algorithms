package StringsAndArrays;

public class SrtingCompression {

	public static void main(String[] args) {
		String str="aaaaaa";
		System.out.println(stringComp(str));
	}

	public static String stringComp(String str) {
		String out="";
		int sum=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				sum++;
			}else
			{
				out=out+str.charAt(i)+sum;
				sum=1;
			}
		}
		out=out+str.charAt(str.length()-1)+sum;
			
		return out;
		
		/*return out.length()<str.length()?str:out;*/
	}

}
