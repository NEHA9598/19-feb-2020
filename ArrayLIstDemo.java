
import java.util.ArrayList;
import java.util.List;

public class ArrayLIstDemo {

	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("to");
		list.add("java");
		list.add("batch");
		list.add("7");
		list.add("true");
		
		System.out.println(list);
		list.remove(2);
		list.add(2,"advanced java");
		System.out.println("List Size:"+list.size());
		System.out.println("List Contains python? :"+list.contains("python"));
		
		for(String obj : list)
		{
			System.out.println(obj);
			if(obj.equals("java")){
				break;
			} 			
		}}}
		
		
	
	

