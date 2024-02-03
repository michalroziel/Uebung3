public class ElectricCar extends Car {


    private int batteryCapacity ;

    public ElectricCar(String pBrand, String pModel, String pColor, 
    int pMaxSpeed, int pBatteryCapacity){
      
      super(pBrand, pModel, pColor, pMaxSpeed);
      this.batteryCapacity = pBatteryCapacity ;
      
      }
      
      public ElectricCar( String pBrand, String pModel ){
        
        this.brand = pBrand;
        this.model = pModel;
        this.color = "White";
        this.maxSpeed = 100;
        this.batteryCapacity = 60;
      }

      public String toString(){

        return " The Electric Car:" + " " + this.brand + " " + this.model + " " + this.color +  " " + "with Vmax : " + this.maxSpeed + "\n" ;
        } 
    
}
