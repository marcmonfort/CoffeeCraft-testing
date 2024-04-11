package hhhh;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;

public interface AuthService {

    @FormUrlEncoded
    @POST("login/access-token")
    Call<AccessTokenResponse> getAccessToken(
            @Field("username") String username,
            @Field("password") String password);

    class AccessTokenResponse {
        String access_token;
        // Add other fields if needed

        public String getAccessToken() {
            return access_token;
        }
    }

    // Define other API endpoints and methods here
}
