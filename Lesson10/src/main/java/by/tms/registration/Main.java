package by.tms.registration;

public class Main {
    public static void main(String[] args) {
        Authorization.authorization("bogdan", "47589_43539", "47589_43539");
        System.out.println("---------");
        Authorization.authorization("bOgdan123", "!_43539", "47589_43539");
        System.out.println("---------");
        Authorization.authorization("bogdan123", "47589_43539", "47589_43511");
    }
}
