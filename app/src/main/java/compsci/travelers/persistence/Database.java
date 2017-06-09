package compsci.travelers.persistence;

import java.util.List;

import compsci.travelers.objects.Flight;
import compsci.travelers.objects.City;

public interface Database {
    void open(String string);

    void close();

    String getCitySequential(List<City> cityResult);

    String getFlightSequential(List<Flight> flightResult);

}


