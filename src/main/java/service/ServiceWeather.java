package service;

import beans.Weather;

public interface ServiceWeather {
    Weather queryCity(String cityCode);
    int add();
    int delete();
    int updateOfMaster();
    int updateOfFix();

}
