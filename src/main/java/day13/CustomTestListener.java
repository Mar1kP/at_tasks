package day13;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.logging.Logger;

public class CustomTestListener implements ITestListener {
    private final Logger LOGGER = Logger.getLogger(String.valueOf(this.getClass()));
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        LOGGER.info(result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        LOGGER.info(result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        LOGGER.info(result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        LOGGER.info(result.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        LOGGER.info(result.getName());
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
        LOGGER.info(result.getName());
    }
    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        LOGGER.info(context.getName());
    }
    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        LOGGER.info(context.getName());
    }
}
