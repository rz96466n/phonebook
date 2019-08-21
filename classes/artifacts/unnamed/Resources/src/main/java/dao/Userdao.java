package dao;

import mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import model.user;

@Repository
public class Userdao  {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public user findinfo(String userName){
        String sql= String.format("select * from phonebook where username= '%s'",userName);
        RowMapper mapper=new userMapper();
        user userinfo= (user) jdbcTemplate.queryForObject(sql,mapper );
        return  userinfo;
    }                       // 返回所有该username 相关所有信息



}
