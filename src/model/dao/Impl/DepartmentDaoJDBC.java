package model.dao.Impl;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {
    private Connection conn;

    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }
    @Override
    public void insert(Department obj) {
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement("INSERT INTO Department (Id, Name) VALUES (?, ?)");
            st.setInt(1, obj.getId());
            st.setString(2, obj.getName());

            st.executeUpdate();
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {
    PreparedStatement st = null;
    try{
        st = conn.prepareStatement("UPDATE Department SET Name = ? WHERE Id = ?");
        st.setString(1, obj.getName());
        st.setInt(2, obj.getId());
        if(obj.getId() == null){
            throw new DbException("Non-existent department!");
        }
        st.executeUpdate();

    }catch (SQLException e){
        throw new DbException(e.getMessage());
    }finally {
        DB.closeStatement(st);
    }
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
