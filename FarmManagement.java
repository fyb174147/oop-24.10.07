import java.util.ArrayList;
import java.util.List;

public class FarmManagement {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Pig("pig"));
        animals.add(new Duck("duck"));
        animals.add(new Fish("fish"));
        for (Animal animal : animals) {
            if (animal.isCanSwim() || animal.isCanWalk()) {
                System.out.println(animal.getName());
            }
        }
    }
}
