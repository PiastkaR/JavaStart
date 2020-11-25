package com.javastart.inheritance.factory;

public class Part {
    private int id;
    private String producerName;
    private String model;
    private int series;

    public void info() {
        System.out.println("Part:" + " id: " + id
                + " producer name: " + producerName
                + " model: " + model + " series: " + series);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
