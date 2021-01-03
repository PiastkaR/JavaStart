package com.javastart.arrays.person;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] person = new Person[INITIAL_CAPACITY];
    private int emptyPlace;

    public void add(Person p) {
        if (person == null)
            throw new NullPointerException("person cannot be null");
        if (emptyPlace == person.length) {
            person = Arrays.copyOf(person, person.length * 2);
        }
        person[emptyPlace] = p;
        emptyPlace++;
    }

    public void remove(Person p) {
        if (person == null)
            throw new NullPointerException("person cannot be null");
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < emptyPlace && foundIndex == notFound; i++) {
            if (person.equals(person[i])) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound) {
            System.arraycopy(person, foundIndex + 1, person, foundIndex, person.length - foundIndex - 1);
            emptyPlace--;
            person[emptyPlace] = null;
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= emptyPlace || index < 0)
            throw new ArrayIndexOutOfBoundsException("Index has to be positive and lower than " + emptyPlace);
        return person[index];
    }

    public int size() {
        return person.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonDatabase size: ");
        sb.append(emptyPlace);
        sb.append("\n");
        for (int i = 0; i < emptyPlace; i++) {
            sb.append(" > ");
            sb.append(person[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
