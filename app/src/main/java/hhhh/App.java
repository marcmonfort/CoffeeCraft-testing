/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hhhh;

import hhhh.model.RootResponse;
import hhhh.model.TokenResponse;
import hhhh.network.ApiService;
import hhhh.network.RetrofitClient;
import retrofit2.Call; // Import the Call class
import retrofit2.Retrofit; // Import the Retrofit class
import retrofit2.Callback; // Import the Callback class

import retrofit2.Response; // Import the Response class

public class App {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getRetrofitInstance().create(ApiService.class);
        Call<TokenResponse> call = apiService.getAccessToken("admin@example.com",
                "changethis");

        call.enqueue(new Callback<TokenResponse>() {
            @Override
            public void onResponse(Call<TokenResponse> call, Response<TokenResponse> response) {
                if (response.isSuccessful()) {
                    System.out.println("Access Token: " + response.body().getAccessToken());
                } else {
                    System.out.println("Login failed: " + response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<TokenResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}