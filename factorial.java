
public class factorial {
int fact=1;
	public static void main(String[] args) {
		factorial c=new factorial();
		c.fact(5);
		System.out.print(c.fact);
	}
void fact(int a)
{
	if(a>0)
	{
		fact=fact*a;
		a--;
		fact(a);
	}
}
}
