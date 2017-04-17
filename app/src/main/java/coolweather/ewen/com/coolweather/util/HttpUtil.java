package coolweather.ewen.com.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Ewen on 2017/4/15.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();   //客户端对象
        Request request = new Request.Builder().url(address).build();   //发起请求
        client.newCall(request).enqueue(callback);  //调用回调地址
    }

}
