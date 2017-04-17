package coolweather.ewen.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ewen on 2017/4/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
