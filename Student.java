
public class Student {
int m1,m2,m3,m4,m5,total;float ave;
Student()
{
	m1=80;m2=85;m3=90;m4=95;m5=90;
}
Student(int a,int b,int c,int d,int e)
{
	m1=a;m2=b;m3=c;m4=d;m5=e;
}
void setvalue()
{
	total=m1+m2+m3+m4+m5;
}
void average()
{
	ave=total/5f;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student=new Student(80,85,90,95,90);
student.setvalue();
student.average();
System.out.println(student.ave);
Student s1=new Student(10,20,30,40,50);
s1.setvalue();
s1.average();
System.out.println(s1.ave);


	}

}
