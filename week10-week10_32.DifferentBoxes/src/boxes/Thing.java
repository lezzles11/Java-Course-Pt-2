package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("cannot be negative");
        }
        this.name = name;
        this.weight = weight;
    }
    
    public Thing(String name) {
        this(name, 0);
    }

    public String getName(){
        return this.name; 
    }
    
    public int getWeight(){
        return this.weight; 
    }
    @Override
    public int hashCode() {
        return 7 * name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass() ) {
            return false;
        }
        
        Thing otherThing = (Thing) o;
        
        return (this.name != null && this.name.equals(otherThing.name));
    }

}
