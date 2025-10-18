public class iPhone extends Phone {

  // Instance variables for the iPhone subclass 
  private double iOSUpdateNum;
  private boolean usesLightningcable;

  // No argument constructor 
  public iPhone() {
    iOSUpdateNum = 26.01;   //Default value for the iOS Update (most recent)
    usesLightningcable = false;  //Default value for using the lightning cable (again, most recent update)
  }

  
  //Parametramized Constructor for the iPhone subclass 
  public iPhone(String modelName, double Price, int yearMade, int Numcams, double iOSUpdateNum, boolean usesLightningcable) {
    super(modelName, Price, yearMade, Numcams);
    this.iOSUpdateNum = iOSUpdateNum;
    this.usesLightningcable = usesLightningcable;
  }
  // Getter Methods
  public double getiOSUpdateNum() {
    return iOSUpdateNum;
  }

  public boolean getusesLightningcable() {
    return usesLightningcable;
  }

  // Mutator methods

  public void setiOSUpdateNum(double newiOSUpdateNum) {
    iOSUpdateNum = newiOSUpdateNum;
  }

  public void setusesLightningcable(boolean newusesLightningcable) {
    usesLightningcable = newusesLightningcable; 
  }
  
  // If the user chooses iPhone as their phone's model, they will be asked these two extra questions//
  public String toString() {
    return super.toString() + "\niOS Version: "+iOSUpdateNum + "\nUses lighning cable: "+usesLightningcable;
  }
  
}