package my.day13;

import java.util.Scanner;
import java.util.Vector;

public class BookTest {

	static BookDAO bdao = new BookDAO();
	static BookDTO bdto = new BookDTO();

	public static void printAll(Vector<BookDTO> vector) {

		for (BookDTO bdto : vector) {
			System.out.println("=====================");
			System.out.println("책 번호 : " + bdto.getBook_id());
			System.out.println("책 이름 : " + bdto.getTitle().toString());
			System.out.println("책 출판사 : " + bdto.getPublisher().toString());
			System.out.println("책 연도 : " + bdto.getYear().toString());
			System.out.println("책 가격 : " + bdto.getPrice());
		}
	}

	public void bookdbMenu() {
		System.out.println("===== 도서 관리 메뉴 =====");
		System.out.println("1.도서 추가   2.모든 도서조회   3.도서 검색    4.도서 수정   5.도서 삭제   0.종료");
		System.out.println("=================");
		System.out.println("원하는 번호 입력 >>");
	}

	public void updateBookMenu() {
		System.out.println("======== 수정 메뉴 ========");
		System.out.println("1.책 이름   2.출판사   3.연도   4.가격    0.종료");
		System.out.println("=======================");
		System.out.println("원하는 번호 입력 >>");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int n;
		int result;
		BookTest bt = new BookTest();
		Vector<BookDTO> vector;
		Scanner sc = new Scanner(System.in);
		bdao.dbConnect();

		while (true) {
			bt.bookdbMenu();
			n = sc.nextInt();

			// 메뉴 스위치 문
			switch (n) {
			case 1: // 도서 입력
				System.out.println("책 이름 입력 : ");
				String title = sc.next();
				System.out.println("출판사 입력 : ");
				String publisher = sc.next();
				System.out.println("연도 입력 : ");
				String year = sc.next();
				System.out.println("가격 입력 : ");
				int price = sc.nextInt();
				bdao.insertBook(title, publisher, year, price);
				break;

			case 2: // 모든 도서 정보 조회
				vector = bdao.selectAll();
				bt.printAll(vector);
				break;

			case 3: // 도서이름으로 검색
				System.out.println("조회를 원하는 도서 이름 입력 : ");
				String search = sc.next();
				bdto = bdao.selectByTitle(search);
				System.out.println("----- 검색 결과 : " + search + " 도서 정보 -----");
				System.out.println("책 아이디 : " + bdto.getBook_id());
				System.out.println("책 제목 : " + bdto.getTitle());
				System.out.println("출판사  : " + bdto.getPublisher());
				System.out.println("연도 : " + bdto.getYear());
				System.out.println("가격 : " + bdto.getPrice());
				break;

			case 4: // 수정
				System.out.println("수정할 도서 이름 입력 : ");
				String name = sc.next();
				bdto = bdao.selectByTitle(name);
				System.out.println("----- 검색 결과 : " + name + " 도서 정보 -----");
				System.out.println("책 아이디 : " + bdto.getBook_id());
				System.out.println("책 제목 : " + bdto.getTitle());
				System.out.println("출판사  : " + bdto.getPublisher());
				System.out.println("연도 : " + bdto.getYear());
				System.out.println("가격 : " + bdto.getPrice());

				bt.updateBookMenu();
				int m = sc.nextInt();
				String tr, pu, ye;
				int pr;
				switch (m) {
				case 1:
					System.out.println("수정할 책 제목 : ");
					tr = sc.next();
					bdto.setTitle(tr);
					break;

				case 2:
					System.out.println("수정할 출판사 : ");
					pu = sc.next();
					bdto.setPublisher(pu);
					break;

				case 3:
					System.out.println("수정할 책 연도 : ");
					ye = sc.next();
					bdto.setYear(ye);
					break;

				case 4:
					System.out.println("수정할 책 가격 : ");
					pr = sc.nextInt();
					bdto.setPrice(pr);
					break;

				case 0:
					System.out.println("수정 종료");
					System.exit(0);
					break;

				default:
					System.out.println("잘못된 번호 입력");
					break;
				}
				result = bdao.updateBook(bdto.getTitle(), bdto.getPublisher(), bdto.getYear(), bdto.getPrice());
				if (result > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				break;

			case 5:
				System.out.println("삭제 할 책 이름 : ");
				String deletitle = sc.next();
				result = bdao.deleteBook(deletitle);
				if (result > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;

			case 0:
				System.out.println("관리 종료");
				System.exit(0);
				break;

			default:
				System.out.println("잘못된 번호 입력");
				break;
			}

		} // while()-------------

	}
		
		/*
		int n = 0;
		Vector<BookDTO> result;
		bdao.dbConnect();
		result = bdao.selectAll();

		for (BookDTO b : result) {
			System.out.println("책 번호 : " + b.getBook_id());
			System.out.println("책 이름 : " + b.getTitle());
			System.out.println("책 출판사 : " + b.getPublisher());
			System.out.println("책 연도 : " + b.getYear());
			System.out.println("책 가격 : " + b.getPrice());
		}
		System.out.println();

		n = bdao.insertBook("네트워크", "한빛", "2000", 35000);

		if (n > 0) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}

		result = bdao.selectAll();
		for (BookDTO b : result) {
			System.out.println("책 번호 : " + b.getBook_id());
			System.out.println("책 이름 : " + b.getTitle());
			System.out.println("책 출판사 : " + b.getPublisher());
			System.out.println("책 연도 : " + b.getYear());
			System.out.println("책 가격 : " + b.getPrice());
		}
		System.out.println();

		n = bdao.deleteBook("네트워크");
		if (n > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

		result = bdao.selectAll();
		for (BookDTO b : result) {
			System.out.println("책 번호 : " + b.getBook_id());
			System.out.println("책 이름 : " + b.getTitle());
			System.out.println("책 출판사 : " + b.getPublisher());
			System.out.println("책 연도 : " + b.getYear());
			System.out.println("책 가격 : " + b.getPrice());
		}
		System.out.println();
		*/
	
		
	}



