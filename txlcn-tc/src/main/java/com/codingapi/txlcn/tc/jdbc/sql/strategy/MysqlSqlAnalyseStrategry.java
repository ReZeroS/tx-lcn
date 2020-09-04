package com.codingapi.txlcn.tc.jdbc.sql.strategy;

import com.codingapi.txlcn.p6spy.common.StatementInformation;
import net.sf.jsqlparser.JSQLParserException;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Gz.
 * @description: SQL分析则略接口
 * @date 2020-08-13 23:08:26
 */
public interface MysqlSqlAnalyseStrategry {

    String mysqlAnalyseStrategry(String sql , Connection connection) throws JSQLParserException, SQLException;
}
