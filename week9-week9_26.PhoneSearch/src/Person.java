import java.util.*; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
public class Person implements Comparable <Person> {
    private String name; 
    private String address = "";
    private Set<String> phone; 
    
    public Person(String name) {
        this.name = name;
        this.phone = new HashSet<String>();
    }
    
    public Person() {
        this.name = new String();
        this.phone = new HashSet<String>();
    }
    
    public String getName(){
        return this.name; 
    }
    
    public String getAddress(){
        return this.address; 
    }
    
    public Set<String> getPhone(){
        return this.phone; 
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
    public void setPhone(String phone) {
        this.phone.add(phone); 
    }
    
    public void setAddress(String street, String city) {
        this.address = street + " " + city; 
    }
    
    public void printNumbers() {
        for (String phone : this.phone) {
            System.out.println(" "  + phone);
        }
    }
    
    public void printDetails() {
        if (this.address.isEmpty()) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address" + this.address);
        } if (this.phone.isEmpty()) {
            System.out.println("  phone number not found");
        } else {
            System.out.println("   phone numbers:");
            for (String number: this.phone) {
                System.out.println("  " + number);
            }
        }
    }
    
    public void printNameAndDetails() {
        System.out.println(" " + this.name);
        printDetails();
    }
    
    @Override
    public int compareTo(Person another) {
        return this.name.compareToIgnoreCase(another.getName());
    }
    
}
