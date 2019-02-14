import java.util.Scanner;


public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
Scanner S=new Scanner(System.in);
a=S.nextInt();
for(;;)
{
	b=b*4;
	if(b==a)
	{
		System.out.print("true");
		break;
	}
	else if(b>a)
	{
		System.out.print("false");
				break;
	}
	
	
}

	}
}
