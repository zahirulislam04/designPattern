package strategy_sorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberSorter implements ISorter {
	
	public List<Student> sort(List<Student> lst) {
		Collections.sort(lst, (o1,o2) -> {
			return o1.matrNum-o2.matrNum;
		});
		return lst;
	}	
}
