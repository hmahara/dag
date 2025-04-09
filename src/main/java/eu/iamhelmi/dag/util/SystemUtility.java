package eu.iamhelmi.dag.util;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.InetAddress;
import java.net.UnknownHostException;

import io.quarkus.logging.Log;

public class SystemUtility {

	public static String myIp() {
		InetAddress IP;
		try {
			IP = InetAddress.getLocalHost();
			Log.info("IP of my system is := "+IP.getHostAddress());
			return IP.getHostAddress();
		} catch (UnknownHostException e) {
			Log.error("Problem when look up IP: "+e.getMessage());
			return "Unknown IP";
		}
		
	}
	
	public static Long getUptime() {
		RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
		long uptime = rb.getUptime();
		long uptimeInSecond = uptime / 1000;
		return uptimeInSecond;
	}
}
