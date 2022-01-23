package digital.implementation;

import java.util.ArrayList;
import java.util.List;

import digital.interfaces.InputDeviceInterface;
import digital.interfaces.PortInterface;
import digital.interfaces.Value;
import util.Assert;

/** ToBeDone 
 * 
 * @author Negib Sherif
 *
 **/

public class InputDevice implements InputDeviceInterface{
	
	/** 
	 * Number of ports of input device which is always 1 output port and no input ports.
	 */
	private final int numOfPorts = 1;
	
	/** 
	 * Placeholder for the only port of the device
	 */
	private PortInterface port;
	
	/** 
	 * Hold the values given by the user when they call setInputSequence method
	 */
	private Value[] values;
	
	/** 
	 * Variable clock that keeps track of the clock iteration.
	 */
	int clock = 0;
	
	/** 
	 * The name of this device
	 */
	private String deviceName;
	
	
	InputDevice(String deviceName, boolean isOutputPort) {
		this.deviceName = deviceName;
		port = new Port(isOutputPort);
	}
	
	/** Gets the name of this device 
	 * 
	 * return device name
	 * */
	@Override
	public String getName() {
		return deviceName;
	};
	
	/** How many ports does this device have 
	 * 
	 * return number of ports
	 * */
	@Override
	public int numberOfPorts() {
		return numOfPorts;
		
	};
	
	/** Get the given port.
	 * <p>Precondition: 0 <= portNumber < numberOfPorts() 
	 * @param portNumber
	 * @return The port
	 */
	@Override
	public PortInterface getPort( int portNumber ) {
		Assert.check(portNumber>=0 && portNumber< numOfPorts, "Precondition not met: Port Number is not greater than or equal 0 or less than number of ports ");
		return port;
	};
	
	/** 
	 * Updates the output in response to a clock edge
	 */
	@Override
	public void clock() {
		if (clock < values.length) {
			port.setValue(values[clock]);
			clock+=1;
		}
		else {
			port.setValue(Value.UNKNOWN);
		}
	};
	
	/** Update the output in response to asynchronous changes to
	 * its inputs.
	 * 
	 * @return True if the call results in a change to the value of any output port.
	 * Otherwise, if no output ports change value, false. 
	 */
	@Override
	public boolean update() {
		boolean changed = true;
		for (int i=1; i<values.length; ++i) {
			if (values[i] != values[i-1]) {
				changed = false;
			}
		}
		return changed ;
	};
	
	
	/** 
	 * Gets input sequence from parameter and stores it in a local variable
	 * 
	 * @param Values
	 */
	@Override
	public void setInputSequence( Value[] values ) {
		this.values = values;
	} ;

}
