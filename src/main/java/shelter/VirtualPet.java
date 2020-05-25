package shelter;

public class VirtualPet {
    private String name;
    private String type;
    private int hunger;
    private int thirst;
    private int bored;
    private int tick;

    public VirtualPet(String name, String type, int hunger, int thirst, int bored) {
        this.name = name;
        this.type = type;
        this.hunger = hunger;
        this.thirst = thirst;
        this.bored = bored;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBored() {
        return bored;
    }

    public void feed(int amount) {
        hunger -= amount;
    }

    public void water(int amount) {
        thirst -= amount;
    }

    public void play(int amount) {
        bored -= amount;
    }

    public void tick() {
        hunger += 1;
        thirst += 1;
    }

    public String toString() {
        return this.getName() + " \t\t" + this.type + " \t\t" + this.hunger + " \t\t" + this.thirst +
                " \t\t" + this.bored;
    }
}
