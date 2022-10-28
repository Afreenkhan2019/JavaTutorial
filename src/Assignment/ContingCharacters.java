package Assignment;

public class ContingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b="aabbbdee";
	    int count=0;
	    
		for (int i=0; i<b.length();i++)
		{			
			for(int j=0; j<b.length();j++) 
			{
				if(b.charAt(i)==b.charAt(j)) 
				{
					count++;
				}
			}			
			System.out.print(count+""+b.charAt(i));
//			String d= String.valueOf(b.charAt(i)).trim();
//			b=b.replaceAll(d,"");
//			count =0;	
			
		}
	}

}
