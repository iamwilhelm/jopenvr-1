package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraVideoStreamFrame_t extends Structure {
	/**
	 * @see ECameraVideoStreamFormat<br>
	 * C type : ECameraVideoStreamFormat
	 */
	public int m_nStreamFormat;
	public int m_nWidth;
	public int m_nHeight;
	public int m_nImageDataSize;
	public int m_nFrameSequence;
	public int m_nISPFrameTimeStamp;
	public int m_nISPReferenceTimeStamp;
	public int m_nSyncCounter;
	public int m_nCamSyncEvents;
	public int m_nExposureTime;
	public int m_nBufferIndex;
	public int m_nBufferCount;
	public double m_flFrameElapsedTime;
	public double m_flFrameCaptureTime;
	public long m_nFrameCaptureTicks;
	public byte m_bPoseIsValid;
	/** C type : HmdMatrix34_t */
	public HmdMatrix34_t m_matDeviceToAbsoluteTracking;
	/**
	 * float[4]<br>
	 * C type : float[4]
	 */
	public float[] m_Pad = new float[4];
	/**
	 * void *<br>
	 * C type : void*
	 */
	public Pointer m_pImageData;
	public CameraVideoStreamFrame_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("m_nStreamFormat", "m_nWidth", "m_nHeight", "m_nImageDataSize", "m_nFrameSequence", "m_nISPFrameTimeStamp", "m_nISPReferenceTimeStamp", "m_nSyncCounter", "m_nCamSyncEvents", "m_nExposureTime", "m_nBufferIndex", "m_nBufferCount", "m_flFrameElapsedTime", "m_flFrameCaptureTime", "m_nFrameCaptureTicks", "m_bPoseIsValid", "m_matDeviceToAbsoluteTracking", "m_Pad", "m_pImageData");
	}
	public CameraVideoStreamFrame_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CameraVideoStreamFrame_t implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraVideoStreamFrame_t implements Structure.ByValue {
		
	};
}
