package service.impl;

import beans.Weather;
import service.ServiceWeather;

/*
* 这里就不用dao层了，直接在service层取数据
* */
public class ServiceWeatherImpl implements ServiceWeather {
    @Override
    public Weather queryCity(String cityCode) {
        Weather weather=new Weather();
        if("101010100".equals(cityCode)){
            weather.setCity("北京");
            weather.setTemp("29度");
            weather.setSd("40");
        }else{
            weather.setCity("全国");
            weather.setTemp("19度");
            weather.setSd("59");
        }
        return weather;
    }
}
