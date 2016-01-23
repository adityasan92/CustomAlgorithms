package ArraysAndStrings;

public class ResizeArray {
	
	private String[] s;
	private int N = 0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizeArray array = new ResizeArray();
		array.push("Hello World");
		array.push("New World");
		array.push("I suck");
		System.out.println(array.pop());
		array.printAll();
	}

	public ResizeArray(){
		s = new String[1];			
	}
	
	public void push(String item)
	{	
		if(N == s.length) resize(2*s.length);
		s[N++] = item; 
	}
	
	public String pop()
	{	
		String item = s[--N];
		s[N] =  null;  
		if(N>0 && N == s.length/4) resize(s.length/2);
		return item; 
		
	}
	
	public void printAll(){
		int i = 0; 
		while(i < N){
			System.out.println(s[i]);
			i++;
		}
	}
	
	private void resize(int capacity)
	{
		String[] copy = new String[capacity];
		for(int i=0; i<N; i++){
			copy[i] = s[i];
		}
		s = copy;
	}
}
