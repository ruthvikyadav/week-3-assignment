
public class DoorAccessesControl {
	
	private DoorCommand fcmd;

	public DoorAccessesControl(DoorCommand foldercmd) {
		fcmd = foldercmd;
	}

	public DoorCommand getFcmd() {
		return fcmd;
	}

	public void setFcmd(DoorCommand fcmd) {
		this.fcmd = fcmd;
	}

	
	public void onclick() {
		fcmd.execute();
	}
	
	
}
