package com.browserstack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.instrument.Instrumentation;

public class BrowserStackJavaAgent {
    private static final Logger LOGGER = LoggerFactory.getLogger("BrowserStackJavaAgent");

    /**
     * As soon as the JVM initializes, This  method will be called.
     * Configs for intercepting will be read and added to Transformer so that Transformer will intercept when the
     * corresponding Java Class and Method is loaded.
     *
     * @param agentArgs       The list of agent arguments
     * @param instrumentation The instrumentation object
     * @throws InstantiationException While  an instantiation of object cause an error.
     */
    public static void premain(String agentArgs, Instrumentation instrumentation) throws Exception {
        startBrowserStackAgent(agentArgs, instrumentation);
    }

    public static void agentmain(String agentArgs, Instrumentation instrumentation) throws Exception {
        startBrowserStackAgent(agentArgs, instrumentation);
    }

    private static void startBrowserStackAgent(String agentArgs, Instrumentation instrumentation) throws Exception {
        LOGGER.info("Starting BrowserStack Java Agent......");
    }

}
