public class WelcomeToJava {
    public static void main(String[] args) {
        System.out.println("Welcome to java!!!!");
        System.out.println("length = " + args.length );

        for(int index = 0; index < args.length ; index ++ ){
            System.out.println("args[" + index + "] = " + args[index] );
        }
    }
}
