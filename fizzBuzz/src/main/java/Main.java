public class Main {

    public static void main(String[] args){
        System.out.println("Hello world!");
        for (int i = 0; i < 101; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz (Integer nb){
        String onVerra = "";

        if (nb%3 == 0){
            onVerra+= "fizz";
        }
        if (nb%5 == 0){
            onVerra+= "buzz";
        }
        if (onVerra.isEmpty()){
            onVerra = nb.toString();
        }
        return onVerra;
    }

}
