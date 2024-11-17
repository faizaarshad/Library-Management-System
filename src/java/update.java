import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class update extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookId = Integer.parseInt(request.getParameter("BookId"));
        String bookName = request.getParameter("BookName");
        String authorName = request.getParameter("AuthorName");
        String category = request.getParameter("Category");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "");
             PreparedStatement ps = conn.prepareStatement("UPDATE library SET BookName=?, AuthorName=?, Category=? WHERE BookId=?")) {
            ps.setString(1, bookName);
            ps.setString(2, authorName);
            ps.setString(3, category);
            ps.setInt(4, bookId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("show.jsp");
    }
}
