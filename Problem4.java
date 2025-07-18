package in.sowmya;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
public static void main(String[] args) {
	int []input= {1,2,8,9,12,46,76,82,15,20,30};
	Map<Integer,Integer> map=new HashMap();
	for(int i=1;i<=9;i++) {
		for(int j=0;j<input.length;j++) {
			if(input[j]%i==0) {
				if(map.containsKey(i)) {
					map.put(i, map.get(i)+1);
				}
				else {
					map.put(i, 1);
				}
			}
		}
	}
	System.out.println(map);
}
}
