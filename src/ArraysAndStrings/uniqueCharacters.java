package ArraysAndStrings;
import java.util.*;
 
public class uniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String unique = "abcdefghi";
		String notUni = "abcdefa";
		String abc = null; 
		uniqueCharacters temp = new uniqueCharacters(); 
		System.out.println(temp.isUnique(notUni)); 
		

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
	
	public boolean isUnique(String str){
		
		if(str == null)
		{
			return true; 
		}
		int checker; 
		
		for(int i =1; i<str.length();i++){
			checker = i-1; 
			while(checker >= 0){
				if(str.charAt(i) == str.charAt(checker)){
					return false; 
				}
				checker--; 
			}
		}
		return true; 
		
	}
	
}
