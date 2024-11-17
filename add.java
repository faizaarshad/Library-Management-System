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

@WebServlet("/add")
public class add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bookId = Integer.parseInt(request.getParameter("BookId"));
        String bookName = request.getParameter("BookName");
        String authorName = request.getParameter("AuthorName");
        String category = request.getParameter("Category");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "");
             PreparedStatement ps = conn.prepareStatement("INSERT INTO library (BookId, BookName, AuthorName, Category) VALUES (?, ?, ?, ?)")) {
            ps.setInt(1, bookId);
            ps.setString(2, bookName);
            ps.setString(3, authorName);
            ps.setString(4, category);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("show.jsp");
    }
}
