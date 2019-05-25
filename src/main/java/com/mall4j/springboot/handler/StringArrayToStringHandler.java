package com.mall4j.springboot.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StringArrayToStringHandler extends BaseTypeHandler<String[]> {

    ObjectMapper objectMapper = new ObjectMapper();
    /*bean to 数据库*/
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String[] strings, JdbcType jdbcType) throws SQLException {
        ObjectWriter writer = objectMapper.writer();
        String s = null;
        try {
            s = writer.writeValueAsString(strings);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        preparedStatement.setString(i,s);
    }

    /*数据库 to bean*/
    @Override
    public String[] getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String[] strings = null;
        try {
            strings = objectMapper.readValue(resultSet.getString(s),String[].class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String[] strings = null;
        try {
            strings = objectMapper.readValue(resultSet.getString(i),String[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    @Override
    public String[] getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String[] strings = null;
        try {
            strings = objectMapper.readValue(callableStatement.getString(i),String[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
