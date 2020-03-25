package main.java.com.getjavajob.training.gareev.init.gareev.lesson01;

public enum PartsOfWorldInf {
    AMERICA(24250000, 565265000, 23),
    EUROPE(10180000, 742500000, 43),
    ASIA(44579000, 4164252000L, 54),
    AFRICA(30221532, 1100000000, 55),
    AUSTRALIA(7692024, 23130931, 1),
    ANTARCTICA(1410000, 5000, 0);

    private double area;
    private double population;
    private double numOfCountries;
    PartsOfWorldInf(double area, double population, double numOfCountries) {
        this.area =area;
        this.numOfCountries = numOfCountries;
        this.population = population;
    }
    @Override
    public String toString(){
        return "area: "+area+"; population: "+population+"number of countries: "+numOfCountries;
    }
}
