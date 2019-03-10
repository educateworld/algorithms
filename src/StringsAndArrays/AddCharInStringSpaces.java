package StringsAndArrays;

public class AddCharInStringSpaces {

	public static void main(String[] args) {
		String str="Hello World uma   ";
	/*	int n=str.length();*/
		/*findNameSpaces(str,n);*/
		str=str.trim();
		str=str.replaceAll("\\s"," %20");
		
		
		System.out.println(str);

	}

	/*private static void findNameSpaces(String str, int n) {
		char[] ch=str.toCharArray();
		int spaceCount=0;
		for(int i=0;i<n;i++) {
		if(ch[i]==' ')
		spaceCount++;
		
		}
		int newLength=n+spaceCount*2;
		ch[newLength] = '\0';
		for(int i=n-1;i>=0;i--) {
			if(ch[i]==' ') {
			ch[newLength-1]='0';
			ch[newLength-1]='2';
			ch[newLength-1]='%';
			newLength=newLength-3;
		}ch[newLength-1]=ch[i];
			}
		
		
		
	}*/

}
