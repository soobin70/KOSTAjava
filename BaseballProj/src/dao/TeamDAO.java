package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Team;

public class TeamDAO {

   public static Connection getConnection() {
      Connection conn = null;
      try {
         Class.forName("org.mariadb.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb", "root", "1234");
      } catch (Exception e) {
         e.printStackTrace();
      }
      return conn;
   }

   public static void close(Connection conn) {
      try {
         if (conn != null)
            conn.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public int insertTeam(Team team) {
      Connection conn = getConnection();
      int cnt = 0;
      PreparedStatement pstmt = null;
      String sql = "insert into player (name, local) values (?,?)";
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, team.getName());
         pstmt.setString(2, team.getLocal());
         cnt = pstmt.executeUpdate();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (pstmt != null)
               pstmt.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
         close(conn);
         return cnt;
      }
   }

   public static Team selectTeam(String teamName) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      Team team = null;
      String sql = "select * from tam where name = ?";
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, teamName);
         rs = pstmt.executeQuery();
         if (rs != null && rs.next()) {
            Integer num = rs.getInt("num");
            String teamname = rs.getString("name");
            String local = rs.getString("local");
            team = new Team(num, teamName, local);
//               강사님 team = new Team(rs.getInt("num"), rs.getString("name"), rs.getString("local"));
         }
      } catch (Exception e) {
         e.printStackTrace(); // 예외 처리 필요
      } finally {
         try {
            if (rs != null) {
               rs.close();
            }
            if (pstmt != null) {
               pstmt.close();
            }
         } catch (Exception e) {
            e.printStackTrace(); // 예외 처리 필요
         } finally {
            close(conn);
         }
      }

      return team;
   }

   public static List<Team> selectTeamList() {
      Connection conn = getConnection();
      List<Team> teamList = new ArrayList<>();
      Statement stmt = null;
      ResultSet rs = null;
      String sql = "SELECT* FROM team";

      try {
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
         if (rs != null) {
            while (rs.next()) {
               Integer num = rs.getInt("num");
               String teamName = rs.getString("name");
               String local = rs.getString("local");
               Team team = new Team(num, teamName, local);
               teamList.add(team);
//               teamList.add(new Team(rs.getInt("num"),rs.getString("name"),rs.getString("local")));
            }
         }
      } catch (Exception e) {
         e.printStackTrace(); // 예외 처리 필요
      } finally {
         try {
            if (rs != null) {
               rs.close();
            }
            if (stmt != null) {
               stmt.close();
            }
         } catch (Exception e) {
            e.printStackTrace(); // 예외 처리 필요
         } finally {
            close(conn);
         }
      }

      return teamList;
   }

}