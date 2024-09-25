public class Planet {

    // Класс
    private String name;
    private double weight;

    // Конструктор
    public Planet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


}

