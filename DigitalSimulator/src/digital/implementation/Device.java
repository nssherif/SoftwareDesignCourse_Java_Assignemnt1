package digital.implementation;

import java.util.ArrayList;
import java.util.List;

import digital.interfaces.DeviceInterface;
import digital.interfaces.PortInterface;
import digital.interfaces.Value;
import util.Assert;

/**
 * Represents a device. A device could be of 5 different types outline in assignment documentation.
 * A device can be (InputDevice, NotGate, OrGate, AndGate, or a DFlipFlip)
 */
public abstract class Device implements DeviceInterface{
	
//	/** The name of this device
//	 */
//	private String deviceName;
//	
//	/** Every device is connected to a set of ports.
//	 * At most one of these can be an output port.
//	 * 
//	 * Credits to Theodore Norvell as this code was taken from him.
//	 */
//	private List<PortInterface> ports = new ArrayList<PortInterface>() ;
//	
//	private boolean updated;
//	
//	/** outputPortindex indicates which port, if any, is the output port.
//	 * A value of -1 indicates that there is no connected output port.
//	* It is an invariant that there are 0 or 1 output ports.
//	* <p>Class Invariant: <code>outputPortIndex == -1 or
//	*                           (0 <= outputPortIndex
//	*                            and outputPortIndex < ports.size())</code>
//	* 
//	* Credits to Theodore Norvell as this code was taken from him.                          
//	*/
//	private int outputPortIndex = -1 ;
//	
//	private boolean outputDeviceValue;
//	
//	/**  
//	 * Device constructor: Creates a device with the given name and, initially, connected to no ports.
//	 * @param name The name of the device.
//	 * 
//	 * Credits to Theodore Norvell as this code was taken from him.
//	 */
//	Device (String name){
//		deviceName = name; 
//	}
//	
//	/** Gets the name of this device 
//	 * 
//	 * return device name
//	 * */
//	@Override
//	public String getName() {
//		return deviceName;
//	};
//	
//	/** How many ports does this device have 
//	 * 
//	 * return number of ports
//	 * */
//	@Override
//	public int numberOfPorts() {
//		return ports.size();
//	};
//	
//	/** Get the given port.
//	 * <p>Precondition: 0 <= portNumber < numberOfPorts() 
//	 * @param portNumber
//	 * @return The port
//	 */
//	@Override
//	public PortInterface getPort( int portNumber ) {
//		Assert.check(portNumber>=0 && portNumber<ports.size(), "Precondition not met: Port Number is not greater than or equal 0 or less than number of ports ");
//		return ports.get(portNumber) ;
//	};
//	
//	/** Update the output in response to asynchronous changes to
//	 * its inputs.
//	 * 
//	 * @return True if the call results in a change to the value of any output port.
//	 * Otherwise, if no output ports change value, false. 
//	 */
//	@Override
//	public boolean update() {
////		for (int i=0; i < ports.size(); ++i) {
////			if (ports.get(i).isOutputPort()) {
////				Value newOutputPort = ports.get(i).getValue();
////			}
////			
////		}
//		
//		return true;
//	};
//	
//	/** Update the output in response to a clock edge.
//	 * 
//	 */
//	@Override
//	public void clock() {
////		for (PortInterface port : ports) {
////			if (port.isOutputPort()){
////				Value portValue = port.getValue();
////				port.setValue(portValue); //toDO: Figure out how to change portValue here instead of sending portValue
////			}
////		}
//	};
//	
//	/** Adds a port to a device
//	 * 
//	 * @param p: which is a PortInterface
//	 */
//	public void addPort( PortInterface p ) {
//		Assert.check( outputPortIndex == -1 || ! p.isOutputPort(),
//				"Net "+ deviceName+" already has an output port." ) ;
//		if( p.isOutputPort() ) outputPortIndex = ports.size() ;
//		ports.add( p ) ;
//	};

}
