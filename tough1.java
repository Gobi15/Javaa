//import java.util.Arrays;


 public class tough1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="i am gobi";
	String str1=str.replace(" ","");
	
	for(int k=0,j=str1.length()-1;k<str.length();k++)
	{
		if(str.charAt(k)==' ')
		System.out.print(" ");
		else{
		System.out.print(str1.charAt(j));
		j--;}
	}
	}
	}
