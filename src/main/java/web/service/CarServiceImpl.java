package web.service;

import web.dao.CarDao;
import web.models.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private CarDao carDao;
    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getAllCars(Integer count) {
        return carDao.getAllCars(count);
    }
}
