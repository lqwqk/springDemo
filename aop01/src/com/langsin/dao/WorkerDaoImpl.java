package com.langsin.dao;

import com.langsin.bean.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author lqwqk
 * creation time 2019-04-25 09:12:59
 */
@Repository("workerDao")
public class WorkerDaoImpl implements WorkerDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Worker> queryAllWorkers() {
        String sql = "select * from worker";
        Object[] obj = null;
        List<Worker> workers = jdbcTemplate.query(sql, new RowMapper<Worker>() {
            @Override
            public Worker mapRow(ResultSet resultSet, int i) throws SQLException {
                String wid   = resultSet.getString("wid");
                String wname = resultSet.getString("wname");
                int    age   = Integer.parseInt(resultSet.getString("age"));
                String sex   = resultSet.getString("sex");
                Worker w     = new Worker(wid, wname, age, sex);
                return w;
            }
        }, obj);

        return workers;
    }

    @Override
    public Worker queryAllWorkerByWid(String wid) {
        return null;
    }

    @Override
    public int insertWorker(Worker worker) {
        String sql = "insert into worker values(?,?,?,?)";
        Object[] obj = {worker.getWid(),worker.getWname(),worker.getAge(),worker.getSex()};
        int rows = jdbcTemplate.update(sql, obj);
        return rows;
    }
}
