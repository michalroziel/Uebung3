import java.util.Scanner;

public class SpeefOfLightTestDrive {
   
    
public static void main(String[] args ){

System.out.println(" The Speed of Light is as follows : " + SpeedOfLight.getSpeedOfLight() );


    SpeedOfLight myLight = new SpeedOfLight() ;

    Scanner myScan = new Scanner(System.in);

    System.out.println(" enter the float factor");

    float factor =  myScan.nextFloat();

    float result =  (float) myLight.multiplyByFactor(factor);


    System.out.println(" the chosen factor is : " + factor );
    System.out.println( " the spped of Light multiplied by factor is : " + result);
   myScan.close();

    }


}
