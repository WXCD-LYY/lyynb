package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表 删除一条数据
 */
public class JDBCDemo4 {
    public static void main(String[] args) {
        Connection coon = null;
        Statement stmt = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            coon = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            // 2. 获取连接对象
            DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            // 3. 定义sql
            String sql = "delete from account where id = 3";
            // 4. 获取执行sql对象
            stmt = coon.createStatement();
            // 5. 执行sql
            int count = stmt.executeUpdate(sql);
            // 6. 处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. 释放资源

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (coon != null) {
                try {
                    coon.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
