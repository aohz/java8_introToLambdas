/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3.defaultmethods;

/**
 * 
 * @author aohz
 *
 */
@FunctionalInterface
public interface Loggable {

    //Always final and static
    final static StringBuffer LOG = new StringBuffer();
    final boolean debugEnabled = true;
    boolean infoEnabled = true;

    default void debug(String msg) {
        if (debugEnabled) {
            LOG.append("DEBUG:").append(msg).append("\n");
        }
    }

    default void info(String msg) {

        if (infoEnabled) {
            LOG.append("INFO:").append(msg).append("\n");
        }
    }
        
    default String dumpLog() {
        return LOG.toString();       
    }
    
    void error(String msg);
    
    
    static String dumpLog_STATIC(){
    	return LOG.toString();
    }

}
