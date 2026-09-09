package main.domain;

public class Planet {
    private final String name;
    private final String sector;
    private int securityLevel;

    public Planet(String name, String sector, int securityLevel) {
        this.name = name;
        this.sector = sector;
        this.securityLevel = securityLevel;
    }

    public String getName() { return name; }
    public String getSector() { return sector; }
    public int getSecurityLevel() { return securityLevel; }
}
