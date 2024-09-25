public class Planet {

    // Класс
    String name;
    double weight;

    // Конструктор
    public Planet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Метод
    public void method() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public double weight() {
        return weight;
    }
}

