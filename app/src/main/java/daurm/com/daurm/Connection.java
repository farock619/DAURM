package daurm.com.daurm;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Connection {
    public static String getData(String urlUser) {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(urlUser)
                .build();


        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException error) {
            return error.toString();
        }

    }
}
