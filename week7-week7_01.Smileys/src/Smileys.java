
public class Smileys {

    private static void printWithSmileys(String characterString) {
        int length = characterString.length(); 
        int totalSmileys = (length + 1) / 2 + 3; 
        printSmiley(totalSmileys); 
            if (length % 2 == 0) {
                System.out.print(":) " + characterString);
                System.out.println(" :)");
            } else {
                System.out.print(":) " + characterString);
                System.out.println("  :)");
            }
        printSmiley(totalSmileys); 
        
    }
    
    private static void printSmiley(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

}
