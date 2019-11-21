package se.lexicon.skovde.models;

public class Zebra extends Animal {
    private boolean whiteOnBlack;   // default´s to false
    private int legs;               // default´s to 0

    public Zebra(int legs, boolean whiteOnBlack, String name, double weight)
    {
        super(name, weight);// chain-constructor call to parent class

        this.legs = legs;
        this.whiteOnBlack = whiteOnBlack;
    }

    @Override
    public void eat()
    {
        System.out.println( getName() +" eats some leaves!");
    }

    public boolean isWhiteOnBlack() {
        return whiteOnBlack;
    }

    public void setWhiteOnBlack(boolean whiteOnBlack) {
        this.whiteOnBlack = whiteOnBlack;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
