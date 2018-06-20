import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month Number: ");
        int input = scanner.nextInt();	
		
        int monthNumber = input;
        
        
    if (monthNumber >= 1 && monthNumber <= 3) {
        System.out.println("You're in Quarter 1");
    } else if (monthNumber >= 4 && monthNumber <= 6) {
        System.out.println("You're in Quarter 2");
    } else if (monthNumber >= 7 && monthNumber <= 9) {
        System.out.println("You're in Quarter 3");
    } else if (monthNumber >= 10 && monthNumber <= 12) {
        System.out.println("You're in Quarter 4");
    } else {
        System.out.println("That's an unknown month!");
    }

//------------------------------------------------
    System.out.println(" ");
    System.out.println("Switch Statement");    
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    String input1 = sc.nextLine();
    int monthNumber1 = Integer.parseInt(input1);

    switch (monthNumber1) {
        case 1:
            System.out.println("The month is January");
            break;
        case 2:
            System.out.println("The month is February");
            break;
        case 3:
            System.out.println("The month is March");
            break;
        default:
            System.out.println("You chose another month!");
    }
    sc.close();

//------------------------------------------------
    System.out.println(" ");
    System.out.println("Looping Blocks");  
    
    
    
    String[] months = {"January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"};

   //-
    for (int i = 0; i < months.length; i++) {
        System.out.println(months[i]);
    }
//-
    for (int i = months.length-1; i >= 0; i--) {
        System.out.println(months[i]);
    }
//- best
    for (String mine : months) {
        System.out.println(mine);
    }
   
   
//-
    int counter = 0;
    while (counter < months.length) {
        System.out.println(months[counter]);
        counter++;
    }
//-
    int counter1 = 0;
    do {
        System.out.println(months[counter1]);
        counter1++;
    } while (counter1 < months.length);

    
  //--
    
    
    
    
}
}