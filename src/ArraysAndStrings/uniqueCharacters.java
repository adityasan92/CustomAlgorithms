package ArraysAndStrings;
import java.util.*;
 
public class uniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String unique = "abcdefghi";
		String notUni = "abcdefa";
		String abc = null; 
		uniqueCharacters temp = new uniqueCharacters(); 
		System.out.println(temp.uniqueDS(abc)); 
		

	}

	public boolean uniqueDS(String test){
		
		if(test == null)
		{
			return true; 
		}
		
		HashSet<Character> set = new HashSet<Character>(); 
		char[] arr = test.toCharArray(); 
		
		for(int i =0; i<arr.length; i++)
		{
			if(set.contains(arr[i]))
			{
				return false; 
			}else{
				set.add(arr[i]); 
			}
			
		}
		return true; 
		
	}
	
}
