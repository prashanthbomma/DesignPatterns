package state_example_two;

import com.sun.javafx.image.impl.IntArgb;
import com.sun.org.apache.bcel.internal.generic.I2B;

public class Driving implements TravelMode {

	@Override
	public Object getETA() {
		System.out.println("Calculating ETA for Driving ");
		return 1;
	}

	@Override
	public Object getDirections() {
		System.out.println("Calculating Directions for Driving");
		return 2;
		
	}

}
