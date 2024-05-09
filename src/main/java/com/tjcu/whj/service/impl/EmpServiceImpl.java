package com.tjcu.whj.service.impl;

import com.tjcu.whj.dao.EmpDao;
import com.tjcu.whj.entity.Emp;
import com.tjcu.whj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("empService")
/**
 * 控制事务
 */
@Transactional
public class EmpServiceImpl implements EmpService {
    /**
     * 将empDao注入进@Service组件中
     */
    @Autowired
    private EmpDao empDao;

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

    @Override
    public void insert(Emp emp) {
        empDao.insert(emp);
    }

    @Override
    public void deleteById(Integer id) {
    empDao.deleteById(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> showEmp() {
        return empDao.showEmp();
    }

    @Override
    public void updateEmp(Emp emp) {
        empDao.updateEmp(emp);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Emp selectEmpById(Integer id) {
        return empDao.selectEmpById(id);
    }
}
