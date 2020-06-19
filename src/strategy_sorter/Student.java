package strategy_sorter;

import java.util.List;
import java.util.Comparator;

public class Student {
	int matrNum;
	String stdName;
	ISorter sortBehavior;
	
	public Student(String name, int mat) {
		this.stdName = name;
		this.matrNum = mat;
	}
	
	public Student() {
		
	}
	
	public void setSortBehavior(ISorter sb) {
		sortBehavior = sb;
	}
	
	public List<Student> doSorting(List<Student> lst) {
		return sortBehavior.sort(lst);
	}
	
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.matrNum-o2.matrNum;
//	}
	
}
