
public class oops {
public static void main(String args[])
{
	computer.gobi.print(5);
}
}
class printer
{
	void print(int a)
	{
		System.out.print(a);
	}                                                                               
}
class computer
{
	static printer gobi=new printer();
}