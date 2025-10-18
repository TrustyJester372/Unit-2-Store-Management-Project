public class Android extends Phone {
  //Android subclass' instance variable 
  private String updateVersion;


  // No argument constructor for the Android subclass 
  public Android() {
    updateVersion = "Android 16";
  }
  // Parameterized constructor 
  public Android(String modelName, double Price, int yearMade, int Numcams, String updateVersion) {
    super(modelName, Price, yearMade, Numcams);
    this.updateVersion = updateVersion;
  }
  // Getter Methods
  public String getupdateVersion() {
    return updateVersion;
  }
  //Mutator Methods
  public void setupdateVersion(String newupdateVersion) {
    updateVersion = newupdateVersion;
  }
  /*If the user chooses Android for their phone's model, they will be asked this additional question, 
  rather than the additional questions given if they choose iPhone as their phone model*/
  
  public String toString() {
    return super.toString() + "\nUpdate Version: "+updateVersion;
  }
}