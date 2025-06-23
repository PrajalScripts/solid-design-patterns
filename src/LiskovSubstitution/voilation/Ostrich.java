package LiskovSubstitution.voilation;

class Ostrich extends VBird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}