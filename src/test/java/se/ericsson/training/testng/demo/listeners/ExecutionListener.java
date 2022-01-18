package se.ericsson.training.testng.demo.listeners;

import org.testng.IExecutionListener;
import se.ericsson.training.testng.demo.Constants;
import se.ericsson.training.testng.demo.LogUtils;

public class ExecutionListener implements IExecutionListener {

    /* (non-Javadoc)
     * @see org.testng.IExecutionListener#onExecutionStart()
     */
    public void onExecutionStart() {
        LogUtils.info(Constants.LISTENER_MSG_EXECUTION_START);
    }

    /* (non-Javadoc)
     * @see org.testng.IExecutionListener#onExecutionFinish()
     */
    public void onExecutionFinish() {
        LogUtils.info(Constants.LISTENER_MSG_EXECUTION_FINISH);
    }

}
