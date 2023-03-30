package personalAssignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortDept implements Comparator<SortingAnObject>{

	@Override
	public int compare(SortingAnObject o1, SortingAnObject o2) {
	    return (-1)*o1.stuDept.compareToIgnoreCase(o2.stuDept);
		
	}
	
}
public class SortingAnObject implements Comparable<SortingAnObject>{
    
	int stuId;
	String stuName;
	String stuDept;
	char grade;
	
	public SortingAnObject(int id, String name, String dept, char grade)
	{
		stuId = id;
		stuName = name;
		stuDept = dept;
		this.grade = grade;
	}
	
	
	public int compareTo(SortingAnObject o) {
				return this.stuId - o.stuId;
	}

	
 public static void main(String args[])
 {
	 ArrayList<SortingAnObject> list = new ArrayList<SortingAnObject>();
	 list.add(new SortingAnObject(123,"Revathi","ComputerSciencce",'A'));
	 list.add(new SortingAnObject(101,"Suresh","Math",'B'));
	 list.add(new SortingAnObject(155,"Arjun","Physics",'A'));
	 list.add(new SortingAnObject(169,"Siddharth","Elementary",'C'));
	 Collections.sort(list);
	 for(SortingAnObject s : list)
		 System.out.println("id " + s.stuId + " name " + s.stuName + " dept " + s.stuDept + " grade " + s.grade);
	 SortDept sd = new SortDept();
	 Collections.sort(list,sd);
	 for(SortingAnObject s : list)
		 System.out.println("id " + s.stuId + " name " + s.stuName + " dept " + s.stuDept + " grade " + s.grade);
 }



}
