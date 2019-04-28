package krasa.visualvm;

public class PluginSettings {

	private String visualVmExecutable;
	private boolean debug;
	private String durationToSetContextToButton = "5000";
	private String delayForVisualVMStart = "5000";
	private String jdkHome;

	public String getVisualVmExecutable() {
		return visualVmExecutable;
	}

	public void setVisualVmExecutable(final String visualVmExecutable) {
		this.visualVmExecutable = visualVmExecutable;
	}

	public boolean getDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}


	public static boolean isValid(PluginSettings state) {
		return state != null && VisualVMHelper.isValidPath(state.getVisualVmExecutable());
	}

	public String getDurationToSetContextToButton() {
		return durationToSetContextToButton;
	}

	public void setDurationToSetContextToButton(final String durationToSetContextToButton) {
		this.durationToSetContextToButton = durationToSetContextToButton;
	}

	public String getDelayForVisualVMStart() {
		return delayForVisualVMStart;
	}

	public void setDelayForVisualVMStart(String delayForVisualVMStart) {
		this.delayForVisualVMStart = delayForVisualVMStart;
	}

	public long getDurationToSetContextToButtonAsLong() {
		return Long.parseLong(durationToSetContextToButton);
	}

	public long getDelayForVisualVMStartAsLong() {
		return Long.parseLong(delayForVisualVMStart);
	}


	public String getJdkHome() {
		return jdkHome;
	}

	public void setJdkHome(final String jdkHome) {
		this.jdkHome = jdkHome;
	}
}
