package webapp.econnect.poSs;

public class POS {
	
	private String serialNumber;
	private String name;
	private String status;
	
	
    public POS() {
		
	}

    public POS(String serial, String name, String stats) {
		super();
		this.serialNumber = serial;
		this.name = name;
		this.status = stats;
	}
    
    
	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
