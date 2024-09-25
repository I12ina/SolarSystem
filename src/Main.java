import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Planet> solarSystem = new ArrayList<>();

        solarSystem.add(new Planet("Mercury", 0.330)); // 3.33×10²³
        solarSystem.add(new Planet("Venus", 4.87)); // 4.87×10²⁴
//        solarSystem.add(new Planet("Venus", 2.07)); // 4.87×10²⁴
        solarSystem.add(new Planet("Earth", 5.97)); // 5.97×10²⁴
        solarSystem.add(new Planet("Mars", 0.642)); // 6.42×10²³
        solarSystem.add(new Planet("Jupiter", 1898.6)); // 1.8986⋅10^27
        solarSystem.add(new Planet("Saturn", 568)); // 5.68×10²⁶
        solarSystem.add(new Planet("Uranus", 86.832)); // 8.6832·10^25
        solarSystem.add(new Planet("Neptune", 102)); // 1.02×10^26

        // Вывод списка планет
        for (Planet planet : solarSystem) {
            System.out.println(planet);
        }


        solarSystem.sort(new Astronom());
        System.out.println("Sorted by weight: \n" + solarSystem);
//        solarSystem.sort((mass1, mass2) -> Double.compare(mass1.weight(), mass2.weight()));


        solarSystem.sort(new Stargazer());
        System.out.println("Sorted by name: \n" + solarSystem);
//        solarSystem.sort((mass1, mass2) -> Double.compare(mass1.weight(), mass2.weight()));

        solarSystem.sort(new CompareByMultipleParameters());
        System.out.println("Sorted by name and weight: \n" + solarSystem);
    }
}

class CompareByMultipleParameters implements Comparator<Planet> {
    @Override
    public int compare(Planet p1, Planet p2) {
        Stargazer sg = new Stargazer();
        if (sg.compare(p1, p2) == 0) {
            Astronom astro = new Astronom();
            return astro.compare(p1, p2);
        } else return sg.compare(p1, p2);
    }

//        // Сортировка по имени, а затем по весу
//                Collections.sort(solarSystem,new Comparator<Planet>()
//
//        {
//            @Override
//            public int compare (Planet mass1, Planet mass2){
//            int nameComparison = name1.getName().compareTo(name2.getName());
//            if (nameComparison != 0) {
//                return nameComparison;  // Сравниваем по имени
//            } else {
//                return Integer.compare(mass1.getWeight(), mass2.getWeight());  // Сравниваем по весу
//            }
//        }
//        }
}

class Astronom implements Comparator<Planet> {
    @Override
    public int compare(Planet mass1, Planet mass2) {
        return Double.compare(mass1.weight(), mass2.weight());
    }
}

class Stargazer implements Comparator<Planet> {
    @Override
    public int compare(Planet name1, Planet name2) {
        return name1.getName().compareTo(name2.getName());
    }
}