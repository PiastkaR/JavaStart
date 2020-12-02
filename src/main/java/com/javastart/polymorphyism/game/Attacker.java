package com.javastart.polymorphyism.game;

public class Attacker extends Character {
    private double attackBonus;

    public Attacker(String name, int attackStrength, int defense, int hp, double attackBonus) {
        super(name, attackStrength, defense, hp);
        this.attackBonus = attackBonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "attackBonus:" + attackBonus;
    }

    @Override
    public double getTotalAttack() {
        return getAttackStrength() + getAttackStrength() * attackBonus;
    }

    @Override
    public double getTotalDefense() {
        return getDefense();
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(double attackBonus) {
        this.attackBonus = attackBonus;
    }
}
