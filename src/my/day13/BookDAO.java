package my.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class BookDAO {

	Connection con;
	ResultSet rs;
	Statement st;
	String id = "root";
	String pwd = "1234";

	// db ���� �޼ҵ�
	public void dbConnect() throws Exception {
		// jdbc ���α׷��� ����
		// 1�ܰ� : jdbc ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/book_db";

		// 2�ܰ� : ������ ���̽����� ���� (Connection)
		con = DriverManager.getConnection(url, id, pwd);
		System.out.println("Db Connected...");

	}// dbConnect()---------

	// �� Book ������ �߰� �޼ҵ� (insert into)
	public int insertBook(String title, String publisher, String year, int price) {

		// 3�ܰ� : SQL���� ��ü ���� ��, ������ ����
		try {
			st = con.createStatement();
			String sql = "INSERT INTO books(title,publisher,year,price) VALUES";
			sql += "('" + title + "','" + publisher + "','" + year + "','" + price + "')";

			// 4�ܰ� : ���� ���� ��� ó�� (������� ��� �� ���� ����)
			int n = st.executeUpdate(sql);
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1; // �Է� ���� �� -1�� ����
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {

			}
		} // finally()-------

	}// insertBook()-------------

	// å ������ ���� �޼ҵ� ��, �����ϰ����ϴ� id�� �������� �ش� ����׸� �����Ѵ�.
	public int deleteBook(String title) {
		try {
			st = con.createStatement();
			String sql = "delete from books where title='" + title + "'";
			int n = st.executeUpdate(sql);
			return n; // ���� ������ 1�� ����
		} catch (SQLException e) {
			e.printStackTrace();
			return -1; // �Է� ���� �� -1�� ����
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {

			}

		} // finally()-------

	}// deleteBook()--------------------

	public int updateBook(String title, String publisher, String year, int price) {
		try {
			st = con.createStatement();
			String sql = "UPDATE books SET title='" + title + "',publisher='" + publisher + "',year='" + year
					+ "',price='" + price + "'";
			return st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return -1; // �Է� ���� �� -1�� ����
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {

			}

		} // finally()-------
	}// updateBook()-------------

	// ��� å ���ڵ� �˻��Ͽ� Vector �ڷᱸ���� �����Ͽ� ��ȯ
	public Vector<BookDTO> selectAll() {
		try {
			st = con.createStatement();
			String sql = "SELECT * FROM books";
			rs = st.executeQuery(sql);
			Vector<BookDTO> arr = new Vector<BookDTO>();
			arr = makeVector(rs);
			return arr;
		} catch (SQLException e) {
			e.printStackTrace();
			return null; // �Է� ���� �� -1�� ����
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e) {

			}
		} // finally()-------

	}// selectAll()------------

	// ���� ( å �̸� )
	public BookDTO selectByTitle(String title) {
		try {
			st = con.createStatement();
			String sql = "SELECT * FROM books where title='" + title + "'";
			BookDTO bdto = new BookDTO();
			rs = st.executeQuery(sql);

			// �����Ͱ� �ϳ��� �����Ƿ� rs.next()�� �ѹ��� ����
			rs.next();
			bdto.setBook_id(rs.getInt("book_id"));
			bdto.setTitle(rs.getString("Title"));
			bdto.setPublisher(rs.getString("publisher"));
			bdto.setYear(rs.getString("year"));
			bdto.setPrice(rs.getInt("Price"));
			rs.close();
			return bdto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null; // �Է� ���� �� -1�� ����
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e) {

			}
		} // finally()-------

	}// selectByTitle()----------

	// ResultSet���� �����͸� ������ DTO ��ü�� ���� ��, ���Ϳ� ������ �� ���͸� ���� �ִ� �޼ҵ�
	public Vector<BookDTO> makeVector(ResultSet rs) throws SQLException {
		Vector<BookDTO> v = new Vector<BookDTO>();

		while (rs.next()) {
			int book_id = rs.getInt("book_id");
			String title = rs.getString("title");
			String publisher = rs.getString("publisher");
			String year = rs.getString("year");
			int price = rs.getInt("price");

			// �Ѱ��� ���ڵ�... DTO��ü�� �����
			BookDTO dto = new BookDTO(book_id, title, publisher, year, price);
			v.add(dto);
		} // while()--------
		return v;

	}// makeVector()---------------

}
