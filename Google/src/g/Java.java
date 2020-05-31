package g;

public class Java {

	public static void main(String[] args) {
		String name="Vaibhav Tanavde";
		
		char[] reverse=name.toCharArray();
		
		for(int i=reverse.length-1;i>=0;i--)
		{
			System.out.println(reverse[i]);
		}
		

	}

}
