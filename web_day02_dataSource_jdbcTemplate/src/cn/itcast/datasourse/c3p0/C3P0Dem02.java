package cn.itcast.datasourse.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.debug.CloseLoggingComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * c3p0演示
 */
public class C3P0Dem02 {

    public static void main(String[] args) throws SQLException {
        /*// 1.获取DataSource
        DataSource ds = new CloseLoggingComboPooledDataSource();

        // 2. 获取连接

        for (int i = 1; i <= 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);

            if (i == 5) {
                conn.close(); // 归还连接到连接池中
            }
        }*/
        testNameConfig();
    }

    public static void testNameConfig() throws SQLException {
        // 1.1 获取DataSource，指定名称配置
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        // 2. 获取连接

        for (int i = 1; i <= 10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);


        }
    }
}
