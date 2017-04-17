package coolweather.ewen.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ewen on 2017/4/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
