//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
//      for(Flyable object : flyingObjects){
//          object.fly();
//      }
        Animal[] animals = {new Dog(), new Cat()};
        for(Animal object : animals){
            object.bark();
        }
    }
}