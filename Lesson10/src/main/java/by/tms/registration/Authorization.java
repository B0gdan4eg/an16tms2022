package by.tms.registration;

public class Authorization {
    public static void authorization(String login, String password, String passwordConfirm) {
        try {
            checkLogin(login);
            checkPassword(password);
            checkPasswordConfirm(password, passwordConfirm);
        } catch (WrongLoginException | WrongPasswordException wrongLoginException) {
            System.out.println(wrongLoginException.getMessage());
        }
    }

    public static void checkLogin(String login) throws WrongLoginException {
        if (login.matches("[0-9a-zA-Z_]{6,20}")) {
            System.out.println("Success");
        } else {
            throw new WrongLoginException("Wrong Login");
        }
    }

    public static void checkPassword(String password) throws WrongPasswordException {
        if (password.matches("[0-9a-zA-Z_]{6,20}")) {
            System.out.println("Success");
        } else {
            throw new WrongPasswordException("Wrong Password");
        }
    }

    public static void checkPasswordConfirm(String password, String confirmPassword) throws WrongPasswordException {
        if (password.equals(confirmPassword)) {
            System.out.println("You are registered");
        } else {
            throw new WrongPasswordException("Passwords don't match");
        }
    }
}
