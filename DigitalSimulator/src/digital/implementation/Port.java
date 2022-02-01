package digital.implementation;

import digital.interfaces.PortInterface;

import digital.interfaces.Value;

/** 
 * Represents a port that connects devices and nets 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone.
 *
 **/

public class Port implements PortInterface {
	
	/** 
	 * Placeholder that keeps track of is port is output or not.
	 */
	private boolean isOutputPort;
	
	/** 
	 * Placeholder for a value of a port.
	 */
	private Value value;
	
	/** 
	 * Port constructor that creates an input
	 * or an output port based on the boolean
	 * value given to it as a parameter. 
	 * Creates output if given true. 
	 * Creates input if given false. 
	 */
	public Port (boolean isOutputPort) {
		this.isOutputPort = isOutputPort;
	}
	
	/** 
	 * Figures out if port is an output port or not.
	 * @return true exactly if this is an output port
	 */
	@Override
	public boolean isOutputPort() {
		return isOutputPort;
		
	};
	
	/** 
	 * Changes the value of the port.
	 * @param v The new value
	 */
	@Override
	public void setValue(Value v) {
		value = v;
	} ;
	
	/** 
	 * Gets the current value of the port.
	 * <p> If the value has never been set, the
	 * value will be Value.UNKNOWN.
	 * @return The current value of the port.
	 */
	@Override
	public Value getValue() {
		if (value == null) {
			return Value.UNKNOWN;
		}
		else {
			return value;
		}
	} ;

}
