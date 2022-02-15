/**
 * 
 */
package com.tae.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author chant
 *
 */
public class App implements GenericComponent {
	private static final String myobjectSensor = null;
	private String model;
	private Roomba myRoomba;
	private User myUser;
	private Sensor mySensors;
	private ObjectSensor myobjectSensors;
	private CliffSensor mycliffSensors;
	private WallSensor mywallSensors;
	
	public App() {
		myRoomba = new Roomba();
		myUser = new User();
		mySensors = new Sensor();
		myobjectSensors= new ObjectSensor();
		mycliffSensors= new CliffSensor();
		mywallSensors = new WallSensor();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Roomba";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, mySensors, myRoomba, mycliffSensors, myobjectSensors, mywallSensors); // add all your sub components
		return internalComponents;
	}

}
