package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Player;

public class PlayerDAO {
   public static Connection getConnection() {
      Connection conn = null;
      try {
         Class.forName("org.mariadb.jdbc.Driver");
         conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb", "root", "1234");
      } catch(Exception e) {
         e.printStackTrace();
      }
      return conn;
   }
   
   public static void close(Connection conn) {
      try {
         if(conn!=null) conn.close();
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   public static int insertPlayer(Player player) {
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      String sql = "insert into player (name, backnum, teamnum) values(?,?,?)";
      int cnt = 0;
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, player.getName());
         pstmt.setInt(2, player.getBacknum());
         pstmt.setInt(3, player.getTeamnum());
         pstmt.executeUpdate();
      } catch(Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(pstmt!=null) pstmt.close();
         } catch(Exception e) {
            e.printStackTrace();
         }
      }
      close(conn);
      return cnt;
   }
   
   public List<Player> selectPlayerByName(String name) {
      Connection conn = getConnection();
      List<Player> playerList = new ArrayList<>();
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = "select p.num, p.name, p.backnum, p.teamnum, t.name "
               + "from player p join team t on p.teamnum=t.num "
               + "where p.name=?";
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);
         rs = pstmt.executeQuery();
         if(rs!=null) {
            while(rs.next()) {
//               Integer num = rs.getInt("num");
//               String playerName = rs.getString("name");
//               Integer backnum = rs.getInt("backnum");
//               Integer teamnum = rs.getInt("teamnum");
//               String teamname = rs.getString("teamname");
//               Player player = new Player(num, playerName, backnum, teamnum, teamname);
//               playerList.add(player);
               playerList.add(new Player(rs.getInt(1),
                     rs.getString(2), rs.getInt(3),
                     rs.getInt(4), rs.getString(5)));
            }            
         }
      } catch(Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(rs!=null) {
               rs.close();
            }
            if(pstmt!=null) {
               pstmt.close();
            }
         } catch(Exception e) {
            e.printStackTrace();
         } finally {
            close(conn);
         }
      }
      
      return playerList;
   }
   
   public static List<Player> selectPlayerByBacknum(Integer backnum) {
       List<Player> playerList = new ArrayList<>();
       Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet rs = null;

       try {
           conn = getConnection();
           String sql = "select p.num, p.name, p.backnum, p.teamnum, t.name "
               + "from player p join team t on p.teamnum=t.num "
               + "where p.backnum=?";
           stmt = conn.prepareStatement(sql);
           stmt.setInt(1, backnum);
           rs = stmt.executeQuery();
           if(rs!=null) {
              while (rs.next()) {
//                 Integer num = rs.getInt("num");
//                 String playerName = rs.getString("name");
//                 Integer playerBacknum = rs.getInt("backnum");
//                 Integer teamnum = rs.getInt("teamnum");
//                 String teamname = rs.getString("teamname");
//                 Player player = new Player(num, playerName, playerBacknum, teamnum, teamname);
//                 playerList.add(player);
                 playerList.add(new Player(rs.getInt(1),
                       rs.getString(2), rs.getInt(3),
                       rs.getInt(4), rs.getString(5)));
              }
              
           }
       } catch (SQLException e) {
           e.printStackTrace(); // 예외 처리 필요
       } finally {
           try {
               if (rs != null) {
                   rs.close();
               }
               if (stmt != null) {
                   stmt.close();
               }
           } catch (SQLException e) {
               e.printStackTrace(); // 예외 처리 필요
           } finally {
               close(conn);
           }
       }

       return playerList;
   }

   
   public Player selectPlayerByNum(Integer num) {
       Player player = null;
       Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet rs = null;

       try {
           conn = getConnection();
           String sql = "SELECT num, name, backnum, teamnum FROM player WHERE num = ?";
           stmt = conn.prepareStatement(sql);
           stmt.setInt(1, num);

           rs = stmt.executeQuery();

           if (rs.next()) {
               String playerName = rs.getString("name");
               Integer playerBacknum = rs.getInt("backnum");
               Integer teamnum = rs.getInt("teamnum");
               String teamname = rs.getString("teamname");
               player = new Player(num, playerName, playerBacknum, teamnum, teamname);
           }
       } catch (SQLException e) {
           e.printStackTrace(); // 예외 처리 필요
       } finally {
           try {
               if (rs != null) {
                   rs.close();
               }
               if (stmt != null) {
                   stmt.close();
               }
           } catch (SQLException e) {
               e.printStackTrace(); // 예외 처리 필요
           } finally {
               close(conn);
           }
       }

       return player;
   }

   
   public List<Player> selectPlayerByTeam(String teamName) {
      Connection conn = getConnection();
     
       PreparedStatement pstmt = null;
       ResultSet rs = null;
       String sql = "select p.num, p.name, p.backnum, p.teamnum, t.name "
                + "from player p join team t on p.teamnum=t.num "
                + "where t.name=?";
       List<Player> playerList = new ArrayList<>();
       try {
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, teamName);
           rs = pstmt.executeQuery();
           if(rs!=null) {
              while (rs.next()) {
//                 Integer num = rs.getInt("num");
//                 String playerName = rs.getString("name");
//                 Integer playerBacknum = rs.getInt("backnum");
//                 Integer teamnum = rs.getInt("teamnum");
//                 String teamname = rs.getString("teamname");
//                 Player player = new Player(num, playerName, playerBacknum, teamnum, teamname);
//                 playerList.add(player);
                 playerList.add(new Player(rs.getInt(1),
                       rs.getString(2), rs.getInt(3),
                       rs.getInt(4), rs.getString(5)));
              }              
           }
       } catch (SQLException e) {
           e.printStackTrace(); // 예외 처리 필요
       } finally {
           try {
               if (rs != null) {
                   rs.close();
               }
               if (pstmt != null) {
                   pstmt.close();
               }
           } catch (SQLException e) {
               e.printStackTrace(); // 예외 처리 필요
           } finally {
               close(conn);
           }
       }

       return playerList;
   }

}
