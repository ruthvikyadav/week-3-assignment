
public class OpenDoor implements DoorCommand{
	
	private DoorDevice fd;

	public OpenDoor(DoorDevice fd) {
		super();
		this.fd = fd;
	}

	public DoorDevice getFd() {
		return fd;
	}

	public void setFd(DoorDevice fd) {
		this.fd = fd;
	}

	@Override
	public void execute() {
		 fd.Open();
		
	}

}
