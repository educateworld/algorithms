package StringsAndArrays;

import java.util.Arrays;

public class PermutationOfString {

	public static void main(String[] args) {
		String str1="Test";
		String str2="essT";
		System.out.println(isPermutaionTrue(str1,str2));

	}

	private static boolean isPermutaionTrue(String str1, String str2) {
		//Compare String lengths are equal or not
	int n=str1.length();
	int m=str2.length();
	char ch1[]=str1.toCharArray();
	char ch2[]=str2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(n!=m)
	{
		return false;
	}// method 1: time complexity O(NlogN)
	//1. Sort the strings
	//2.Compare it
	//method 2:if you use HashMap then Time complexity is O(n). you first sort strings and keep in hashmap and check with contains method.
	for(int i=0;i<n;i++)
			if(ch1[i]!=ch2[i])
			return false;
			return true;
	
}}
