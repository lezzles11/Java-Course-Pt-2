package dictionary;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
        MindfulDictionary dict = new MindfulDictionary();
dict.add("apina", "monkey");
dict.add("banaani", "banana");
dict.add("apina", "apfe");

System.out.println( dict.translate("apina") );
System.out.println( dict.translate("monkey") );
System.out.println( dict.translate("programming") );
System.out.println( dict.translate("banana") );
    }
}
