package strategy_sorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSorter implements ISorter {

	@Override
	public List<Student> sort(List<Student> lst) {
		// TODO Auto-generated method stub
		Collections.sort(lst, (d1,d2) -> {
			return d1.stdName.length()-d2.stdName.length();
		});
		return lst;
	}
	
}
