package journals;
import java.util.Arrays.*;
import java.util.ArrayList;
public class SortArray {
	
	public SortArray(ArrayList<Integer> list){
		
	}
	
	public static void sort(ArrayList<Integer> list){
		
		for (int j=0; j<list.size()-2; j++ ){
			for (int i=j+1; i<list.size()-1; i++){
				if (list.get(j)>list.get(i)){
					int holder=list.get(j);
					list.set(j, list.get(i));
					list.set(i, holder);
				}
			
		}
		}
		System.out.println(list);
	}
	public static void main(String[] args){
		ArrayList<Integer> go = new ArrayList<Integer>();
		go.add(1);
		go.add(4);
		go.add(6);
		go.add(44);
		go.add(3);
		go.add(5);
		go.add(7);
		go.add(67);
		go.add(44);
		go.add(3);
		go.add(5);
		go.add(7);
		go.add(67);
		SortArray.sort(go);
		
	}


}
