package com.langsin.dao;

import com.langsin.bean.Worker;

import java.util.List;

/**
 * @author lqwqk
 * creation time 2019-04-25 09:05:12
 */
public interface WorkerDao {

    public abstract List<Worker> queryAllWorkers();
    public abstract  Worker queryAllWorkerByWid(String wid);
    public abstract int insertWorker(Worker worker);
}
