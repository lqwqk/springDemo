package com.langsin.test;
import com.langsin.bean.Worker;
import com.langsin.service.WorkerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

/**
 * @author lqwqk
 * creation time 2019-04-25 09:05:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MyTest {

    @Autowired
    WorkerService workerService;

    @Test
    public void testspring() throws  Exception{
        List<Worker> workers = workerService.queryAllWorkers();
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }


    @Test
    public void testTransaction() throws Exception {
        Worker w1 = new Worker(UUID.randomUUID().toString(), "lucy1", 20, "男");
        Worker w2 = new Worker(UUID.randomUUID().toString(),"lisis1", 20, "女");
        workerService.insertWorker2(w1, w2);
    }
}
