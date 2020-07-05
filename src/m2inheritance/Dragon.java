package m2inheritance;
public class Dragon implements EggLayer, FireBreather {
    public String ANIMAL; // you can do this in regular class
    public static void main(String... args) {
        Dragon dragon = new Dragon();

        // uncomment the following line and see the error message
      // dragon.ANIMAL = "Dragon";

        System.out.println(dragon.identifyMyself());
    }
}