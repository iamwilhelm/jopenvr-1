package jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRApplications_FnTable extends Structure {
	/** C type : AddApplicationManifest_callback* */
	public VR_IVRApplications_FnTable.AddApplicationManifest_callback AddApplicationManifest;
	/** C type : RemoveApplicationManifest_callback* */
	public VR_IVRApplications_FnTable.RemoveApplicationManifest_callback RemoveApplicationManifest;
	/** C type : IsApplicationInstalled_callback* */
	public VR_IVRApplications_FnTable.IsApplicationInstalled_callback IsApplicationInstalled;
	/** C type : GetApplicationCount_callback* */
	public VR_IVRApplications_FnTable.GetApplicationCount_callback GetApplicationCount;
	/** C type : GetApplicationKeyByIndex_callback* */
	public VR_IVRApplications_FnTable.GetApplicationKeyByIndex_callback GetApplicationKeyByIndex;
	/** C type : GetApplicationKeyByProcessId_callback* */
	public VR_IVRApplications_FnTable.GetApplicationKeyByProcessId_callback GetApplicationKeyByProcessId;
	/** C type : LaunchApplication_callback* */
	public VR_IVRApplications_FnTable.LaunchApplication_callback LaunchApplication;
	/** C type : LaunchDashboardOverlay_callback* */
	public VR_IVRApplications_FnTable.LaunchDashboardOverlay_callback LaunchDashboardOverlay;
	/** C type : CancelApplicationLaunch_callback* */
	public VR_IVRApplications_FnTable.CancelApplicationLaunch_callback CancelApplicationLaunch;
	/** C type : IdentifyApplication_callback* */
	public VR_IVRApplications_FnTable.IdentifyApplication_callback IdentifyApplication;
	/** C type : GetApplicationProcessId_callback* */
	public VR_IVRApplications_FnTable.GetApplicationProcessId_callback GetApplicationProcessId;
	/** C type : GetApplicationsErrorNameFromEnum_callback* */
	public VR_IVRApplications_FnTable.GetApplicationsErrorNameFromEnum_callback GetApplicationsErrorNameFromEnum;
	/** C type : GetApplicationPropertyString_callback* */
	public VR_IVRApplications_FnTable.GetApplicationPropertyString_callback GetApplicationPropertyString;
	/** C type : GetApplicationPropertyBool_callback* */
	public VR_IVRApplications_FnTable.GetApplicationPropertyBool_callback GetApplicationPropertyBool;
	/** C type : GetApplicationPropertyUint64_callback* */
	public VR_IVRApplications_FnTable.GetApplicationPropertyUint64_callback GetApplicationPropertyUint64;
	/** C type : SetApplicationAutoLaunch_callback* */
	public VR_IVRApplications_FnTable.SetApplicationAutoLaunch_callback SetApplicationAutoLaunch;
	/** C type : GetApplicationAutoLaunch_callback* */
	public VR_IVRApplications_FnTable.GetApplicationAutoLaunch_callback GetApplicationAutoLaunch;
	/** C type : GetStartingApplication_callback* */
	public VR_IVRApplications_FnTable.GetStartingApplication_callback GetStartingApplication;
	/** C type : GetTransitionState_callback* */
	public VR_IVRApplications_FnTable.GetTransitionState_callback GetTransitionState;
	/** C type : PerformApplicationPrelaunchCheck_callback* */
	public VR_IVRApplications_FnTable.PerformApplicationPrelaunchCheck_callback PerformApplicationPrelaunchCheck;
	/** C type : GetApplicationsTransitionStateNameFromEnum_callback* */
	public VR_IVRApplications_FnTable.GetApplicationsTransitionStateNameFromEnum_callback GetApplicationsTransitionStateNameFromEnum;
	/** C type : IsQuitUserPromptRequested_callback* */
	public VR_IVRApplications_FnTable.IsQuitUserPromptRequested_callback IsQuitUserPromptRequested;
	public interface AddApplicationManifest_callback extends Callback {
		int apply(Pointer pchApplicationManifestFullPath, byte bTemporary);
	};
	public interface RemoveApplicationManifest_callback extends Callback {
		int apply(Pointer pchApplicationManifestFullPath);
	};
	public interface IsApplicationInstalled_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	public interface GetApplicationCount_callback extends Callback {
		int apply();
	};
	public interface GetApplicationKeyByIndex_callback extends Callback {
		int apply(int unApplicationIndex, Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	public interface GetApplicationKeyByProcessId_callback extends Callback {
		int apply(int unProcessId, Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	public interface LaunchApplication_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	public interface LaunchDashboardOverlay_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	public interface CancelApplicationLaunch_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	public interface IdentifyApplication_callback extends Callback {
		int apply(int unProcessId, Pointer pchAppKey);
	};
	public interface GetApplicationProcessId_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	public interface GetApplicationsErrorNameFromEnum_callback extends Callback {
		Pointer apply(int error);
	};
	public interface GetApplicationPropertyString_callback extends Callback {
		int apply(Pointer pchAppKey, int eProperty, Pointer pchPropertyValueBuffer, int unPropertyValueBufferLen, IntByReference peError);
	};
	public interface GetApplicationPropertyBool_callback extends Callback {
		byte apply(Pointer pchAppKey, int eProperty, IntByReference peError);
	};
	public interface GetApplicationPropertyUint64_callback extends Callback {
		long apply(Pointer pchAppKey, int eProperty, IntByReference peError);
	};
	public interface SetApplicationAutoLaunch_callback extends Callback {
		int apply(Pointer pchAppKey, byte bAutoLaunch);
	};
	public interface GetApplicationAutoLaunch_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	public interface GetStartingApplication_callback extends Callback {
		int apply(Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	public interface GetTransitionState_callback extends Callback {
		int apply();
	};
	public interface PerformApplicationPrelaunchCheck_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	public interface GetApplicationsTransitionStateNameFromEnum_callback extends Callback {
		Pointer apply(int state);
	};
	public interface IsQuitUserPromptRequested_callback extends Callback {
		byte apply();
	};
	public VR_IVRApplications_FnTable() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("AddApplicationManifest", "RemoveApplicationManifest", "IsApplicationInstalled", "GetApplicationCount", "GetApplicationKeyByIndex", "GetApplicationKeyByProcessId", "LaunchApplication", "LaunchDashboardOverlay", "CancelApplicationLaunch", "IdentifyApplication", "GetApplicationProcessId", "GetApplicationsErrorNameFromEnum", "GetApplicationPropertyString", "GetApplicationPropertyBool", "GetApplicationPropertyUint64", "SetApplicationAutoLaunch", "GetApplicationAutoLaunch", "GetStartingApplication", "GetTransitionState", "PerformApplicationPrelaunchCheck", "GetApplicationsTransitionStateNameFromEnum", "IsQuitUserPromptRequested");
	}
	public VR_IVRApplications_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRApplications_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRApplications_FnTable implements Structure.ByValue {
		
	};
}
