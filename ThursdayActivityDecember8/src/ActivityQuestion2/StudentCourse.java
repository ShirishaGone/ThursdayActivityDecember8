package ActivityQuestion2;
import java.util.Map;
import java.util.TreeMap;

public class StudentCourse {

	public static void main(String[] args) {
		TreeMap<Integer,String> course=new TreeMap<>();       
		  course.put(1, "Mechanical");
		  course.put(2, "Electrical");
		  course.put(3, "Electronics");
		  course.put(4, "Computer Science");
		  {
			  System.out.println("course:"+course);
		  }
		  TreeMap<Integer,String> course1=new TreeMap<>();       
		  course1.put(5, "Civil");
		  course1.put(6, "Mining");
		  course.putAll(course1);

		   for (Map.Entry entry : course.entrySet())
		   {
		    System.out.println(entry.getKey() +" "+ entry.getValue());
		   }

			System.out.println(course.containsKey(1));
			System.out.println(course.containsValue("Mechanical"));			
			
			System.out.println(course.descendingKeySet());
			
			System.out.println("least entry in map"+course.firstEntry());
			System.out.println("greates entry in map"+course.lastEntry());			
			System.out.println(course.pollFirstEntry());			
			System.out.println(course.pollLastEntry());
			System.out.println("After Removing Greatest and Least element");
			System.out.println(course);

	}

}
