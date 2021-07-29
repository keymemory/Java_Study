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

	// db 연결 메소드
	public void dbConnect() throws Exception {
		// jdbc 프로그래밍 절차
		// 1단계 : jdbc 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/book_db";

		// 2단계 : 데이터 베이스와의 연결 (Connection)
		con = DriverManager.getConnection(url, id, pwd);
		System.out.println("Db Connected...");

	}// dbConnect()---------

	// 새 Book 데이터 추가 메소드 (insert into)
	public int insertBook(String title, String publisher, String year, int price) {

		// 3단계 : SQL쿼리 객체 생성 후, 쿼리문 전송
		try {
			st = con.createStatement();
			String sql = "INSERT INTO books(title,publisher,year,price) VALUES";
			sql += "('" + title + "','" + publisher + "','" + year + "','" + price + "')";

			// 4단계 : 쿼리 전달 결과 처리 (결과집합 사용 후 연결 해제)
			int n = st.executeUpdate(sql);
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1; // 입력 실패 시 -1값 리턴
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {

			}
		} // finally()-------

	}// insertBook()-------------

	// 책 데이터 삭제 메소드 단, 삭제하고자하는 id를 기준으로 해당 레토그만 삭제한다.
	public int deleteBook(String title) {
		try {
			st = con.createStatement();
			String sql = "delete from books where title='" + title + "'";
			int n = st.executeUpdate(sql);
			return n; // 삭제 성공시 1값 리턴
		} catch (SQLException e) {
			e.printStackTrace();
			return -1; // 입력 실패 시 -1값 리턴
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
			return -1; // 입력 실패 시 -1값 리턴
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {

			}

		} // finally()-------
	}// updateBook()-------------

	// 모든 책 레코드 검색하여 Vector 자료구조에 저장하여 반환
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
			return null; // 입력 실패 시 -1값 리턴
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

	// 조최 ( 책 이름 )
	public BookDTO selectByTitle(String title) {
		try {
			st = con.createStatement();
			String sql = "SELECT * FROM books where title='" + title + "'";
			BookDTO bdto = new BookDTO();
			rs = st.executeQuery(sql);

			// 데이터가 하나만 있으므로 rs.next()를 한번만 실행
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
			return null; // 입력 실패 시 -1값 리턴
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

	// ResultSet에서 데이터를 꺼내와 DTO 객체로 만든 후, 백터에 저장한 후 백터를 돌려 주는 메소드
	public Vector<BookDTO> makeVector(ResultSet rs) throws SQLException {
		Vector<BookDTO> v = new Vector<BookDTO>();

		while (rs.next()) {
			int book_id = rs.getInt("book_id");
			String title = rs.getString("title");
			String publisher = rs.getString("publisher");
			String year = rs.getString("year");
			int price = rs.getInt("price");

			// 한개의 레코드... DTO객체로 만들기
			BookDTO dto = new BookDTO(book_id, title, publisher, year, price);
			v.add(dto);
		} // while()--------
		return v;

	}// makeVector()---------------

}
