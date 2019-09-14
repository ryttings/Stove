public class Burner {
	public enum Temperature {BLAZING, HOT, WARM, COLD};
	public final static int TIME_DURATION = 2;
	private Temperature myTemperature;
	private int timer;
	private Setting mySetting;
	
	public Burner() {
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}
	
	public void plusButton() {
		switch (this.mySetting) {
		case OFF:
			this.mySetting = Setting.LOW;
			this.timer = 0;
			break;
		case LOW:
			this.mySetting = Setting.MEDIUM;
			this.timer = TIME_DURATION;
			break;
		case MEDIUM:
			this.mySetting = Setting.HIGH;
			this.timer = TIME_DURATION;
			break;
		case HIGH:
			this.mySetting = Setting.HIGH;
			this.timer = TIME_DURATION;
			break;
		default:
			this.mySetting = Setting.OFF;
			this.timer = 0;
			break;
		}
	}
	
	public void minusButton() {
		switch(this.mySetting) {
		case OFF:
			this.mySetting = Setting.OFF;
			this.timer = 0;
			break;
		case LOW:
			this.mySetting = Setting.OFF;
			this.timer = TIME_DURATION;
			break;
		case MEDIUM:
			this.mySetting = Setting.LOW;
			this.timer = TIME_DURATION;
			break;
		case HIGH:
			this.mySetting = Setting.MEDIUM;
			this.timer = TIME_DURATION;
			break;
		default:
			this.mySetting = Setting.OFF;
			break;
		}
	}
	
	public void updateTemperature() {
		if (this.timer > 0) {
			this.timer--;
		}else {
			
		}
	}
}
