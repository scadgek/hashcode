package mind.hash.model;

import mind.hash.Solution;

import java.util.List;

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

    public Solution solve()
    {
        return new Solution();
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