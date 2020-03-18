package com.amanjit.taskjunittest;
	

public class DeleteAInFirst2Pos {

	public String remove(String string)
	{
		String result="";
		int i,len;
		char arr[]=string.toCharArray();
		len=arr.length;
		for(i=0;i<len;i++)
		{
			if(arr[i]!='A' || i>1)
				result=result+arr[i];
		}
		return result;
		
			
	}

}
