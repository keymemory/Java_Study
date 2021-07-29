package my.day13;

import java.util.Scanner;
import java.util.Vector;

public class BookTest {

	static BookDAO bdao = new BookDAO();
	static BookDTO bdto = new BookDTO();

	public static void printAll(Vector<BookDTO> vector) {

		for (BookDTO bdto : vector) {
			System.out.println("=====================");
			System.out.println("å ��ȣ : " + bdto.getBook_id());
			System.out.println("å �̸� : " + bdto.getTitle().toString());
			System.out.println("å ���ǻ� : " + bdto.getPublisher().toString());
			System.out.println("å ���� : " + bdto.getYear().toString());
			System.out.println("å ���� : " + bdto.getPrice());
		}
	}

	public void bookdbMenu() {
		System.out.println("===== ���� ���� �޴� =====");
		System.out.println("1.���� �߰�   2.��� ������ȸ   3.���� �˻�    4.���� ����   5.���� ����   0.����");
		System.out.println("=================");
		System.out.println("���ϴ� ��ȣ �Է� >>");
	}

	public void updateBookMenu() {
		System.out.println("======== ���� �޴� ========");
		System.out.println("1.å �̸�   2.���ǻ�   3.����   4.����    0.����");
		System.out.println("=======================");
		System.out.println("���ϴ� ��ȣ �Է� >>");
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

			// �޴� ����ġ ��
			switch (n) {
			case 1: // ���� �Է�
				System.out.println("å �̸� �Է� : ");
				String title = sc.next();
				System.out.println("���ǻ� �Է� : ");
				String publisher = sc.next();
				System.out.println("���� �Է� : ");
				String year = sc.next();
				System.out.println("���� �Է� : ");
				int price = sc.nextInt();
				bdao.insertBook(title, publisher, year, price);
				break;

			case 2: // ��� ���� ���� ��ȸ
				vector = bdao.selectAll();
				bt.printAll(vector);
				break;

			case 3: // �����̸����� �˻�
				System.out.println("��ȸ�� ���ϴ� ���� �̸� �Է� : ");
				String search = sc.next();
				bdto = bdao.selectByTitle(search);
				System.out.println("----- �˻� ��� : " + search + " ���� ���� -----");
				System.out.println("å ���̵� : " + bdto.getBook_id());
				System.out.println("å ���� : " + bdto.getTitle());
				System.out.println("���ǻ�  : " + bdto.getPublisher());
				System.out.println("���� : " + bdto.getYear());
				System.out.println("���� : " + bdto.getPrice());
				break;

			case 4: // ����
				System.out.println("������ ���� �̸� �Է� : ");
				String name = sc.next();
				bdto = bdao.selectByTitle(name);
				System.out.println("----- �˻� ��� : " + name + " ���� ���� -----");
				System.out.println("å ���̵� : " + bdto.getBook_id());
				System.out.println("å ���� : " + bdto.getTitle());
				System.out.println("���ǻ�  : " + bdto.getPublisher());
				System.out.println("���� : " + bdto.getYear());
				System.out.println("���� : " + bdto.getPrice());

				bt.updateBookMenu();
				int m = sc.nextInt();
				String tr, pu, ye;
				int pr;
				switch (m) {
				case 1:
					System.out.println("������ å ���� : ");
					tr = sc.next();
					bdto.setTitle(tr);
					break;

				case 2:
					System.out.println("������ ���ǻ� : ");
					pu = sc.next();
					bdto.setPublisher(pu);
					break;

				case 3:
					System.out.println("������ å ���� : ");
					ye = sc.next();
					bdto.setYear(ye);
					break;

				case 4:
					System.out.println("������ å ���� : ");
					pr = sc.nextInt();
					bdto.setPrice(pr);
					break;

				case 0:
					System.out.println("���� ����");
					System.exit(0);
					break;

				default:
					System.out.println("�߸��� ��ȣ �Է�");
					break;
				}
				result = bdao.updateBook(bdto.getTitle(), bdto.getPublisher(), bdto.getYear(), bdto.getPrice());
				if (result > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				break;

			case 5:
				System.out.println("���� �� å �̸� : ");
				String deletitle = sc.next();
				result = bdao.deleteBook(deletitle);
				if (result > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				break;

			case 0:
				System.out.println("���� ����");
				System.exit(0);
				break;

			default:
				System.out.println("�߸��� ��ȣ �Է�");
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
			System.out.println("å ��ȣ : " + b.getBook_id());
			System.out.println("å �̸� : " + b.getTitle());
			System.out.println("å ���ǻ� : " + b.getPublisher());
			System.out.println("å ���� : " + b.getYear());
			System.out.println("å ���� : " + b.getPrice());
		}
		System.out.println();

		n = bdao.insertBook("��Ʈ��ũ", "�Ѻ�", "2000", 35000);

		if (n > 0) {
			System.out.println("�Է� ����");
		} else {
			System.out.println("�Է� ����");
		}

		result = bdao.selectAll();
		for (BookDTO b : result) {
			System.out.println("å ��ȣ : " + b.getBook_id());
			System.out.println("å �̸� : " + b.getTitle());
			System.out.println("å ���ǻ� : " + b.getPublisher());
			System.out.println("å ���� : " + b.getYear());
			System.out.println("å ���� : " + b.getPrice());
		}
		System.out.println();

		n = bdao.deleteBook("��Ʈ��ũ");
		if (n > 0) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}

		result = bdao.selectAll();
		for (BookDTO b : result) {
			System.out.println("å ��ȣ : " + b.getBook_id());
			System.out.println("å �̸� : " + b.getTitle());
			System.out.println("å ���ǻ� : " + b.getPublisher());
			System.out.println("å ���� : " + b.getYear());
			System.out.println("å ���� : " + b.getPrice());
		}
		System.out.println();
		*/
	
		
	}



