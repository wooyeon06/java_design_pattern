package chainofresponsibility;


/**
 *
 * 이 패턴의 핵심 아이디어는 **"책임을 분리"**하고
 * **"요청을 전달"**하는 것입니다. 요청을 처리할 객체를 명시적으로 지정하지 않고,
 * 요청이 각 객체를 순차적으로 전달되면서 처리 가능 여부를 판단하여 처리하게 됩니다.
 * 만약 특정 객체가 요청을 처리할 수 없다면,
 * 다음 객체에게 요청을 넘겨 처리하게 됩니다.
 */

// Client 코드
public class Main {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an information.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(Logger.ERROR, "This is an error information.");
    }
}
