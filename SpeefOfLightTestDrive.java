import java.util.Scanner;

public class SpeefOfLightTestDrive {
   
    
public static void main(String[] args ){

System.out.println(" The Speed of Light is as follows : " + SpeedOfLight.getSpeedOfLight() );


    SpeedOfLight myLight = new SpeedOfLight() ;

    Scanner myScan = new Scanner(System.in);

    System.out.println(" enter the float factor");

    float factor =  myScan.nextFloat();

    double result = myLight.multiplyByFactor(factor);


    System.out.println(" the chosen factor is : " + factor );
    System.out.println( " the speed of Light multiplied by factor is : " + result);

   myLight.printFraction(factor) ;


    myScan.close();

    }


}
