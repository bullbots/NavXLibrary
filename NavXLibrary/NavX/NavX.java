package NavX;

import src.com.kauailabs.nav6.frc.IMUAdvanced;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class NavX
{
	SerialPort serial_port;
	IMUAdvanced imu;
	public NavX()
	{
		try
		{
	    	serial_port = new SerialPort(57600,SerialPort.Port.kMXP);
			
			// You can add a second parameter to modify the 
			// update rate (in hz) from 4 to 100.  The default is 100.
			// If you need to minimize CPU load, you can set it to a
			// lower value, as shown here, depending upon your needs.
			
			// You can also use the IMUAdvanced class for advanced
			// features.
			
			byte update_rate_hz = 50;
			//imu = new IMU(serial_port,update_rate_hz);
			imu = new IMUAdvanced(serial_port,update_rate_hz);
	    } 
		catch( Exception ex )
		{
	    		
		}
	}
}
