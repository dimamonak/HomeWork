package HomeWork;

public class Cat {
    String name = "unknown";
    int age = 0;
    int weight = 0;
    String color = "unknown";
    String adress = "unknown";

    public Cat() {


    }
    public Cat(String name) {
        this.name = name;

    }
    public Cat (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat ( int weight, String color) {
        this.weight = weight;
        this.color = color;
        }
    public Cat ( int weight, String color, String adress) {
        this.weight = weight;
        this.color = color;
        this.adress = adress;


    }


}
