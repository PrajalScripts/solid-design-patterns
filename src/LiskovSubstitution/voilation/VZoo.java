package LiskovSubstitution.voilation;

public class VZoo {
    public static void makeBirdFly(VBird bird) {
        bird.fly();  // May throw at runtime!
    }
}