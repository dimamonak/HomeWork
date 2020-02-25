package HomeWork;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat( "Vasia");
        System.out.println(cat.name);

        Cat cat1 = new Cat ("Vasia" , 12 , 2);
        System.out.println("_____________________________________________");
        System.out.println(cat1.name);
        System.out.println(cat1.weight + " kg");
        System.out.println(cat1.age + " years");

        Cat cat2 = new Cat ("Vasia", 2);
        System.out.println("_____________________________________________");
        System.out.println(cat2.name);
        System.out.println(cat2.weight + " kg");
        System.out.println(cat2.age + " years");

        System.out.println("_____________________________________________");

        Cat cat3 = new Cat (10, "white") ;
        System.out.println(cat3.weight + " kg");
        System.out.println(cat3.color + " color");
        System.out.println(cat3.name + " name");
        System.out.println(cat3.adress + " adress");
        System.out.println(cat3.age + " years");
        if (cat3.name == "unknown" && cat3.adress == "unknown" && cat3.age == 0 ) {
            System.out.println("имя, адрес и возраст – неизвестные. Кот - бездомный");
        }
        System.out.println("_____________________________________________");

        Cat cat4 = new Cat (7, "orange", "2 Street");
        System.out.println(cat4.weight + " kg");
        System.out.println(cat4.color + " color");
        System.out.println(cat4.adress + " adress");
        if (cat4.weight != 0 && cat4.adress != "unknown" && cat4.color != "unknown" ) {
            System.out.println("чужой домашний кот");
        }








    }

}
