public class Main {
    public static void main(String[] args) {
        // Test your program here
        Changer test = new Changer(); 
        test.addChange(new Change('w', 'a'));
        test.addChange(new Change('b', 'c'));
        System.out.println(test.change("wabuiy"));
    }
}
