package com.yncksm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//jdbc快速入门
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2获取链接
        String url="jdbc:mysql://127.0.0.1:3306/awesome";
        String username="root";
        String pwd="wrl@zxn123";
        Connection conn = DriverManager.getConnection(url,username,pwd);
        String sql="update users set image='58774' where id=1";

        Statement statement = conn.createStatement();

        int count = statement.executeUpdate(sql);

        System.out.println(count);

        statement.close();

        conn.close();
    }
}
