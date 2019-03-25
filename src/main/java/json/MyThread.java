package json;

import com.google.gson.Gson;
import lombok.extern.java.Log;
import okhttp3.*;

import java.io.IOException;
import java.util.logging.Logger;

@Log
public class MyThread extends Thread {
    private static Gson gson = new Gson();
    private static  String json;
    @Override
    public void run(){
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://api.nbp.pl/api/exchangerates/rates/a/gbp/last/3/?format=json")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                log.info(e.toString());


            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                json = response.body().string();





            }
        });
        System.out.println("moj watek");
    }

    public static Gson getGson() {
        return gson;
    }

    public static void setGson(Gson gson) {
        MyThread.gson = gson;
    }

    public static String getJson() {
        return json;
    }

    public static void setJson(String json) {
        MyThread.json = json;
    }

    public static Logger getLog() {
        return log;
    }
}
