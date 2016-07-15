
public class NullObjectExc {
	public int sum(int n1,int n2)
	{
		return n1+n2;
		
	}
public static void main(String args[])
{
	NullObjectExc nobj1=new NullObjectExc();
	NullObjectExc nobj=new NullObjectExc();
	nobj=null;
	try{
		System.out.println(nobj1.sum(2, 4));
		nobj.sum(2,3);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Something went wrong");
	}
}
}
