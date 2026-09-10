public class AccountOwner {
    private String name;
    private String lastName;
    //other properties
    
    //constructor
    public AccountOwner(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    
    
    //setter - java sucks
    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
