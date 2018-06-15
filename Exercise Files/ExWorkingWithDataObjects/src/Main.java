import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import java.math.BigDecimal;



public class Main {
	public static void main(String[] args) {
//------------------------------------------------------------------
		
		System.out.println("");
		System.out.println("Using the String Class");
		String s1 = "This is a String!";
        System.out.println(s1);
//declare with String 
        String s2 = new String("This is also a String!");
        System.out.println(s2);

        String s3 = "Shirt size: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Qty: " + 4;
        System.out.println(s5);
//from char to string
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s6 = new String(chars);
        System.out.println(s6);
//from string to chars
        char[]  chars2 = s6.toCharArray();
        for (char c : chars2) {
            System.out.println(c);
	}
//------------------------------------------------------------------

        System.out.println("");
		System.out.println("From Primitive Vars to String");
      
        
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        // needs import java.text.NumberFormat;
        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);
 //------------------------------------------------------------------
        System.out.println("");
		System.out.println("Building a String from multiple values");
        
        
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);
// better option because does not require to create new objects
        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb);
/*        
// needs import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length()); // deletes from 0 to length
        for (int i = 0; i < 2; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n"); //"\n" is new line
        }
        System.out.println(sb);
        
        */
//------------------------------------------------------------------
        System.out.println("");
		System.out.println("Comparing String values");        
        
        String str11 = "Hello";
        String str21 = "Hello";

        if (str11 == str21) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String str31 = "hello";
        if (str11 == str31) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
// to securely compare strings use methods .equals // .equalsIgnoreCase
        String part1 = "Hello ";
        String part2 = "WORLD";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
//------------------------------------------------------------------
        System.out.println("");
		System.out.println("Formating Numeric Values/Currencies as String"); 
		// needs import java.util.Locale;

		Locale locale = new Locale("da", "DK");
		Locale localeUS = new Locale("en", "US");
		Locale localeCAT = new Locale("ca", "ES");

        double doubleValue = 1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance(localeCAT);
        System.out.println("Number: " + numF.format(doubleValue));
        
        NumberFormat curF = NumberFormat.getCurrencyInstance(localeCAT);
        System.out.println("Currency: " + curF.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance(localeCAT);
        System.out.println("Integer: " + intF.format(doubleValue));
		
//------------------------------------------------------------------
        System.out.println("");
		System.out.println("Parsing Strings");        
        
        String s11 = "Welcome to California!";
        System.out.println("Length of string: " + s11.length());

        int position = s11.indexOf("California");
        System.out.println("Position of substring: " + position);

        String sub = s11.substring(11);
        System.out.println(sub);

        String s21 = "Welcome!         ";
        int len1 = s21.length();
        System.out.println(len1);
        String s31 = s21.trim(); // remove spaces
        System.out.println(s31.length());
        
//------------------------------------------------------------------
        System.out.println("");
		System.out.println("Date Time");          
        
/*needs
		import java.text.DateFormat;
        import java.time.LocalDate;
        import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;
        
*/

		//needs import java.util.Date;
        Date d = new Date(); // constructor to create instance current momenth
        System.out.println("d: "+d);

        // needs import java.util.GregorianCalendar;
        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28); //to input date beware jan is 0!!
        System.out.println("gc: "+gc);
        gc.add(GregorianCalendar.DATE,1);
        Date d2 = gc.getTime();
        System.out.println("d2: "+d2);

        //needs import java.text.DateFormat;
        //to obtain a formatted date / time
//        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
//        DateFormat df = DateFormat.getDateInstance(); //empty
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeCAT); //with Locale
        
        System.out.println(df.format(d2));

        // Since JAVA 1.8 EASIER:
        
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);


        LocalDate ld = LocalDate.of(2009, 1, 28); // since java 1.8 1 is january
        System.out.println(ld);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("D/M/Y");
        System.out.println(dtf.format(ld));

      //------------------------------------------------------------------
        System.out.println("");
		System.out.println("Challenge: enter two numbers and add them");
		
		       
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.print("Enter a numeric value: ");
        String input2 = sc.nextLine();
        double d21 = Double.parseDouble(input2);

        double result = d1 + d21;
        double result_r = Math.round(result);
        
        

        System.out.println("The answer is " + result_r);
        
        
                
        
        
        
          
}
}