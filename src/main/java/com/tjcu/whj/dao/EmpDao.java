package com.tjcu.whj.dao;

import com.tjcu.whj.entity.Emp;

import java.util.List;


public interface EmpDao {
    /**
     * 添加员工
     *
     * @param emp
     */
    public void insert(Emp emp);

    /**
     * 删除员工
     * @param id
     */
    public void deleteById(Integer id);

    /**
     * 展示员工
     * @return
     */
    public List<Emp> showEmp();

    /**
     * 修改员工
     * @param emp
     */
    public void updateEmp(Emp emp);

    /**
     * 数据回显
     * @param id
     * @return
     */
    public Emp selectEmpById(Integer id);
}
