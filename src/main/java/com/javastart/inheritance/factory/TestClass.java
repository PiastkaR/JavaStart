package com.javastart.inheritance.factory;

public class TestClass {
    public static void main(String[] args) {
        Part part = new Part();
        ExhaustPart exhaustPart = new ExhaustPart();
        Tire tire = new Tire();

        part.setId(123);
        part.setModel("part model");
        part.setProducerName("Rafal");
        part.setSeries(456);

        exhaustPart.setId(898);
        exhaustPart.setProducerName("Rafal");
        exhaustPart.setEuropeanStandard(true);

        tire.setId(78908);
        tire.setModel("Dunlop");
        tire.setWidth(56);

        part.info();
        exhaustPart.info();
        tire.info();
    }
}
