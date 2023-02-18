package techproed.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class ListenersRetry implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 1;
    private ITestResult result;

    @Override
    public boolean retry(ITestResult result) {
        this.result = result;
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}