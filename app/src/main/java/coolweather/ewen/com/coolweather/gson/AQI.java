package coolweather.ewen.com.coolweather.gson;

/**
 * Created by Ewen on 2017/4/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
