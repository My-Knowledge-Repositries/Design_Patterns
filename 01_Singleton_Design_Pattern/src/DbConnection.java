/**
 * @version - v0.1
 * @Owner - Oshada Eranga
 */

public class DbConnection {
    private static DbConnection instance; //= new DbConnection();

    //make the constructor private so that this class cannot be
    //instantiated
    private DbConnection(){}

    //Get the only object available
    public static DbConnection getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
