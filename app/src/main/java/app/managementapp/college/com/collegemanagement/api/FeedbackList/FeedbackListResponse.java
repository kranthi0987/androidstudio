
package app.managementapp.college.app.managementapp.college.com.collegemanagement.api.FeedbackList;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedbackListResponse implements Parcelable{

    private List<DataList> dataList = new ArrayList<DataList>();
    private Object errorMessage;
    private String extendedToken;
    private Integer serviceResult;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    protected FeedbackListResponse(Parcel in) {
        dataList = in.createTypedArrayList(DataList.CREATOR);
        extendedToken = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(dataList);
        dest.writeString(extendedToken);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FeedbackListResponse> CREATOR = new Creator<FeedbackListResponse>() {
        @Override
        public FeedbackListResponse createFromParcel(Parcel in) {
            return new FeedbackListResponse(in);
        }

        @Override
        public FeedbackListResponse[] newArray(int size) {
            return new FeedbackListResponse[size];
        }
    };

    /**
     * 
     * @return
     *     The dataList
     */
    public List<DataList> getDataList() {
        return dataList;
    }

    /**
     * 
     * @param dataList
     *     The DataList
     */
    public void setDataList(List<DataList> dataList) {
        this.dataList = dataList;
    }

    /**
     * 
     * @return
     *     The errorMessage
     */
    public Object getErrorMessage() {
        return errorMessage;
    }

    /**
     * 
     * @param errorMessage
     *     The ErrorMessage
     */
    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 
     * @return
     *     The extendedToken
     */
    public String getExtendedToken() {
        return extendedToken;
    }

    /**
     * 
     * @param extendedToken
     *     The ExtendedToken
     */
    public void setExtendedToken(String extendedToken) {
        this.extendedToken = extendedToken;
    }

    /**
     * 
     * @return
     *     The serviceResult
     */
    public Integer getServiceResult() {
        return serviceResult;
    }

    /**
     * 
     * @param serviceResult
     *     The ServiceResult
     */
    public void setServiceResult(Integer serviceResult) {
        this.serviceResult = serviceResult;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
