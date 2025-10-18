public class Phone {

   // Instance Variables
  private String modelName;
  private double Price; 
  private int yearMade;
  private int Numcams;


  /**
   * Default constructor that initializes a Phone
   * with placeholder values.
   */
  public Phone() {
    modelName = "No name";
    Price = 0.0;
    yearMade = 0;
    Numcams = 0;
    
  }

   /* Parameterized Constructor, changes the values based on the user's input */
  public Phone(String modelName, double Price, int yearMade, int Numcams) {
    this.modelName = modelName;
    this.Price = Price;
    this.yearMade = yearMade;
    this.Numcams = Numcams;
  }

  //Accessor Methods  
  public String getmodelName() {
    return modelName;
  }

  public double getPrice() {
    return Price;
  }
  
  
  public int yearMade() {
    return yearMade;
  }
  
  
  public int Numcams() {
    return Numcams;
  }

  //Mutator Methods
  public void setmodelName(String newmodelName) {
    modelName = newmodelName;
  }

  public void setPrice(double newPrice) {
    Price = newPrice;
  }

  public void setyearMade(int newyearMade) {
    yearMade = newyearMade;
  }

  public void setNumcams(int newNumcams) {
    Numcams = newNumcams;
  }

  // The toString method, adjusts the output based on user's input to question 1. 
  public String toString() {
    if (modelName.equals("iPhone")) {
        return "Here is your iPhone's information: " + "\nModel: "+modelName + "\nYear: "+yearMade + "\nNumCams:"+Numcams; 
      } else {
        return "Here is your Andriod's information: " + "\nModel: "+modelName + "\nYear: "+yearMade + "\nNumCams:"+Numcams;
      }
    }


}
