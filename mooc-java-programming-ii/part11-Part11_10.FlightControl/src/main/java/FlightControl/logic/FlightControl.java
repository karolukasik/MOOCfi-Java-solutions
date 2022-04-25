package FlightControl.logic;

import java.util.HashMap;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class FlightControl {
    private HashMap<String, Airplane> planes;
    private HashMap<String, Place> places;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
        this.planes = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        if (planes.containsKey(ID)) {
            System.out.println("This plane has already been added");
        }
        planes.putIfAbsent(ID, new Airplane(ID, capacity));
    }

    public void addAirplane(Airplane plane) {
        this.planes.put(plane.getID(), plane);
    }

    public void addFlight(String airplaneID, String departueAirportID, String targetAirportID) {
        if (planes.containsKey(airplaneID)) {
            this.places.putIfAbsent(departueAirportID, new Place(departueAirportID));
            this.places.putIfAbsent(targetAirportID, new Place(targetAirportID));
            Flight flight = new Flight(places.get(departueAirportID), places.get(targetAirportID),
                    planes.get(airplaneID));
            this.flights.put(flight.toString(), flight);
        } else {
            System.out.println("The given plane is not on the planes list");
        }
    }

    public void printAirplanes() {
        for (String key : planes.keySet()) {
            System.out.println(planes.get(key));
        }
    }

    public void printFlights() {
        for (String key : flights.keySet()) {
            System.out.println(flights.get(key));
        }
    }

    public Airplane getPlane(String planeID) {
        return this.planes.get(planeID);
    }
}
