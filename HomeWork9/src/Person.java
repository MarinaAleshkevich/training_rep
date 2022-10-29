public class Person {
    public String name;
    public String surname;
    public Address address;
    public Person (String name, String surname, Address address){
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){ return surname; }
    public Address getAddress(){return address; }
    public void setName(){ this.name = name;}
      public void setSurname(){
        this.surname = surname;
    }
    public void setAddress(){
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person [" +
                "name:" + name +
                ", surname: " + surname +
                ", address: " + address +
                ']';
    }
}
