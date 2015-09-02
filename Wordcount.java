class Wordcount
{
	
	static int wordCount(String s)
	{
		int c=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
		
			if(ch[i]==' '&&i!=s.length()-1)
			{
				if(ch[i+1]!=' '&&ch[i-1]!=' ')
				c++;
				if(ch[i+1]!=' '&&ch[i-1]==' ')
				c++;
			}
			
		}
		if(ch[0]!=' ')
		return c;
		else
		return c-1;
	}
		
		
	
	public static void main(String... s)
	{
		String q="  there are few mistakes   in  my  program   ";
		int c=wordCount(q);
		System.out.println(c+1);
		
	}	
}	