package com.goodtech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpreadsheetRepositoryImpl implements SpreadsheetRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createTable(String tableName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int alterTable(String tableColumn, String tableName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertData(String columnName, String data, String tablename) {
		// TODO Auto-generated method stub
		return 0;
	}

}
