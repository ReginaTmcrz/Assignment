import java.util.TooManyListenersException;

import javax.xml.transform.Source;

    import javax.xml.transform.Source;

    /**
     * Recursion Example
     * This java program removes all consonants in a String (Fullname)
     * and keep all vowels
     */
    public class testRecursion {
        public static void main(String args[]) {
          String fullname = "regina tomacruz";
          // oe ae
    
          System.out.println(fullname);
        // This Method will remove all consonants in a String (Fullname)
          removeCons(fullname, "");
        }
        
        static void removeCons(String fullname, String vowels){
        
            // Checks if fullname is empty
            if (fullname.length() == 0){
                System.out.println(vowels);               
               return;
            }
            
            // Set var letter with the first char in string fullname
            char letter = fullname.charAt(0);          

            // checks if the char letter is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == ' '){
               
                // set string vowel with coverted character letter
    
                vowels = vowels.concat(Character.toString(letter));
    
                //set newName var with fullname without letter
    
                String newName = fullname.replaceFirst(Character.toString(letter), "");
                System.out.println(vowels.concat(newName));
            }
            
            // removeCons method with fullname remaining characters with var vowels
     
            removeCons(fullname.substring(1), vowels);
        }
    }
    