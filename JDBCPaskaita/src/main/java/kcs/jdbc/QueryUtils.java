package kcs.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryUtils {

    public static boolean isTableExist(Connection connection, String tablename) {
        if (connection == null || tablename == null) {
            return false;
        }
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, tablename, null);
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
