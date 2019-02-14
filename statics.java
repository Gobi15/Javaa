
public class statics {
int b=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
statics a=new statics();
a.print();
System.out.print(a.b);
statics c=new statics();
System.out.println(c.b);
	}
void print()
{
	b=b+2;

}
}
