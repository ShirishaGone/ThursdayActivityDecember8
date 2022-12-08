package ActivityQuestion1;
import java.util.Iterator;
import java.util.TreeSet;
public class Colors {

	public static void main(String[] args) {
		TreeSet<String> c=new TreeSet<String>();
		
		c.add("Green");
		c.add("White");
		c.add("red");
		c.add("Blue");
		c.add("Black");

		Iterator<String> itr=c.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		TreeSet<String> c1=new TreeSet<String>();
		c1.add("pink");
		c1.add("Purple");
		c.addAll(c1);
		System.out.println(c);

		Iterator<String> itr1=c.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		boolean b = c.equals(c1);
		System.out.println("Both sets are equal: " + b);
		

		System.out.println("First element in the Set: "+c.pollFirst());
		System.out.println("Last element in the Set: "+c.pollLast());
		
		
	}
}

