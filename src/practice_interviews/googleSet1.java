package practice_interviews;

//import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class googleSet1 {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();
		nums.add(5);
		nums.add(15);
		nums.add(1);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(nums.toArray());
		
		//Collections.emptySortedSet();
		
		//System.out.println(nums);

	}

}
