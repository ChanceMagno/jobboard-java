public class Job {
  private  String mTitle;
  private String mDescription;
  private Boolean mStatus;


  public Job(String title, String description, Boolean status) {
    mTitle = title;
    mDescription = description;
    mStatus = status;
  }

  public String getJobTitle(){
    return mTitle;
  }

  public String getJobDescription() {
    return mDescription;
  }

  public boolean getJobStatus(){
    return mStatus;
   }
 } // END CLASS JOB
