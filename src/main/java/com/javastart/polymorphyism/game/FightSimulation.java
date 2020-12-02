package com.javastart.polymorphyism.game;

public class FightSimulation {
    public static void fight(Party team1, Party team2) {
        double team1Energy = attack(team2, team1);
        double team2Energy = attack(team1, team2);

        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Team " + team1.getName() + " wins! by: " + team1.totalPartyHP());
        } else if (energyDiff < 0) {
            System.out.println("Team " + team2.getName() + " wins! by: " + team2.totalPartyHP());
        } else {
            System.out.println("Even, both team die :P");
        }
    }

    private static double attack(Party attacker, Party defender) {
        double attack = attacker.totalPartyAttack();
        double defense = defender.totalPartyDefense();

        double attackPower = attack - defense;
        double energy = defender.totalPartyHP();

        if (attackPower > 0) {
            return energy - attackPower;
        } else {
            return energy;
        }
    }
}
