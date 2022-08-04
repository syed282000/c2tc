package c2tc1;
import tnsif.c2tc.entities.GenericClass;

public class client {
	public static void main(String[] args)
	{
		GenericClasses<Integer> generic=new GenericClass();
		generic.setNum(10);
		System.out.println(generic.getNum());
	}

}
