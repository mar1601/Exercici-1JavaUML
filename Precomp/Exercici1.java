public class Exercici1 {

	public static void main(String[] args) {

		Maserati quattroporte = new Maserati();

		quattroporte.setColor("RED");
		quattroporte.setMaxSpeed(329);

		quattroporte.setDesigner("Ken Okuyama");
		quattroporte.setProduction("2003/2012");

		quattroporte.overviewInfo();
		quattroporte.carInfo();
		quattroporte.maseratiStartDemo();


        Seat leon = new Seat();

        leon.setColor("WHITE");
        leon.setMaxSpeed(200);

        leon.setDistributor("SEAT Lesseps, Motor Letamendi Motor");

        leon.overviewInfo();
        leon.carInfo();
        leon.seatStopDemo();

	}

}

// Clase pare per definir les propietats i métodes génerics de tots els tipus de cotxes
class Car {

	// PROPIETATS
	private String color;
	private int maxSpeed;

	// MÉTODES
	// Métode per obtenir el color d'un cotxe
	public String getColor() {
		return color;
	}

	// Métode per definir el color d'un cotxe
	public void setColor(String color) {
		this.color = color;
	}

	// Métode per obtenir la velocitat màxima d'un cotxe
	public int getMaxSpeed() {
		return maxSpeed;
	}

	// Métode per definir la velocitat màxima d'un cotxe
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	// Métode que imprimeix per pantalla la informació del cotxe
	public void carInfo() {
		System.out.println("Car Info: Car Color = " + color + " Max Speed = " + maxSpeed);
	}

}

class Maserati extends Car {
	
	// PROPIETATS
	private String designer;
	private String production;

	// MÉTODES
	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public void overviewInfo() {
		System.out.println("Overview: Designer = " + designer + " Production = " + production);
	}

	public void maseratiStartDemo() {
        Engine maseratiEngine = new Engine();
        maseratiEngine.start();
        maseratiEngine.engineInfo();
    }

}

class Seat extends Car {
	
	// PROPIETATS
	private String distributor;

	// MÉTODES
	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public void overviewInfo() {
		System.out.println("Overview: Designer = " + distributor);
	}

	public void seatStopDemo() {
        Engine leonEngine = new Engine();
        leonEngine.stop();
        leonEngine.engineInfo();
    }

}

class Engine {
	
	// PROPIETATS
	private Boolean isStarted;

	// MÉTODES
	public void start() {
		isStarted = true;
	}

	public void stop() {
		isStarted = false;
	}

	public void engineInfo() {

		if (isStarted == true) {
			System.out.println("Started: engine start");
			System.out.println("Stopped:");
		} else {
			System.out.println("Started:");
			System.out.println("Stopped: engine stop");
		}
		
	}

}