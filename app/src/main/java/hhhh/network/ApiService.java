package hhhh.network;

import hhhh.model.ItemResponse;
import hhhh.model.RootResponse;
import hhhh.model.TokenResponse;
import hhhh.model.UserCreateOpen;
import hhhh.model.UserOut;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    // @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("login/access-token") // Note: No leading slash here
    @FormUrlEncoded
    Call<TokenResponse> getAccessToken(@Field("username") String username, @Field("password") String password);

    @POST("users/open")
    Call<UserOut> createUserOpen(@Body UserCreateOpen user);
}
