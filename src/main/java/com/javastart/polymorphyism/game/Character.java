package com.javastart.polymorphyism.game;

public class Character {
    private String name;
    private double attackStrength;
    private double defense;
    private double hp;

    public Character(String name, int attackStrength, int defense, int hp) {
        this.name = name;
        this.attackStrength = attackStrength;
        this.defense = defense;
        this.hp = hp;
    }

    public String getInfo() {
        return "Name: " + name + "Attack: " + attackStrength + "Defense: " + defense + "HP: " + hp;
    }

    public double getTotalAttack() {
        return attackStrength;
    }

    public double getTotalDefense() {
        return defense;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
