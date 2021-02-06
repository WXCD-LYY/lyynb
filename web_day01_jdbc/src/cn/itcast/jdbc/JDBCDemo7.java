package cn.itcast.jdbc;

import java.sql.*;

/**
 * 执行DDL语句
 */
public class JDBCDemo7 {
    public static void main(String[] args) {
        Connection coon = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接对象
            coon = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            // 3. 定义sql
            String sql = "select * from account";
            // 4. 获取执行sql对象
            stmt = coon.createStatement();
            // 5. 执行sql
            rs = stmt.executeQuery(sql);
            // 6. 处理结果
            // 6.1 让游标向下移动一行
            // 循环判断游标是否是最后一行末尾
            while (rs.next()) {

                // 获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                System.out.println(id + "---" + name + "---" + balance);
            }

            /*if (rs.next()){
                // 6.2 获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                System.out.println(id + "---" + name + "---" + balance);
            }*/

            // System.out.println(count);
            /*if (count > 0) {
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败！");
            }*/
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
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



