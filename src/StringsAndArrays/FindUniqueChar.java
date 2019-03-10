package StringsAndArrays;

import java.util.HashSet;

public class FindUniqueChar {

	public static void main(String[] args) {
		String str="Hello World";
		System.out.println(isUniqueChar(str));
	}
		
		private static boolean isUniqueChar(String str) {
			char[] ch=str.toCharArray();
			HashSet<Character> hset=new HashSet<Character>();
			
			for(char c:ch) {
				if(hset.contains(c))
				{
					return false;
				}
				hset.add(c);
			}
			return true;
	}
}