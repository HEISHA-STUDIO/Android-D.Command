/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CAMERA_INFORMATION PACKING
package com.MAVLink.DLink;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* Information about a camera
*/
public class msg_camera_information extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_CAMERA_INFORMATION = 159;
    public static final int MAVLINK_MSG_LENGTH = 235;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CAMERA_INFORMATION;


      
    /**
    * Timestamp (time since system boot).
    */
    public long time_boot_ms;
      
    /**
    * Version of the camera firmware (v << 24 & 0xff = Dev, v << 16 & 0xff = Patch, v << 8 & 0xff = Minor, v & 0xff = Major)
    */
    public long firmware_version;
      
    /**
    * Focal length
    */
    public float focal_length;
      
    /**
    * Image sensor size horizontal
    */
    public float sensor_size_h;
      
    /**
    * Image sensor size vertical
    */
    public float sensor_size_v;
      
    /**
    * Bitmap of camera capability flags.
    */
    public long flags;
      
    /**
    * Horizontal image resolution
    */
    public int resolution_h;
      
    /**
    * Vertical image resolution
    */
    public int resolution_v;
      
    /**
    * Camera definition version (iteration)
    */
    public int cam_definition_version;
      
    /**
    * Name of the camera vendor
    */
    public short vendor_name[] = new short[32];
      
    /**
    * Name of the camera model
    */
    public short model_name[] = new short[32];
      
    /**
    * Reserved for a lens ID
    */
    public short lens_id;
      
    /**
    * Camera definition URI (if any, otherwise only basic functions will be available). HTTP- (http://) and MAVLink FTP- (mavlinkftp://) formatted URIs are allowed (and both must be supported by any GCS that implements the Camera Protocol).
    */
    public byte cam_definition_uri[] = new byte[140];
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 1;
        packet.compid = 1;
        packet.msgid = MAVLINK_MSG_ID_CAMERA_INFORMATION;
              
        packet.payload.putUnsignedInt(time_boot_ms);
              
        packet.payload.putUnsignedInt(firmware_version);
              
        packet.payload.putFloat(focal_length);
              
        packet.payload.putFloat(sensor_size_h);
              
        packet.payload.putFloat(sensor_size_v);
              
        packet.payload.putUnsignedInt(flags);
              
        packet.payload.putUnsignedShort(resolution_h);
              
        packet.payload.putUnsignedShort(resolution_v);
              
        packet.payload.putUnsignedShort(cam_definition_version);
              
        
        for (int i = 0; i < vendor_name.length; i++) {
            packet.payload.putUnsignedByte(vendor_name[i]);
        }
                    
              
        
        for (int i = 0; i < model_name.length; i++) {
            packet.payload.putUnsignedByte(model_name[i]);
        }
                    
              
        packet.payload.putUnsignedByte(lens_id);
              
        
        for (int i = 0; i < cam_definition_uri.length; i++) {
            packet.payload.putByte(cam_definition_uri[i]);
        }
                    
        
        return packet;
    }

    /**
    * Decode a camera_information message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_boot_ms = payload.getUnsignedInt();
              
        this.firmware_version = payload.getUnsignedInt();
              
        this.focal_length = payload.getFloat();
              
        this.sensor_size_h = payload.getFloat();
              
        this.sensor_size_v = payload.getFloat();
              
        this.flags = payload.getUnsignedInt();
              
        this.resolution_h = payload.getUnsignedShort();
              
        this.resolution_v = payload.getUnsignedShort();
              
        this.cam_definition_version = payload.getUnsignedShort();
              
         
        for (int i = 0; i < this.vendor_name.length; i++) {
            this.vendor_name[i] = payload.getUnsignedByte();
        }
                
              
         
        for (int i = 0; i < this.model_name.length; i++) {
            this.model_name[i] = payload.getUnsignedByte();
        }
                
              
        this.lens_id = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.cam_definition_uri.length; i++) {
            this.cam_definition_uri[i] = payload.getByte();
        }
                
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_camera_information(){
        msgid = MAVLINK_MSG_ID_CAMERA_INFORMATION;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_camera_information(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_CAMERA_INFORMATION;
        unpack(mavLinkPacket.payload);        
    }

                             
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setCam_Definition_Uri(String str) {
        int len = Math.min(str.length(), 140);
        for (int i=0; i<len; i++) {
            cam_definition_uri[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<140; i++) {            // padding for the rest of the buffer
            cam_definition_uri[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getCam_Definition_Uri() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 140; i++) {
            if (cam_definition_uri[i] != 0)
                buf.append((char) cam_definition_uri[i]);
            else
                break;
        }
        return buf.toString();

    }
                         
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_CAMERA_INFORMATION - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" firmware_version:"+firmware_version+" focal_length:"+focal_length+" sensor_size_h:"+sensor_size_h+" sensor_size_v:"+sensor_size_v+" flags:"+flags+" resolution_h:"+resolution_h+" resolution_v:"+resolution_v+" cam_definition_version:"+cam_definition_version+" vendor_name:"+vendor_name+" model_name:"+model_name+" lens_id:"+lens_id+" cam_definition_uri:"+cam_definition_uri+"";
    }
}
        