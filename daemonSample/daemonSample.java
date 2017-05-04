package daemonSample;

import org.apache.commons.daemon.Daemon;        //Apache Commons Daemon
import org.apache.commons.daemon.DaemonContext; //Apache Commons Daemon
import org.apache.commons.daemon.DaemonInitException;   //Apache Commons Daemon

public class daemonSample implements Daemon{

	private Thread thread;
	private boolean stopped = false;

	@Override
	public void start() throws Exception{
		thread.start();
	}

	@Override
	public void stop() throws Exception{
		stopped = true;
	}

	@Override
	public void destroy(){
		thread = null;
	}

	@Override
	public void init(DaemonContext daemonContext) throws DaemonInitException, InterruptedException, Exception {

		int count = 0;
		while(!stopped){
			try{
				Thread.sleep(1000);
				System.out.println(count);
				count ++;

			}catch(Exception e){
			}
		}

	}
}
