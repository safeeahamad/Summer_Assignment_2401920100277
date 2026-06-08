
interface Libraryuser{
   void registerAccount();
   void requestBook();
}
class KidUsers implements Libraryuser {
    int age;
    String bookType;

    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have sucessfully registered under a Kids Account");
        }
        if (age > 12) {
            System.out.println("Sorry,Age must be less than 12 to register as a kid");
        }
    }

    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("“Book Issued successfully, please return the book \n" +
                    "within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements Libraryuser{
    int age;
    String bookType;

    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have sucessfully registered under a Adult Account");
        }
        if (age < 12) {
            System.out.println("Sorry,Age must be greater than 12 to register as a adult");
        }
    }

    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("“Book Issued successfully, please return the book \n" +
                    "within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        //Test case 1
    Libraryuser user = new KidUsers();
    ((KidUsers) user).age = 10;
    user.registerAccount();
    ((KidUsers) user).age = 18;
    user.registerAccount();

    ((KidUsers) user).bookType = "Kids";
    user.requestBook();
    ((KidUsers) user).bookType = "Fiction";
    user.requestBook();

    // Test case 2
        Libraryuser users = new AdultUser();
        ((AdultUser) users).age = 5;
        users.registerAccount();
        ((AdultUser) users).age = 23;
        users.registerAccount();

        ((AdultUser) users).bookType = "Kids";
        users.requestBook();
        ((AdultUser) users).bookType = "Fiction";
        users.requestBook();
    }
}
