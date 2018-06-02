package com.star.controller;
import java.sql.*;
public class MysqlManagement {
	public static void link() {
		try
	      {
	          Class.forName(JDBC_DRIVER);
	          conn = DriverManager.getConnection(DB_URL,name,pwd);
	          stmt = conn.createStatement();
	         if(0 == stmt.executeLargeUpdate(creatsql))
	         {
	             System.out.println("数据哭创建成功");
	         }
	         else
	         {
	             System.out.println("创建表失败！");
	         }
	         //
	          stmt.close();
	          conn.close();
	      }
	      catch(Exception e)
	      {
	          System.out.println("创建表失败！");
	          e.printStackTrace();
	      }
	}
    public static boolean insertData(String id,String pname,String location) {
    	try {
    		
    	conn = DriverManager.getConnection(DB_URL,name,pwd);
    	stmt = conn.createStatement();
    	String sql = "insert into player values("+id+", '"+pname+"','"+location+"');";
    	
			stmt.executeUpdate(sql);
			stmt.close();
	          conn.close();
	          return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库插入失败!");
			e.printStackTrace();
			return false;
		}
    }
    public static boolean search(String id) {
    	try {
    		
        	conn = DriverManager.getConnection(DB_URL,name,pwd);
        	stmt = conn.createStatement();
        	String sql = "select id from player;";
        	
        	ResultSet result = stmt.executeQuery(sql);
            while (result.next())
            {
                String res = result.getString("id");
                if ((id.trim()).equals(res.trim())) {
					return true;
				}
            }
    			stmt.close();
    	          conn.close();
    	          return false;
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			System.out.println("数据库查询失败!");
    			e.printStackTrace();
    			return false;
    		}
	}


    public static boolean upData(String id,String location) {
    	try {
    		
        	conn = DriverManager.getConnection(DB_URL,name,pwd);
        	stmt = conn.createStatement();
        	String sql ="Update player set location ='"+ location+"' where id in ('"+id+"');";
//        	update  employees set salary=8000 where employee_id=100005
//        	Select id from player where id in ('id')
        	
    			stmt.executeUpdate(sql);
    			stmt.close();
    	          conn.close();
    	          return true;
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			System.out.println("数据库更新失败!");
    			e.printStackTrace();
    			return false;
    		}
	}
    static String creatsql = "CREATE TABLE player("
    		+ "id varchar(100) not null,"
            + "name varchar(100) not null,"
            + "location varchar(100) not null,"
            + "primary key(id)"
            + ")charset=utf8;";

    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost/jdbcdemo?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=GMT   ";
    final static String name = "root";
    final static String pwd = "0000";
    private static Connection conn = null;
    static private Statement stmt = null;
//    public static void main(String[] args)
//    {
////    	link();
////      boolean insertData = insertData("0002", "hhh", "kk");
//      boolean search = search("10");
//      boolean upData = upData("1", "fff");
////      System.out.println(insertData);
//      System.out.println(search);
//      System.out.println(upData);
//      
//    }
}
