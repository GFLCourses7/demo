package com.example.demo.bilder;

public class ComputerDesign {
    //Required
    private Integer hdd;
    private Integer ram;
    //Optional
    private Integer ssd;
    private Boolean network;

    public ComputerDesign() {
    }

    public ComputerDesign(ComputerBuilder computerBuilder) {
        this.hdd = computerBuilder.getHdd();
        this.ram = computerBuilder.getRam();
        this.ssd = computerBuilder.getSsd();
        this.network = computerBuilder.getNetwork();
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public Boolean getNetwork() {
        return network;
    }

    public void setNetwork(Boolean network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "ComputerDesign{" +
                "hdd=" + hdd +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", network=" + network +
                '}';
    }
}
