package json;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;

public class Json {
    private static Gson gson = new Gson();
    private static  String json;

    public static String getJson() {


        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://api.nbp.pl/api/exchangerates/rates/a/gbp/last/3/?format=json")
                .build();

        client.newCall(request).

                enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        json = response.body().string();
                    }
                });
        return json;
    }
}

