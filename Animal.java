public class Animal {
    protected String name;
    protected boolean canSwim;
    protected boolean canWalk;

    public Animal() {
        this.name = "";
        this.canSwim = false;
        this.canWalk = false;
    }

    public Animal(String name) {
        this.name = name;
        this.canSwim = false;
        this.canWalk = false;
    }

    public Animal(String name, boolean canSwim, boolean canWalk) {
        this.name = name;
        this.canSwim = canSwim;
        this.canWalk = canWalk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }
}
