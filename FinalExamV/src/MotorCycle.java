
public class MotorCycle implements VehicleInterface {
	private boolean hasSideCar;

	public MotorCycle(boolean hasSideCar) {
		this.setHasSideCar(hasSideCar);

	}

	public MotorCycle() {

	}

	@Override
	public void Vehicle() {
		
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
}