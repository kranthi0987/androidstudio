package app.managementapp.college.com.collegemanagement.api.;


import app.managementapp.college.app.managementapp.college.com.collegemanagement.api.Authentication.FirstAuth.FirstLoginResponse;
import app.managementapp.college.app.managementapp.college.com.collegemanagement.api.Authentication.RegularAuth.RegularLoginResponse;
import app.managementapp.college.app.managementapp.college.com.collegemanagement.api.FeedbackList.FeedbackListResponse;
import app.managementapp.college.app.managementapp.college.com.collegemanagement.api.FeedbackReply.FeedbackReplyRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Sri Harrsha on 05-Jul-16.
 */
public interface CollegeManagementApiService {

    @GET("ManagementService.svc/GetGeneralFeedbackAndComplaints")
    Call<FeedbackListResponse> getFeedbackList(@Header("Token") String token, @Query("Type") Integer type);

    @POST("ManagementService.svc/UpdateGeneralFeedbackAndComplaints")
    Call<FeedbackListResponse> giveReplyForFeedback(@Header("Token") String token, @Body FeedbackReplyRequest requestObject);

    @POST("authenticationService.svc/AuthenticateRequestForFirstLogin")
    Call<FirstLoginResponse> doFirstLogin(@Query("username") String username, @Query("Password") String password);

    @POST("AuthenticationService.svc/AuthenticateRequest")
    Call<RegularLoginResponse> doRegularLogin(@Query("username") String username, @Query("Password") String password);


}
