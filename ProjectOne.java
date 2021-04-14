import java.util.Scanner;

import java.math.*;

public class ProjectOne {

	public static void main(String[] args) {
		
		String [][] store = {
              	 { "olive" ,  "12 SAR" },
       	     { "Bean"   , "3 SAR"  },		
                { "chickens"  , "13 SAR"  },
       	     { "cheese" ,  "8 SAR"    },
       	     { "eggs"   , "5 SAR" },		
                { "juice"  , "6 SAR"  },
                { "tuna" ,  "15 SAR" },
       	     { "Olive oil"   , "7 SAR" },		
                { "Cream"  , "12 SAR " },
       	     { "honey" ,  "23 SAR" },		
       	     { "Pasta" ,  "22 SAR" },
       	     { "oil"   , "23 SAR" },		
                { "salt"  , "24 SAR" },
       	     { "Indomie" ,  "25 SAR" },
       	     { "soya"   , "22 SAR" },		
       	     { "pepper" ,  "20 SAR" },	
                { "latency"  , "12 SAR" },
       	     { "Pepsi" ,  "2.5 SAR" },
       	     { "Miranda"   , "2.5 SAR" },		
       	     { "Carrots" ,  "8 SAR" },
       	     { "Cucumber"   , "9 SAR" },		
                { "Tomatoes"  , "24 SAR" }	
                
};
       	     

Scanner reader = new Scanner(System.in);

String name;

System.out.print( " Hi " + "What is your name ? ");
name = reader.nextLine();


System.out.println( " Welcome " + name );
System.out.println(" Write down three products you want  : ");

String w = (reader.next());

for (int i = 0; i < store.length; i++) {

	if (w.equals(store[i][0])) {

		System.out.println( " Price -> " + store[i][1] );

		
	break;
	}
}

String w1 = (reader.next());
for (int j = 0; j < store.length; j++) {

	if (w1.equals(store[j][0])) {

		System.out.println( " Price -> " + store[j][1] );

		
	break;
	}
}

String w2 = (reader.next());
for (int j2 = 0; j2 < store.length; j2++) {

	if (w2.equals(store[j2][0])) {

		System.out.print( " Price -> " + store[j2][1] );

		
	break;
	}
}

System.out.println(" Enter the priec : ");
double p1 = reader.nextDouble();
double p2 = reader.nextDouble();
double p3 = reader.nextDouble();

// Priec + Tax 

double total = p1 + p2 + p3 * 0.15;

System.out.print(" total priec is " + total + " SAR thanks for shopping " + name );


	reader.close();
	}

}
