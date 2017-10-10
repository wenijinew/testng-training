/**
 * 
 */
package se.ericsson.mje.training.testng.listeners;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Calendar;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


/**
 *
 */
public class AnnotationTransformerImpl implements IAnnotationTransformer {

    PrintStream out = System.out;

    /**
     * 
     */
    public AnnotationTransformerImpl() {
    }

    /* (non-Javadoc)
     * @see org.testng.IAnnotationTransformer#transform(org.testng.annotations.ITestAnnotation, java.lang.Class, java.lang.reflect.Constructor, java.lang.reflect.Method)
     */
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if (testMethod == null) {
            return;
        }
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        String[] groups = annotation.getGroups();
        if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
            boolean bBasicFound = false;
            for (String group : groups) {
                if (group.contains("basic")) {
                    bBasicFound = true;
                    annotation.setInvocationCount(5);
                    break;
                }
            }
            if (!bBasicFound) {
                annotation.setInvocationCount(0);
            }
        } else {
            boolean bAdvancedFound = false;
            for (String group : groups) {
                if (group.contains("advanced")) {
                    bAdvancedFound = true;
                    annotation.setInvocationCount(5);
                    break;
                }
            }
            if (!bAdvancedFound) {
                annotation.setInvocationCount(0);
            }
        }
    }
}
