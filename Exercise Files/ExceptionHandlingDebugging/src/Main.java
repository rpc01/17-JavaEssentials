import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("Understand Errors vs runtime errors");
		
		//SYNTAX ERROR Example
        //String s = Null; would not run because syntax error
        String s = null;
        System.out.println(s);

        //RUNTIME ERROR EXAMPLE
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
        //char lastChar = chars[chars.length]; //cause index starts at 0
        char lastChar = chars[chars.length-1];
        System.out.println(chars.length);
        System.out.println(lastChar);

        String[] lista = {"hola","4","5","6"};
    	System.out.println(lista.length);
        for (int i=0; i <= lista.length-1;i++) {
        	System.out.println(lista[i]);
        }
 
//---------------------------------------------------------------------
		System.out.println();
		System.out.println("Debugging");
        
		
		String welcome1 = "Welcome!";
        char[] chars1 = welcome1.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            System.out.println(chars1[i]);
        }
        
//---------------------------------------------------------------------
 		System.out.println();
  		System.out.println("Try Catch");
        
        
        String welcome2 = "Welcome!";
        char[] chars2 = welcome2.toCharArray();

        char lastChar2 = chars2[chars2.length-1];
        System.out.println(lastChar2);
              
        
        
        
}
}
