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


public class PhoneBook {
    private List<Person> people;
    private Map<String, Person> namePerson; 
    private Map<Set<String>, Person> numberPerson; 
    private Map<String, Person> addressPerson; 

    
    public PhoneBook() {
        this.people = new ArrayList<Person>();
        this.namePerson = new HashMap<String, Person>();
        this.numberPerson = new HashMap<Set<String>, Person>();
        this.addressPerson = new HashMap<String, Person>();
    }
    
    public void addPerson(Person person) {
        this.people.add(person); 
        this.namePerson.put(person.getName(), person);
        this.numberPerson.put(person.getPhone(), person);
        this.addressPerson.put(person.getAddress(), person);
    }
    
    public void addNumber(String name, String number) {
        if(this.namePerson.containsKey(name)) {
            Person person = getPersonByName(name); 
            person.setPhone(number);
            this.numberPerson.put(person.getPhone(), person);
        } else {
            Person person = new Person(name); 
            person.setPhone(number); 
            this.addPerson(person); 
        }
    }
    
    public void addAddress(String name, String street, String city) {
        if (this.namePerson.containsKey(name)) {
            Person person = getPersonByName(name);
            person.setAddress(street, city); 
            this.addressPerson.put(person.getAddress(), person);
    } else {
            Person person = new Person(name); 
            person.setAddress(street, city);
            this.addPerson(person);
        }
    } 
    
    public boolean containsPersonByName(String name) {
        return this.namePerson.containsKey(name);
    }
    
    public boolean containsPersonByNumber(String number) {
        for (Set <String> set : this.numberPerson.keySet()) {
            if (set.contains(number)) {
                return true; 
            }
        } return false; 
    }
    
    public Person getPersonByName(String name) {
        return this.namePerson.get(name); 
    }
    
    
    public String getNameByNumber(String number) {
        for (Person p : this.people) {
            if (p.getPhone().contains(number)) {
                return p.getName();
            }
        } return "not found";
                
    }
    
    public void delete(String name) {
        Person person = getPersonByName(name); 
        this.numberPerson.remove(person.getPhone());
        this.numberPerson.remove(person.getAddress());
        this.namePerson.remove(name); 
        this.people.remove(person); 
    }
    
    public List<Person> searchPersonByKeyword(String kw) {
        List<Person> personList = new ArrayList<Person>();
        if (kw.isEmpty()) {
            return this.people; 
        }
        for (Person p: this.people) {
            if (p.getName().contains(kw) || p.getAddress().contains(kw)) {
                personList.add(p);
            } else {
                for (String number : p.getPhone()) {
                    if (number.contains(kw)) {
                        personList.add(p);
                    }
                 }
            }
        } return personList; 
    }
    
}
