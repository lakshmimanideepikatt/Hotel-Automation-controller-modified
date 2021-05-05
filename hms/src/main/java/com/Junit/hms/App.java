package com.Junit.hms;
import com.Junit.hms.hotel.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of floors");
        int noOfFloors=sc.nextInt();
        System.out.println("Enter no of Main Corridors");
        int noOfMainCorridors=sc.nextInt();
        System.out.println("Enter no of SubCorridors");
        int noOfSubCorridors=sc.nextInt();
        Hotel temp=new Hotel(noOfFloors,noOfMainCorridors,noOfSubCorridors);
        temp.printFloors();
        while(true) {
        System.out.println("Sub corridor 1)movement 2)Nomovement in 1 minute 3)exit");
        int action=sc.nextInt();
        	if(action==1) {
        		System.out.println("Enter floor number");
        		int floor=sc.nextInt();
        		System.out.println("Enter subcorridor number");
        		int subCorridor=sc.nextInt();
        		temp.movementInSubCorriodor(floor,subCorridor);
        		temp.printFloors();
        	}
        	else if(action==2) {
        		System.out.println("Enter floor number");
        		int floor=sc.nextInt();
        		System.out.println("Enter subcorridor number");
        		int subCorridor=sc.nextInt();
        		temp.NomovementInSubCorriodor(floor,subCorridor);
        		temp.printFloors();
        	}
        	else {
        		break;
        	}
        }
    }
}
