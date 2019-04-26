package com.langsin.service;

import com.langsin.bean.Worker;
import com.langsin.dao.WorkerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lqwqk
 * creation time 2019-04-25 09:13:43
 */
@Service("workerService")
@Transactional
public class WorkerServiceImpl implements  WorkerService {

    @Autowired
    private WorkerDao workerDao;

    @Override
    public List<Worker> queryAllWorkers() {
        return workerDao.queryAllWorkers();
    }

    @Override
    public Worker queryAllWorkerByWid(String wid) {
        return null;
    }

    @Override
    public int insertWorker(Worker worker) {
        return workerDao.insertWorker(worker);
    }

    @Override
    @Transactional(isolation= Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
    public void insertWorker2(Worker w1, Worker w2) {
        workerDao.insertWorker(w1);
        workerDao.insertWorker(w2);
    }


    public void setWorkerDao(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }
}
