package com.pet;
public class VirtualPet {
    private String name;
    private int hunger;
    private int feed;
    private int bored;
    private int play;
    private int tired;
    private int rest;

    public VirtualPet(String name, int hunger, int feed, int bored, int play, int tired, int rest) {
        this.name = name;
        this.hunger = hunger;
        this.feed = feed;
        this.bored = bored;
        this.play = play;
        this.tired = tired;
        this.rest = rest;
    }

    public String getName() { return "Horace the Hippo"; }
    public int getHunger() { return hunger; }
    public int getFeed() { return feed; }
    public int getBored() { return bored; }
    public int getPlay() { return play; }
    public int getTired() { return tired; }
    public int getRest() { return rest; }

    public void tick() {
        hunger++;
        feed--;
        bored++;
        play--;
        tired++;
        rest--;
    }
    public void feedPet(){
        this.hunger -=2;
        this.bored -=1;
        this.tired +=1;
    }
    public void playWithPet(){
        this.hunger +=2;
        this.bored -=2;
        this.tired -=1;
    }
    public void restPet(){
        this.hunger +=1;
        this.tired -=2;
    }

}
