
public class NewIndiaCorporation 
{
	int hours,basepay,basicsalary,OThourse;
	double OTsalary,totalsalary;
	NewIndiaCorporation(int base,int hour)
	{
		basepay=base;
		hours=hour;
	}
void Basepay()
{
	if(basepay>=50&&hours<=60)
	{
		if(hours>=40)
		{
			OThourse=hours-40;
			hours=40;
		basicsalary=basepay*hours;
		}
		else
			System.out.print("Error");
	}
	else
		System.out.print("Error");
}
void overtime()
{
	
	OTsalary=OThourse*(basepay*1.5);
}
void totalsalary()
{
	totalsalary=basicsalary+OTsalary;
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
NewIndiaCorporation e1=new NewIndiaCorporation(50,50);
e1.Basepay();
e1.overtime();
e1.totalsalary();
System.out.print(e1.totalsalary);
 	}

}
