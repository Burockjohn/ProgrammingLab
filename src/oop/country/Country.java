package oop.country;

public class Country {
    // TODO: write your code here

    public String name, continent;
    public long population;
    public boolean nearWater;

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }

    public Country(String name, String continent, long population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
    }

    public Country(String name, String continent, long population, boolean nearWater) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.nearWater = nearWater;
    }


}