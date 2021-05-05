package com.Junit.hms.hotel;

import java.util.*;

public class Hotel{

    private ArrayList<Floor> floors;
    private int numberOfFloors, numberOfMainCorridors, numberOfSubCorridors;
    public Hotel(int numberOfFloors, int numberOfMainCorridors, int numberOfSubCorridors) {
    	this.numberOfFloors=numberOfFloors;
    	this.numberOfMainCorridors=numberOfMainCorridors;
    	this.numberOfSubCorridors=numberOfSubCorridors;
        floors = new ArrayList<Floor>();
        for(int floorIndex=0;floorIndex<numberOfFloors;floorIndex++) {
            floors.add(new Floor(numberOfMainCorridors, numberOfSubCorridors));
        }
    }

    public List<Floor> getFloors() {
        return floors;
    }
    public void printFloors() {
    	int n=floors.size();
    	System.out.println(n);
    	for(int floorcount=0;floorcount<n;floorcount++) {
    		System.out.println("Floor "+(floorcount+1));
    		Floor temp=floors.get(floorcount);
    		Floor temp2=floors.get(floorcount);
    		temp.printCorridors();
    		temp2.printSubCorridors();
    	}
    }

	public void movementInSubCorriodor(int floor, int subCorridor) {
		Floor fl=floors.get(floor-1);
		List<SubCorridor> sub=fl.getSubCorridors();
		SubCorridor movement=sub.get(subCorridor-1);
		movement.electronicEquipmentMap.get("Light").on=true;
		int power=fl.totalPowerConsumption();
			for(int i=0;i<sub.size()&&power>limit();i++) {
				if(i==(subCorridor-1)) {
					continue;
				}
				else {
					SubCorridor change=sub.get(i);
					change.electronicEquipmentMap.get("Ac").on=false;
				}
				power=fl.totalPowerConsumption();
			}
	}
	public int limit() {
		return numberOfMainCorridors*15+numberOfSubCorridors*10;
	}
	public void NomovementInSubCorriodor(int floor, int subCorridor) {
		Floor fl=floors.get(floor-1);
		List<SubCorridor> sub=fl.getSubCorridors();
		SubCorridor movement=sub.get(subCorridor-1);
		movement.electronicEquipmentMap.get("Light").on=false;
		int power=fl.totalPowerConsumption();
			for(int i=0;i<sub.size()&&power<limit();i++) {
				if(i==(subCorridor-1)) {
					continue;
				}
				else {
					SubCorridor change=sub.get(i);
					change.electronicEquipmentMap.get("Ac").on=true;
				}
				power=fl.totalPowerConsumption();
			}
		
	}
}