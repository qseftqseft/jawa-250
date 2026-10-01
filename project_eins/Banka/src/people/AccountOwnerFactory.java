package people;

public class AccountOwnerFactory {
    public AccountOwner createAccountOwner(String name, String lastName){
        return new AccountOwner(name, lastName);
    }
}
