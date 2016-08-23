
package app.managementapp.college.com.collegemanagement.api.CourseFeedback;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DataList implements Parcelable {

    public static final Creator<DataList> CREATOR = new Creator<DataList>() {
        @Override
        public DataList createFromParcel(Parcel in) {
            return new DataList(in);
        }

        @Override
        public DataList[] newArray(int size) {
            return new DataList[size];
        }
    };
    @SerializedName("AppraisalDate")
    @Expose
    private String appraisalDate;
    @SerializedName("Department")
    @Expose
    private String department;
    @SerializedName("EmpCode")
    @Expose
    private String empCode;
    @SerializedName("EmpName")
    @Expose
    private String empName;
    @SerializedName("MaxPoint")
    @Expose
    private Integer maxPoint;
    @SerializedName("Percentage")
    @Expose
    private Integer percentage;
    @SerializedName("SubName")
    @Expose
    private String subName;
    @SerializedName("TotalPoint")
    @Expose
    private Integer totalPoint;

    protected DataList(Parcel in) {
        appraisalDate = in.readString();
        department = in.readString();
        empCode = in.readString();
        empName = in.readString();
        subName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(appraisalDate);
        dest.writeString(department);
        dest.writeString(empCode);
        dest.writeString(empName);
        dest.writeString(subName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * 
     * @return
     *     The appraisalDate
     */
    public String getAppraisalDate() {
        return appraisalDate;
    }

    /**
     * 
     * @param appraisalDate
     *     The AppraisalDate
     */
    public void setAppraisalDate(String appraisalDate) {
        this.appraisalDate = appraisalDate;
    }

    /**
     * 
     * @return
     *     The department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 
     * @param department
     *     The Department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 
     * @return
     *     The empCode
     */
    public String getEmpCode() {
        return empCode;
    }

    /**
     * 
     * @param empCode
     *     The EmpCode
     */
    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    /**
     * 
     * @return
     *     The empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 
     * @param empName
     *     The EmpName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * 
     * @return
     *     The maxPoint
     */
    public Integer getMaxPoint() {
        return maxPoint;
    }

    /**
     * 
     * @param maxPoint
     *     The MaxPoint
     */
    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
    }

    /**
     * 
     * @return
     *     The percentage
     */
    public Integer getPercentage() {
        return percentage;
    }

    /**
     * 
     * @param percentage
     *     The Percentage
     */
    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    /**
     * 
     * @return
     *     The subName
     */
    public String getSubName() {
        return subName;
    }

    /**
     * 
     * @param subName
     *     The SubName
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * 
     * @return
     *     The totalPoint
     */
    public Integer getTotalPoint() {
        return totalPoint;
    }

    /**
     * 
     * @param totalPoint
     *     The TotalPoint
     */
    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

}
