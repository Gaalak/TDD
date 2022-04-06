
public class Main {

    public static void main(String[] args){
        //IntStream.range(0,101).mapToObj(Main::fizzBuzz).forEach(System.out::println);
        System.out.println("Hello world!");
        
        for (int i = 0; i < 101; i++) {

            System.out.println(fizzBuzz(i));

        }
    }

    public static String fizzBuzz (int nb){

        StringBuilder stringBuilder = new StringBuilder();


        if (nb%3 == 0){
            stringBuilder.append("fizz");
        }
        if (nb%5 == 0){
            stringBuilder.append("buzz");
        }
        if (stringBuilder.length() == 0){
            stringBuilder.append(nb);
        }

        return stringBuilder.toString();
    }

}
