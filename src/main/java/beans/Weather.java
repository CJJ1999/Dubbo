package beans;

public class Weather {
    //天气湿度
    private String sd;
    private String temp;
    private String city;

    @Override
    public String toString() {
        return "天气情况：" +
                "湿度='" + sd + '\'' +
                ", 温度='" + temp + '\'' +
                ", 城市='" + city + '\'' +
                '}';
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
