import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Planet> solarSystem = new ArrayList<>();

        solarSystem.add(new Planet("Меркурий", 0.330)); // 3.33×10²³
        solarSystem.add(new Planet("Венера", 4.87)); // 4.87×10²⁴
        solarSystem.add(new Planet("Земля", 5.97)); // 5.97×10²⁴
        solarSystem.add(new Planet("Марс", 0.642)); // 6.42×10²³
        solarSystem.add(new Planet("Юпитер", 1898.6)); // 1.8986⋅10^27
        solarSystem.add(new Planet("Сатурн", 568)); // 5.68×10²⁶
        solarSystem.add(new Planet("Уран", 86.832)); // 8.6832·10^25
        solarSystem.add(new Planet("Нептун", 102)); // 1.02×10^26

        // Вывод списка планет
        for (Planet planet : solarSystem) {
            System.out.println(planet);
        }

        class Astronom implements Comparator<Planet> {
            @Override
            public int compare(Planet mass1, Planet mass2) {
                return Double.compare(mass1.weight(), mass2.weight());
            }
        }

        solarSystem.sort(new Astronom());
        System.out.println(solarSystem);
//        solarSystem.sort((mass1, mass2) -> Double.compare(mass1.weight(), mass2.weight()));



    }
}

