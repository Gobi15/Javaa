import java.util.Scanner;


public class stringpin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S=new Scanner(System.in);
System.out.print("Enter string");
String a=S.nextLine();
stringpin s=new stringpin(a.toCharArray());
//char k[]=a.toCharArray();
	}
stringpin(char k[])
{
	for(int i=0;i<k.length;i++)
	{
		if(k[i]>='0'&&k[i]<='9')
		{
			System.out.print(k[i]);
		}
	}
}
	

}
