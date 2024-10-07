public class Fish extends Animal {
    public Fish() {
        super();
        this.canSwim = true;
    }

    public Fish(String name) {
        super(name);
        this.canSwim = true;
    }

    public Fish(String name, boolean canSwim, boolean canWalk) {
        super(name, canSwim, canWalk);
    }
}
