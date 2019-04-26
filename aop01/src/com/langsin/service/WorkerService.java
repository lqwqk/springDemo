package com.langsin.service;

import com.langsin.bean.Worker;

import java.util.List;

/**
 * @author lqwqk
 * creation time 2019-04-25 09:04:22
 */
public interface WorkerService {
    public abstract List<Worker> queryAllWorkers();
    public abstract  Worker queryAllWorkerByWid(String wid);
    public abstract int insertWorker(Worker worker);
    public abstract void insertWorker2(Worker w1 , Worker w2);
}

