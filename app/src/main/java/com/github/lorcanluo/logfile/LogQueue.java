package com.github.lorcanluo.logfile;


import java.util.concurrent.LinkedBlockingQueue;


/**
 * @author luocan
 * @version 1.0
 *          </p>
 *          Created on 15/12/25.
 */
public class LogQueue {

    private final LinkedBlockingQueue<LogMsg> mLogQueue = new LinkedBlockingQueue<LogMsg>();
    private LogExecutor logExecutor;


    public void add(LogMsg logMsg) {
        mLogQueue.add(logMsg);
    }


    public void start() {
        stop();

        logExecutor = new LogExecutor(mLogQueue);
        logExecutor.start();
    }

    public void stop() {
        if (logExecutor != null) {
            logExecutor.quit();
        }
    }
}
