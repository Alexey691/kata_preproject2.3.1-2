package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarDao {

    private static List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Haval", "red", 2019));
        cars.add(new Car("BMV", "blue", 2018));
        cars.add(new Car("Volvo", "purple", 2022));
        cars.add(new Car("Porsche", "yellow", 2009));
        cars.add(new Car("Opel", "green", 1998));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getAllCars(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}
