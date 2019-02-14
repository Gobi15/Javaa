
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="i am gobi and from dgl";
//String b=new String("gobi");
String c[]=a.split(" ");
//System.out.print(a.substring(2,5));
for(int i=c.length-2;i>=0;i=i-2)
{
	System.out.print(c[i]);
	System.out.print(" ");
}
	}

}
