public class Duck extends Animal {
    public Duck() {
        super();
        this.canSwim = true;
        this.canWalk = true;
    }

    public Duck(String name) {
        super(name);
        this.canSwim = true;
        this.canWalk = true;
    }

    public Duck(String name, boolean canSwim, boolean canWalk) {
        super(name, canSwim, canWalk);
    }
}
