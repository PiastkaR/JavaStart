package com.javastart.polymorphyism.game;

public class GameRun {
    public static void main(String[] args) {
        Party party1 = new Party("Team1");
        Party party2 = new Party("Team2");

        party1.addPartyMember(new Attacker("attacker11", 50, 30, 100, 0.2));
        party1.addPartyMember(new Attacker("attacker12", 70, 10, 80, 0.4));
        party1.addPartyMember(new Defender("defender11", 20, 80, 60, 0.6));

        party2.addPartyMember(new Attacker("attacker21", 50, 30, 30, 0.25));
        party2.addPartyMember(new Defender("defender21", 5, 120, 40, 0.15));
        party2.addPartyMember(new Defender("defender22", 20, 80, 110, 0.28));

        FightSimulation fightSimulation = new FightSimulation();
        fightSimulation.fight(party1, party2);
    }
}
