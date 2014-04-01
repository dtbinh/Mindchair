package nxt;

public class ObstructionController extends Thread implements
		LightSensorListener, UltraSonicSensorListener {

	private int current_distance = 255;
	private int sensor_value_left = 0;
	private int sensor_value_right = 0;

	private final int SAFE_DISTANCE = 20;
	private final int ARC_DEGREES = 180;

	private final int LIGHT_HIGH = 70;
	private final int LIGHT_LOW = 30;

	public ObstructionController(ColorSensor cs, LightSensor ls,
			UltraSonicSensor us) {

		cs.addListener(this);
		ls.addListener(this);
		us.addListener(this);

	}

	public void run() {
		while (true) {
			MotorController.driveForward();
			if (current_distance < SAFE_DISTANCE) {
				evasiveManoeuvre();
			}
		}
	}

	private void evasiveManoeuvre() {

		MotorController.driveForward();

		while (true) {

			if (current_distance < SAFE_DISTANCE) {

				MotorController.rotate(-90);
				MotorController.arc((SAFE_DISTANCE * 10), ARC_DEGREES, true); // RADIUS
																				// ,
																				// ANGLE

				while (MotorController.isMoving()) {

					if (sensor_value_left < LIGHT_LOW
							|| sensor_value_right < LIGHT_LOW)
						MotorController.stop();

				}

				break;

			}

		}

	}

	@Override
	public void ultraSonicChanged(UpdatingSensor us, float oldValue,
			float newValue) {

		current_distance = (int) newValue;
	}

	@Override
	public void lightSensorChanged(Position position,
			UpdatingSensor updatingsensor, float oldValue, float newValue) {

		if (position == Position.Left)
			sensor_value_left = (int) newValue;
		else if (position == Position.Right)
			sensor_value_right = (int) newValue;

	}
}