public class TroubleMaker{
    public static void makeTrouble() throws MyOwnError {
        MyOwnError b = new MyOwnError ();
        throw b;
    }
}