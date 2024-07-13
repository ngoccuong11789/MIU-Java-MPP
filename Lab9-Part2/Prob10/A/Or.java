package Lab9.Part2.Prob10.A;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		Or orInstance = new Or();
		boolean result = orInstance.someSimpleIsTrue(list);
		System.out.println(result);
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
//		boolean accum = false;
//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
//		return accum;
		return list.stream()
				.map(simple -> simple.flag)
				.reduce(false, (accum, flag) -> accum || flag);
	}

}
