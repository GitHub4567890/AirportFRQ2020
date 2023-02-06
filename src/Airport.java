import java.util.ArrayList;

public class Airport
{
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights)
    {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights()
    {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue()
    {
        double totalRevenue = 0;
        for (int i = 0; i <= allFlights.size() - 1; i++) {
            if (allFlights.get(i).getNumPassengers() > allFlights.get(i).getCapacity()) {
                totalRevenue += allFlights.get(i).getCapacity() * allFlights.get(i).getPrice();
            } else {
                totalRevenue += allFlights.get(i).getNumPassengers() * allFlights.get(i).getPrice();
            }
        }
        return totalRevenue;
    }

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights()
    {
        int totalRemoved = 0;
        for (int i = 0; i <= allFlights.size() - 1; i++) {
            if (allFlights.get(i).getNumPassengers() < (.20 * allFlights.get(i).getCapacity())) {
                totalRemoved += allFlights.get(i).getNumPassengers();
                allFlights.remove(i);
            }
        }
        return totalRemoved;
    }
}
