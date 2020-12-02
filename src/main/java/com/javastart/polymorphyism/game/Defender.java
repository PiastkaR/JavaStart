package com.javastart.polymorphyism.game;

public class Defender extends Character {
    private double defenseBonus;

    public Defender(String name, int attackStrength, int defense, int hp, double defenseBonus) {
        super(name, attackStrength, defense, hp);
        this.defenseBonus = defenseBonus;
    }

    @Override
    public double getTotalAttack() {
        return getAttackStrength();
    }

    @Override
    public double getTotalDefense() {
        return getDefense() + getDefense() * defenseBonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "attackBonus:" + defenseBonus;
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(double defenseBonus) {
        this.defenseBonus = defenseBonus;
    }
}
