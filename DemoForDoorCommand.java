
public class DemoForDoorCommand {

	public static void main(String[] args) {
	 
		DoorDevice glassDoor = new GlassDoor();
		
		OpenDoor createGlassDoor = new  OpenDoor(glassDoor);
		
		DoorAccessesControl glassDoorcontrol = new DoorAccessesControl(createGlassDoor);
		glassDoorcontrol.onclick();
		
        DoorDevice woodDoor = new WoodDoor();
		
		OpenDoor openWoodDoor = new  OpenDoor(woodDoor);
		
		DoorAccessesControl openWoodDoorcontrol = new DoorAccessesControl(openWoodDoor);
		openWoodDoorcontrol.onclick();
		
	 
		
		CloseDoor deleteWoodDoor = new CloseDoor(woodDoor);
		DoorAccessesControl deleteWoodDoorcontrol = new DoorAccessesControl(deleteWoodDoor);
		deleteWoodDoorcontrol.onclick();
		
		CloseDoor deleteMainFolder = new CloseDoor(glassDoor);
		
		DoorAccessesControl deleteMainFoldercontrol = new DoorAccessesControl(deleteMainFolder);
		deleteMainFoldercontrol.onclick();
		
		
		
	}

}
