package Java.Fonction.Exo2;


import java.util.Scanner;

public class Cat {

    Integer age;
    String name;
    Integer jumpHeight;

    public Cat() {

    }


    public static void main(String[] args) {
        Cat cate = new Cat(25,"Mikycikc",25);
        cate.createAndValidateCat(new JumperAndName());
        cate.createAndValidateCat(new EqualsAgeAndJumpHeight());
        cate.createAndValidateCat(new OlderAndName());
    }

    public Cat(Integer age, String name, Integer jumpHeight) {
        this.age = age;
        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    public static Cat createAndValidateCat(CatValidator cat, int age, String name, int jump height){
        // demande d'input ->
        // scanner
        Cat chat1 = new Cat(this.age,this.name,this.jumpHeight);
        if(cat.test(chat1)) {
            System.out.println("bon Alban!");
            return chat1;

        }
        System.out.println(this.age +' '+ this.name +' '+ this.jumpHeight);
        System.out.println("Ceci n'est pas un chat");
        return null;
    }

}
