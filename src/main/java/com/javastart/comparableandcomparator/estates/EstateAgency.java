package com.javastart.comparableandcomparator.estates;

import java.util.Arrays;

public class EstateAgency {
    private Estate[] estates = new Estate[10];

    public EstateAgency(Estate[] estates) {
        this.estates = estates;
    }

    public void addEstate(Estate estate) {
        for (int i = 0; i < estates.length; i++) {
//            if (estates[i] == estates[estates.length] && estates[i] != null) {
//                Arrays.copyOf(estates, estates.length * 2);
//            }
            estates[i] = estate;
            //TODO? probably have to add variable with counter for estates like emptyEstates int..
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstateAgency that = (EstateAgency) o;
        return Arrays.equals(estates, that.estates);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(estates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Estate estate : estates) {
            sb.append(estate.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Estate[] getEstates() {
        return estates;
    }
}
