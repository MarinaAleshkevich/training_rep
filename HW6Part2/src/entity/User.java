package entity;

public class User extends Person{
   private String email;
    private String password;

    public User (String email,String password,String firstName,String lastName){
        super (firstName,lastName);
        this.email= email;
        this.password = password;
    }
    public String getFullInfo (){
      return "Имя: " + this.firstName + " " + this.lastName + "\n" + "E-mail: " + this.email;
    }
    public boolean isPasswordCorrect (String password2 ){
               return password.equals(password2);

    }

}
