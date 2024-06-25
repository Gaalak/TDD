package Java.Heritage;

class Animal {
    protected int age;
    protected String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
          return age;
      }

        public String getName() {
              return name;
       }


    public void walk() {
                System.out.println("Je m'appelle " + name + ", et je marche");
            }

    public String doStuffDeFou() {
                return getName() + "WOUUUUUU";
            }


     @Override
         public String toString() {
             return "[age = " + age
             + ", name = " + name + "]";
         }
}
