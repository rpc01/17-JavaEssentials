import java.math.BigDecimal;


public class Main {

static boolean bDef;	
public static void main(String[] args) {

// Primitive Variables Declaration

System.out.println("Primitive variables Declaration");
	    byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;

        float f = 1f;
        double d = 1d;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
       
System.out.println("");
System.out.println("Working with BigDecimal");
        
  
        double value = .012;
        double pSum = value + value + value;

        System.out.println("Sum of primitives: " +pSum);

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of BigDecimals: " + bSum.toString());

System.out.println("");
System.out.println("MaxValue");
        byte b1 = 127;
        System.out.println("Byte: " + b1);

        if (b1 < Byte.MAX_VALUE) {
            b1++;
        }

        System.out.println("Byte: " + b1);
        
        
System.out.println("");
System.out.println("Converting Numeric Values");

		int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("The long value is " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int: " + intValue4);
        
System.out.println("");
System.out.println("Mathemathical Operators and the Math Class");
        
int intValue11 = 56;
int intValue21 = 42;

int result1 = intValue11 + intValue21;
System.out.println("Addition: " + result1);

int result2 = intValue11 - intValue21;
System.out.println("Subtraction: " + result2);

int result3 = intValue11 * intValue21;
System.out.println("Multiplication: " + result3);

double result4 = (double) intValue11 / intValue21;//has to be double because is fra
System.out.println("Division: " + result4);

double result5 = (double) intValue11 % intValue21;
System.out.println("Remainder: " + result5);

double doubleValue1 = -3.99999;
long rounded = Math.round(doubleValue1);
System.out.println("Rounded: " + rounded);

double absValue = Math.abs(doubleValue1);
System.out.println("Absolute: " + absValue);

System.out.println("");
System.out.println("Booleans");

    boolean b11 = true;
    boolean b2 = false;

    System.out.println("The value of b1 is: " + b11);
    System.out.println("The value of b2 is: " + b2);
    System.out.println("The value of bDef is: " + bDef);//defined above

    boolean b3 = !b11;
    System.out.println("The value of b3 is: " + b3);

    int i1 = 0;
    boolean b4 = (i1 != 0); //isnot
    System.out.println("The value of b4 is: " + b4);

    String sBoolean = "true";
    boolean parsed = Boolean.parseBoolean(sBoolean);
    System.out.println("Parsed: " + parsed);

System.out.println("");
System.out.println("Characters");


    char c1 = '1';
    char c2 = '2';
    char c3 = '3';
    System.out.println("Char 1: " + c1);
    System.out.println("Char 2: " + c2);
    System.out.println("Char 3: " + c3);

    char dollarSign = '\u0024';
    char euroSign = '\u20AC';
    System.out.println("Currencies: " + dollarSign + " "+ euroSign);

    char a1 = 'a';
    char a2 = 'b';
    char a3 = 'c';
    System.out.print(Character.toUpperCase(a1));
    System.out.print(Character.toUpperCase(a2));
    System.out.println(Character.toUpperCase(a3));




        
        
        
        
        
        
        
        
        
        
    }
}