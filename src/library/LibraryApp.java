package library;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        // Khởi tạo thư viện và thêm sách, thành viên
        Library library = new Library();

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(2, "1984", "George Orwell");
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member(1, "Alice");
        Member member2 = new Member(2, "Bob");
        library.addMember(member1);
        library.addMember(member2);

        Scanner scanner = new Scanner(System.in);

        // Giao diện menu điều khiển đơn giản
        while (true) {
            System.out.println("\n1. List Books\n2. List Members\n3. Borrow Book\n4. Return Book\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    library.listBooks(); // Liệt kê sách
                    break;
                case 2:
                    library.listMembers(); // Liệt kê thành viên
                    break;
                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = scanner.nextInt(); // Nhập ID sách để mượn
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt(); // Nhập ID thành viên
                    Member member = findMemberById(library, memberId); // Tìm thành viên theo ID
                    if (member != null) {
                        library.borrowBook(borrowId, member); // Mượn sách
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt(); // Nhập ID sách để trả
                    library.returnBook(returnId); // Trả sách
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close(); // Đóng scanner
                    return; // Thoát chương trình
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    // Phương thức tìm kiếm thành viên theo ID
    private static Member findMemberById(Library library, int memberId) {
//        for (Member member : library.getMembers()) {
//            if (member.getMemberId() == memberId) {
//                return member;
//            }
//        }
        return null;
    }
}
