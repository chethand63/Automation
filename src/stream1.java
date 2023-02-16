import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Chethan");
//		names.add("cheetah");
//		names.add("Elephant");
//		long co=names.stream().filter(s->s.startsWith("C")||s.startsWith("c")).count();
//		System.out.println(co);
//		for(int i=0;i<names.size();i++) {
//			System.out.println(names.get(i));
		List<Integer>marks = Arrays.asList(12,30,40,45);
		List<Integer>updated=marks.stream().map(s->s+6).collect(Collectors.toList());
		System.out.println(updated);
		}
	}

