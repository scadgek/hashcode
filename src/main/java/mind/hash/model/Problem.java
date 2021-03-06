package mind.hash.model;

import mind.hash.FileParse;
import mind.hash.Solution;
import mind.hash.GreedySolver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Denys on 2018-03-01.
 */
public class Problem {

    int rows;
    int columns;
    int vehicles;
    int bonus;
    int steps;
    List<Ride> rides;
    List<Car> cars = new ArrayList<>();

    public Solution solve()
    {
        return new Solution(new GreedySolver(cars, rides, bonus).solve());
    }

    public static Problem readFromFile( String fileName )
    {
        return new FileParse().parse( fileName );
    }

    @Override
    public String toString()
    {
        return rows + " rows, " + columns + " columns, " + vehicles + " vehicles, " + rides.size() + " rides, " + bonus + " bonus and " + steps + " steps\n"
                + rides.stream().map( Ride::toString ).collect( Collectors.joining( "\n" ) );
    }

    public int getRows() {
        return rows;
    }

    public Problem setRows(int rows) {
        this.rows = rows;
        return this;
    }

    public int getColumns() {
        return columns;
    }

    public Problem setColumns(int columns) {
        this.columns = columns;
        return this;
    }

    public int getVehicles() {
        return vehicles;
    }

    public Problem setVehicles(int vehicles) {
        this.vehicles = vehicles;
        for(int i = 0; i < vehicles; i++){
            cars.add(new Car());
        }
        return this;
    }

    public int getBonus() {
        return bonus;
    }

    public Problem setBonus(int bonus) {
        this.bonus = bonus;
        return this;
    }

    public int getSteps() {
        return steps;
    }

    public Problem setSteps(int steps) {
        this.steps = steps;
        return this;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public Problem setRides(List<Ride> rides) {
        this.rides = rides;
        return this;
    }
}
