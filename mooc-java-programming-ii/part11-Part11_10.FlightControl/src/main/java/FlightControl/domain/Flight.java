package FlightControl.domain;

public class Flight {
    private Place departueAirport;
    private Place targetAirport;
    private Airplane plane;

    public Flight(Place departueAirport, Place targetAirport, Airplane plane) {
        this.departueAirport = departueAirport;
        this.targetAirport = targetAirport;
        this.plane = plane;
    }

    @Override
    public String toString() {
        return this.plane.toString() + " ("
                + this.departueAirport.toString() + "-"
                + this.targetAirport.toString() + ")";
    }
}
