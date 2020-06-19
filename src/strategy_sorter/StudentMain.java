package strategy_sorter;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hisStudent = new Student();
		Student itStudent = new Student();
		
		List<Student> lstHISStudent = new ArrayList<Student>();
		lstHISStudent.add(new Student("Md Zahirul Islam", 1293227));
		lstHISStudent.add(new Student("Kamrul Islam", 1293228));
		lstHISStudent.add(new Student("Dhiman Das", 1293229));
		lstHISStudent.add(new Student("Md Jahidul Islam", 1293226));
		lstHISStudent.add(new Student("Niajul Islam", 1293225));
		lstHISStudent.add(new Student("Md Johirul Islam", 1293224));
		lstHISStudent.add(new Student("Imrul Hasan", 1293223));
				
		hisStudent.setSortBehavior(new NumberSorter());
		itStudent.setSortBehavior(new NameSorter());
		
		List<Student> lstSortByMat;
		List<Student> lstSortByName;
		
		
		lstSortByMat = hisStudent.doSorting(lstHISStudent);
		lstSortByName = itStudent.doSorting(lstHISStudent);
		
		System.out.println("Student of HIS:");
		for(Student std:lstSortByMat) {
			System.out.println(std.matrNum + ":" +  std.stdName);
		}
		
		System.out.println("Student of IT:");
		for(Student std1:lstSortByName) {
			System.out.println(std1.matrNum + ":" +  std1.stdName);
		}
		
		
	}

}
