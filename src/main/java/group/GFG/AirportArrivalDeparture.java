package main.java.group.GFG;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AirportArrivalDeparture {
	private static List<Integer> gateDepartures = new ArrayList<Integer>();
	
	private static PriorityQueue<Integer> gateDeparturePriorityQueue = new PriorityQueue<Integer>();
	
	public int getMinNumberOfTerminals(int[] arrivals, int[] departures){
		//iterate thro both and get the corresponding arrival and departure q value
		//once if 
		if(arrivals.length != departures.length)
			return -1;
		for( int i=0; i<arrivals.length; i++){
			//System.out.println("i="+i+", "+gateDepartures);
			if(i==0)
				gateDepartures.add(departures[i]);
			else{
				int counter = 0;
				boolean toReplace = false;
				//check if the new arrival time is greater than all the departure times
				for(Integer iter : gateDepartures){
					if(arrivals[i] > iter){
						//mark a flag - to replace and position and value
						//gateDepartures.add(counter,departures[i]);
						toReplace = true;
						//pos = counter;
						//toReplaceValue = departures[i];
						break;
					}
					counter++;
					
				}
				if(toReplace)
					gateDepartures.set(counter,departures[i]);
				else if(counter == gateDepartures.size())
					gateDepartures.add(departures[i]);
			}
		}
		//System.out.println(gateDepartures);
		return gateDepartures.size();
	}
	
	
	public int getMinNumberOfTerminalsPQ(int[] arrivals, int[] departures){
		//iterate thro both and get the corresponding arrival and departure q value
		//once if 
		if(arrivals.length != departures.length)
			return -1;
		for( int i=0; i<arrivals.length; i++){
			System.out.println("i="+i+", "+gateDeparturePriorityQueue);
			if(i==0)
				gateDeparturePriorityQueue.add(departures[i]);
			else{
				int peek = gateDeparturePriorityQueue.peek();
					if(arrivals[i] < peek){
						gateDeparturePriorityQueue.add(departures[i]);
					}
					else{
						if(!gateDeparturePriorityQueue.isEmpty())
							gateDeparturePriorityQueue.remove();
						gateDeparturePriorityQueue.add(departures[i]);
					}
				
			}
		}
		System.out.println(gateDeparturePriorityQueue);
		return gateDeparturePriorityQueue.size();
	}
	
	public static void main(String[] args){
		int[] arrQ = {900, 940, 1000, 1030,1500,1800};
		int[] depQ = {1910,2300,1020, 1130,1900, 2000};
		//int[] arrQ = {900, 940, 950, 1100,1500,1800};
		//int[] depQ = {910,1200,1120, 1130,1900, 2000};
		System.out.println(new AirportArrivalDeparture().getMinNumberOfTerminals(arrQ, depQ));
		System.out.println(new AirportArrivalDeparture().getMinNumberOfTerminalsPQ(arrQ, depQ));
	}
}
