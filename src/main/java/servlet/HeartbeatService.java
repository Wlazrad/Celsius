package servlet;

import com.google.gson.Gson;
import json.Json;
import json.MyThread;
import json.Rates;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

/**
 * Provides a simple heartbeat.
 *
 */
@Path("/v1/heartbeat")
public class HeartbeatService {

    /**
     * Get the heartbeat.  Basically if you can hit this "service"
     * then the machine and process are up.
     *
     * @return a HTTP 200 with a simple "OK" text response packet.
     *
     */
    @Produces({ MediaType.TEXT_PLAIN })
    @GET
    public Response getHeartBeat() {
        Json.getJson();
        String json1= Json.getJson();

        Gson gson = new Gson();
        ExchangeRatesSeries newList = gson.fromJson(json1, ExchangeRatesSeries.class);

        System.out.println(newList.getRates().length);
        System.out.println(json1);
        List<Rates>raters = Arrays.asList(newList.getRates());

        return Response.ok(raters.get(1).getMid()).build();
    }
}