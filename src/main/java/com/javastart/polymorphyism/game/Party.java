package com.javastart.polymorphyism.game;

public class Party {
    private static final int MAX_PARTY_MEMBERS = 3;

    private String name;
    private Character[] members =  new Character[MAX_PARTY_MEMBERS];
    private int startPartyMembers = 0;

    public Party(String name) {
        this.name = name;
    }

    public void addPartyMember(Character character) {
        if (startPartyMembers < MAX_PARTY_MEMBERS) {
            members[startPartyMembers] = character;
            startPartyMembers++;
        }
    }

    public double totalPartyAttack() {
        double totalPartyAttack = 0;
        for (int i = 0; i < members.length; i++) {
            double memberAttack = members[i].getTotalAttack();
            totalPartyAttack = totalPartyAttack + memberAttack;
        }
        return totalPartyAttack;
    }

    public double totalPartyDefense() {
        double totalPartyDefense = 0;
        for (int i = 0; i < members.length; i++) {
            double memberDefense = members[i].getTotalDefense();
            totalPartyDefense = totalPartyDefense + memberDefense;
        }
        return totalPartyDefense;
    }

    public double totalPartyHP() {
        double totalPartyHP = 0;
        for (int i = 0; i < members.length; i++) {
            double memberHP = members[i].getHp();
            totalPartyHP = totalPartyHP + memberHP;
        }
        return totalPartyHP;
    }

    public void getInfo() {
        for (Character character : members) {
            System.out.println(character.getInfo());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
