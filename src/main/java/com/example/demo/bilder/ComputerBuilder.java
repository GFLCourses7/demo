package com.example.demo.bilder;

public class ComputerBuilder {
    private Integer hdd;
    private Integer ram;
    //Optional
    private Integer ssd;
    private Boolean network;

    public ComputerBuilder(Integer hdd, Integer ram) {
        this.hdd = hdd;
        this.ram = ram;
    }

    public ComputerBuilder setHdd(Integer hdd) {
        this.hdd = hdd;
        return this;
    }

    public ComputerBuilder setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setSsd(Integer ssd) {
        this.ssd = ssd;
        return this;
    }

    public ComputerBuilder setNetwork(Boolean network) {
        this.network = network;
        return this;
    }

    public Integer getHdd() {
        return hdd;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public Boolean getNetwork() {
        return network;
    }

    public ComputerDesign build() {
        return new ComputerDesign(this);
    }
}
