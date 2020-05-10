package toombs.animaltracker.wrappers.infoClasses;

import java.util.GregorianCalendar;

public class LogInfo extends GenericInfo{
    /**
     * The message that is being saved.
     * Example:
     *      'found blood in stool, gave bath and will continue to monitor.'
     */
    private String logMsg;

    /**
     *
     * @param infoDate the date corresponding to the message
     * @param logMsg the message being saved
     */
    public LogInfo(GregorianCalendar infoDate, String logMsg){
        super(infoDate);
        this.logMsg = logMsg;
    }

    /**
     *
     * @return the logged message
     */
    public String getLogMsg() {
        return logMsg;
    }

    /**
     *
     * @param logMsg the new message
     * NOTE: should only be called if the user is updating the corresponding information.
     */
    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }
}
