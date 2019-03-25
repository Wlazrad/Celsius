package json;

import com.google.gson.Gson;

import json.MyThread;
import lombok.extern.java.Log;
import servlet.ExchangeRatesSeries;


@Log
public class Main {

    public static void main (String[] vararg) throws Exception {

        Thread thread = new MyThread();
        thread.start();
        thread.sleep(2000);




       // System.out.println(request);




        System.out.println(MyThread.getJson());
        System.out.println(MyThread.getJson());
        String json1 = MyThread.getJson();
        Gson gson = new Gson();
        ExchangeRatesSeries newList = gson.fromJson(json1, ExchangeRatesSeries.class);
        log.info(newList.toString());
        System.out.println(newList.getRates().length);




        log.info("koniec bloku");
    }

}
