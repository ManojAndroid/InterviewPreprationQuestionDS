package com.intervie.code.puzzle;
public class Panagram {
	static boolean chechPanagram(String str)
	{
		 boolean[]list= new boolean[26];
		int index=0;
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
				
				index=str.charAt(i)-'A';
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
				index=str.charAt(i)-'a';
			
				list[index]=true;
		}
		for(int i=0;i<=25;i++)
		{
			if(list[i]==false)
				flag=false;
		}
		return flag;
	}
	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
		System.out.println(Panagram.chechPanagram(str));
	}

}
