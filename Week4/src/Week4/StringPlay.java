// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
package Week4;

public class StringPlay
{
   public static void main (String[] args)
   {
      String college = new String ("Leeds Beckett University"); // Similar for part (a)
      
      String town = new String("Anytown, UK");  // part (a)

      int stringLength;
      String change1, change2, change3; 

      stringLength = college.length();  // part (b)

      System.out.println (college + " contains " + stringLength + " characters.");

      // (c) Convert college to upper case
      change1 = college.toUpperCase();  

      // (d) Replace all lower case 'e' with '*'
      change2 = change1.replace('E', '*');  

      // (e) Concatenate college and town using concat method
      change3 = college.concat(town);  

      System.out.println ("The final string is " + change3);
    }
}
