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
        try {
            mLogQueue.add(logMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void start() {
        stop();

        try {
            logExecutor = new LogExecutor(mLogQueue);
            logExecutor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        try {
            if (logExecutor != null) {
                logExecutor.quit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
