public class Car {
   
    String brand;
    String model;
    String color;
    int maxSpeed;
  
  public Car(String pBrand, String pModel, String pColor, int pMaxSpeed){
    
    this.brand = pBrand;
    this.model = pModel;
    this.color = pColor;
    this.maxSpeed = pMaxSpeed;

}
public Car(){}

public Car(String pBrand, String pModel ){
this.brand = pBrand;
this.model = pModel;
this.color = "black";
this.maxSpeed = 130;

  }


public String toString(){

return " The Car:" + " " + this.brand + " " + this.model + " " + this.color +  " " + "with Vmax : " + this.maxSpeed;
}     



}
