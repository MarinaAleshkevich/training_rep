public class Person {
    public String name;
    public String lastName;
    public Address address;
    public Person (String name, String lastName, Address address){
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){ return lastName; }
    public Address getAddress(){return address; }
    public void setName(){ this.name = name;}
    public void setLastName(){
        this.lastName = lastName;
    }
    public void setAddress(){
        this.address = address;
    }
    @Override
    public String toString() {
        return name + " " + lastName + " " + address;}
    }
