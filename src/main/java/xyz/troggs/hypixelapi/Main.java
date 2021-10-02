package xyz.troggs.hypixelapi;

public class Main {
    public static void main(String[] args) {
        System.out.println(new HypixelAPI("1f0d1d71-c38d-4698-9fa5-edf290833fd6").getPlayerByIGN("SpookyMitch").getStats().getBlitz().getDeaths());
    }
}
