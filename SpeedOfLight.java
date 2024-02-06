import java.text.DecimalFormat;

public class SpeedOfLight {
   
private static final long  SPEED_OF_LIGHT = 299792458L; // in m/s.



public static long getSpeedOfLight() {
    return SPEED_OF_LIGHT;
}


public double multiplyByFactor(double factor){

    return SPEED_OF_LIGHT * factor ;

}






 public double printFraction(double factor  ) {


    double result = multiplyByFactor(factor);


    DecimalFormat format = new DecimalFormat("#,###.##");

    String  strNum =  format.format(result);
    
    System.out.println(" the formatted speed is : " + strNum);


        return result; 



 }




}
