/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/** 
* Commands to be executed by the MAV. They can be executed on user request, or as part of a mission script. If the action is used in a mission, the parameter mapping to the waypoint/mission message is as follows: Param 1, Param 2, Param 3, Param 4, X: Param 5, Y:Param 6, Z:Param 7. This command list is similar what ARINC 424 is for commercial aircraft: A data format how to interpret waypoint/mission data. See https://mavlink.io/en/guide/xml_schema.html#MAV_CMD for information about the structure of the MAV_CMD entries
*/
public class MAV_CMD {
   public static final int MAV_CMD_NAV_WAYPOINT = 16; /* Navigate to waypoint. |Hold time. (ignored by fixed wing, time to stay at waypoint for rotary wing)| Acceptance radius (if the sphere with this radius is hit, the waypoint counts as reached)| 0 radius to pass by WP. Positive value for clockwise orbit, negative value for counter-clockwise orbit. Allows trajectory control.| Desired yaw angle at waypoint (rotary wing). NaN for unchanged.| Latitude| Longitude| Altitude|  */
   public static final int MAV_CMD_NAV_RETURN_TO_LAUNCH = 20; /* Return to launch location |Empty| Empty| Empty| Empty| Empty| Empty| Empty|  */
   public static final int MAV_CMD_NAV_TAKEOFF = 22; /* Takeoff from ground / hand |Minimum pitch (if airspeed sensor present), desired pitch without sensor| Empty| Empty| Yaw angle (if magnetometer present), ignored without magnetometer. NaN for unchanged.| Latitude| Longitude| Altitude|  */
   public static final int MAV_CMD_DO_SET_MODE = 176; /* Set system mode. |Mode| Custom mode - this is system specific, please refer to the individual autopilot specifications for details.| Custom sub mode - this is system specific, please refer to the individual autopilot specifications for details.| Empty| Empty| Empty| Empty|  */
   public static final int MAV_CMD_DO_PAUSE_CONTINUE = 193; /* If in a GPS controlled position mode, hold the current position or continue. |n command, hold current position. 1: Continue mission. A VTOL capable vehicle should enter hover mode (multicopter and VTOL planes). A plane should loiter with the default loiter radius.| Reserved| Reserved| Reserved| Reserved| Reserved| Reserved|  */
   public static final int MAV_CMD_FLIGHT_PREPARE = 225; /* Do all actions needed before flight to the charge pad. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_ONE_KEY_TO_CHARGE = 228; /* One key to charge. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_REQUEST_STATUS = 229;
   public static final int MAV_CMD_PAD_LOCK = 230; /* Charge pad lock. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_UNLOCK = 231; /* Charge pad unlock. |Empty.| Empty.| Empty.| Empty.| .| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_TURN_ON_RC = 232; /* Charge pad turn on rc. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_TURN_OFF_RC = 233; /* Charge pad turn off rc. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_CANOPY_CLOSE = 234; /* Close the canopy. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_CANOPY_OPEN = 235; /* Open the canopy. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_TURN_ON_DRONE = 236; /* Charge pad turn on drone. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_TURN_OFF_DRONE = 237; /* Charge pad turn off drone. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_TURN_ON_CHARGE = 238; /* Charge pad turn on charge. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_PAD_TURN_OFF_CHARGE = 239; /* Charge pad turn off charge. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_VIDEO_STREAMING_REQUEST = 240; /* Request video streaming from a selected video source, T3 or drone. |1:T3 camera 2ton��Drone camera.| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_SET_STORAGE_LOCATION = 241; /*  |1:SD card 2��Internal storage.| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_REQUEST_STORAGE_INFORMATION = 242; /* Request information of current storage, internal storage or SD card. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_REQUEST_STORAGE_FORMAT = 243; /* Format one storage, internal storage or SD card. |1:SD card 2��Internal storage.| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_REQUEST_CAMERA_INFORMATION = 521; /* Request camera information (CAMERA_INFORMATION). |0: No action 1: Request camera capabilities| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_REQUEST_CAMERA_SETTINGS = 522; /* Request camera settings (CAMERA_SETTINGS). |0: No Action 1: Request camera settings| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_SET_CAMERA_MODE = 530; /* Set camera running mode. Use NaN for reserved values. GCS will send a MAV_CMD_REQUEST_VIDEO_STREAM_STATUS command after a mode change if the camera supports video streaming. |Reserved (Set to 0)| Camera mode| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_SET_CAMERA_ZOOM = 531; /* Set camera zoom. Camera must respond with a CAMERA_SETTINGS message (on success). Use NaN for reserved values. |Zoom type| Zoom value. The range of valid values depend on the zoom type.| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_REQUEST_CAMERA_IMAGE_CAPTURE = 2002; /* Re-request a CAMERA_IMAGE_CAPTURE message. Use NaN for reserved values. |Empty.| Empty.| Empty.| Empty.| Empty.| Empty.| Empty.|  */
   public static final int MAV_CMD_VIDEO_START_CAPTURE = 2500; /* Starts video capture (recording). Use NaN for reserved values. |Video Stream ID (0 for all streams)| Frequency CAMERA_CAPTURE_STATUS messages should be sent while recording (0 for no messages, otherwise frequency)| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_VIDEO_STOP_CAPTURE = 2501; /* Stop the current video capture (recording). Use NaN for reserved values. |Video Stream ID (0 for all streams)| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|  */
   public static final int MAV_CMD_ENUM_END = 2502; /*  | */
}
            