package Java;

public class Employee {

    private String name;
    private String poste;
    private int age;


    public Employee(String name, String poste, int age) {

        this.name = name;
        this.poste = poste;
        this.age = age;

    }

    private String employeeStatut() {

        if (age <= 20) {

            return "JUNIOR";
        }
        if (age > 60) {
            return "ANCIEN";
        }
        return "SENIOR";
    }

    public String descriptif() {

        StringBuilder descriptif = new StringBuilder("L'employé à ")
                .append(age).append(" ans. Son poste porte l'intitulé ")
                .append(String.valueOf(poste.charAt(0)).toUpperCase())
                .append(poste.substring(1).toLowerCase())
                .append(". Il s'appelle ")
                .append(name.toUpperCase())
                .append(". C'est un ")
                .append(employeeStatut());


        return descriptif.toString();
    }


}
