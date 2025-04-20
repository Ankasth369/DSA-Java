public class OOPS2 {
    public static void main(String[] args) {
        
        BankAccount myAcc = new BankAccount();
        myAcc.name = "Raj";
       // myAcc.password = "22r232";     // invalid
       myAcc.setPassword("wfwefwqw");
        System.out.println(myAcc.name);
       // System.out.println(myAcc.password);
    }
}

class BankAccount {
    public String name;
    private String password;
    public void setPassword(String newPassword) {
        password = newPassword;
    }

}