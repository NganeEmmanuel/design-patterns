public class Singleton {
    private static Singleton userInstance = null;
    private Singleton(){
    }

    public static Singleton getInstance(){
        if(userInstance == null){
            userInstance = new Singleton();
        }
        return userInstance;
    }
}
