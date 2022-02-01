package digital.implementation;

import digital.interfaces.PortInterface;

import digital.interfaces.Value;

/**  
 * Represents an AndGate device that has one output 
 * and 2 input ports.
 * Updates values of output based on truth table for NotGate.
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/
public class AndGate extends TwoInputDevice {
	
	/** 
	 * Constructor for a AndGate, inherits
	 * functionality from abstract class. 
	 * Creates a new AndGate with a name and 
	 * 2 input ports and  1 output port. 
	 */
	public AndGate(String deviceName) {
		super(deviceName);
	}
	
	/** 
	 * Updates the output based on the 
	 * truth table of an And Gate.
	 */
	@Override
	public boolean update() {
		PortInterface inputPort2 = this.getPorts().get(2);
		PortInterface inputPort1 = this.getPorts().get(1);
		PortInterface outputPort = this.getPorts().get(0);
		
		Value inputValue1 = inputPort1.getValue();
		Value inputValue2 = inputPort2.getValue();
		
		if (inputValue1 == Value.FALSE || inputValue2 == Value.FALSE) {
			outputPort.setValue(Value.FALSE);
			return outputChanged(inputValue1, inputValue2);
		}
		else {
			if (inputValue1 == Value.UNKNOWN || inputValue2 == Value.UNKNOWN) {
				outputPort.setValue(Value.UNKNOWN);
				return outputChanged(inputValue1, inputValue2);
			}
			else {
				outputPort.setValue(Value.TRUE);
				return outputChanged(inputValue1, inputValue2);
			}
		}
	}
}
