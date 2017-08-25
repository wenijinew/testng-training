/**
 * 
 */
package se.ericsson.mje.training.testng.listeners;

import java.io.PrintStream;

import org.testng.IExecutionListener;


/**
 *
 */
public class ExecutionListener implements IExecutionListener {

    PrintStream out = System.out;

    /* (non-Javadoc)
     * @see org.testng.IExecutionListener#onExecutionStart()
     */
    public void onExecutionStart() {
        out.println("Listener: Execution Start");
    }

    /* (non-Javadoc)
     * @see org.testng.IExecutionListener#onExecutionFinish()
     */
    public void onExecutionFinish() {
        out.println("Listener: Execution Finish");
    }

}
