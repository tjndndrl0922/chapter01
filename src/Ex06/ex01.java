package Ex06;

public class ex01 {
	
	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			
			System.out.println(args[i]);
		}
		
		if("-version".equals(args[0])) {
			System.out.println("ver 1.1, Seo Woong ki");
		}
		
	}

}
