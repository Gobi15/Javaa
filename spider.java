
public class spider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1,row=3,col=3,b=(row*col)-((col-row)+1);
for(int i=0;i<row;i++)
{
	if(i==0)
	{
	for(int j=0;j<col;j++)
	{
		System.out.print(a);
		a++;
	}
	}
	else if(i==1)
		{
			for(int k=0;k<col-1;k++)
			{
			System.out.print(b);
             b++;
			}
			System.out.print(a);
			
		}
	else if(i==2)
			
		{
			a=a+col;
			for(int k=0;k<col;k++)
			{
				System.out.print(a);
				a--;
			}
		}
		System.out.println();
	}
	
}
	}


