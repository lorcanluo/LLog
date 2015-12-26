package com.github.lorcanluo.logfile;


/**
 * @author luocan
 * @version 1.0
 *          </p>
 *          Created on 15/12/25.
 */
public class LogHtml {

    private static boolean isDebuggable = true;
    private static LogQueue mLogQueue;
    private static String mRootPath;


    /**
     * @param rootPath the log file path
     */
    public static void init(String rootPath) {
        mLogQueue = new LogQueue();
        mLogQueue.start();
        mRootPath = rootPath;
    }

    public static String getRootPath() {
        return mRootPath;
    }


    /**
     * open or close the function
     *
     * @param isDebuggable if set to false, not print the message.
     */
    public static void setIsDebuggable(boolean isDebuggable) {
        LogHtml.isDebuggable = isDebuggable;
    }

    /**
     * error log
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void e(String tag, String msg) {
        if (!isDebuggable) {
            return;
        }

        if (mLogQueue == null) {
            throw new NullPointerException("Must call init method first!");
        }

        LogMsg logMsg = new LogMsg();
        logMsg.setTag(tag);
        logMsg.setMsg(msg);
        logMsg.setPriority(LogMsg.ERROR);
        mLogQueue.add(logMsg);
    }


    /**
     * info log
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void i(String tag, String msg) {
        if (!isDebuggable) {
            return;
        }

        if (mLogQueue == null) {
            throw new NullPointerException("Must call init method first!");
        }

        LogMsg logMsg = new LogMsg();
        logMsg.setTag(tag);
        logMsg.setMsg(msg);
        logMsg.setPriority(LogMsg.INFO);
        mLogQueue.add(logMsg);
    }


    /**
     * debug log
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void d(String tag, String msg) {
        if (!isDebuggable) {
            return;
        }

        if (mLogQueue == null) {
            throw new NullPointerException("Must call init method first!");
        }

        LogMsg logMsg = new LogMsg();
        logMsg.setTag(tag);
        logMsg.setMsg(msg);
        logMsg.setPriority(LogMsg.DEBUG);
        mLogQueue.add(logMsg);
    }
}
