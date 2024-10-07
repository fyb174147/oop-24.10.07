public class Pig extends Animal{
    public Pig() {
        super();
        this.canWalk = true;
    }

    public Pig(String name) {
        super(name);
        this.canWalk = true;
    }

    public Pig(String name, boolean canSwim, boolean canWalk) {
        super(name, canSwim, canWalk);
    }
}
