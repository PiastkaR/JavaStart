package com.javastart.collections.maps.company;

import java.util.HashMap;

public class Company {
    private HashMap<String, Employee> companyDb = new HashMap<>();

    public HashMap<String, Employee> getCompanyDb() {
        return companyDb;
    }

    public void setCompanyDb(HashMap<String, Employee> companyDb) {
        this.companyDb = companyDb;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyDb=" + companyDb +
                '}';
    }
}
