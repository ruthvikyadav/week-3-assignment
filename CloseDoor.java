
public class CloseDoor implements DoorCommand{
	
	private DoorDevice fd;

	public CloseDoor(DoorDevice fd) {
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
		 fd.close();
		
	}

}
