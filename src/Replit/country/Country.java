package Replit.country;

public class Country {
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

/*
### Create the `Country.java` file according the following requirements. The `Main` class will use the Country class objects to test different scenarios.
        - declare these `instance variables`:
        - name (String)
        - continent (String)
        - population (long)
        - nearWater(boolean)

        - create these `constructors` to initialize the variables:
        - 2 argument: name, continent
        - 3 argument: name, continent, population
        - 4 argument: name, continent, population, nearWater

        #### Main topics: class & object, instance variables, constructors, constructor chaining
        */
