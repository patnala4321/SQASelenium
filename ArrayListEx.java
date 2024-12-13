import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
			
		List l=new ArrayList();
		
		l.add("Heelo");
		l.add("789");
		l.add("%%%%");
		l.add("eeee");
		l.add("teeee");
		l.add("RRRRR");
		
		System.out.println(l);
		
		for(Object o:l)
		{
			System.out.println(o);
		}
		
	}
}