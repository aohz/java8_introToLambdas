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
public class UseLoggable implements Loggable {

	private boolean errorEnabled = true;
	
    //IMPORTANT THIS TRAIT USE MIGHT NOT BE THREAD-SAFE ... 
    //Don't do this at home, only at work!
    public static void main(String args[]) {
        System.out.println(new UseLoggable().process().dumpLog()); 
        
        
        System.out.println("------Print using a static reference--------\n");
        System.out.println(Loggable.dumpLog_STATIC()); 
    }

    public UseLoggable() {
    }

    public UseLoggable process() {
        debug("Debug Message");
        info("Info Message");
        error("Error Message");
        return this;
    }
    
    @Override
    public void error(String msg) {
    	 if (errorEnabled) {
             LOG.append("ERROR:").append(msg).append("\n");
         }    	
    }

}
