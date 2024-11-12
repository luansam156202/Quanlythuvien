package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryApp extends JFrame {
    private Library library;
    private JTextArea textArea;

    public LibraryApp() {
        library = new Library();
        textArea = new JTextArea();
        textArea.setEditable(false);

        // Setup UI
        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panels
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Buttons
        JButton addBookButton = new JButton("Add Book");
        JButton listBooksButton = new JButton("List Books");
        JButton borrowBookButton = new JButton("Borrow Book");
        JButton returnBookButton = new JButton("Return Book");

        // Add components to panel
        panel.add(addBookButton);
        panel.add(listBooksButton);
        panel.add(borrowBookButton);
        panel.add(returnBookButton);
        panel.add(new JScrollPane(textArea));

        // Add panel to frame
        add(panel);

        // Action listeners
        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = JOptionPane.showInputDialog("Enter book title:");
                String author = JOptionPane.showInputDialog("Enter book author:");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter book ID:"));
                Book book = new Book(id, title, author);
                library.addBook(book);
                textArea.append("Book added: " + title + " by " + author + "\n");
            }
        });

        listBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                for (Book book : library.getBooks()) {
                    textArea.append("ID: " + book.getId() + " Title: " + book.getTitle() + " Author: " + book.getAuthor() + " Available: " + book.isAvailable() + "\n");
                }
            }
        });

        borrowBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter book ID to borrow:"));
                Book book = library.getBookById(id);
                if (book != null && book.isAvailable()) {
                    book.borrowBook();
                    textArea.append("Book borrowed: " + book.getTitle() + "\n");
                } else {
                    textArea.append("Book not available or not found\n");
                }
            }
        });

        returnBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter book ID to return:"));
                Book book = library.getBookById(id);
                if (book != null && !book.isAvailable()) {
                    book.returnBook();
                    textArea.append("Book returned: " + book.getTitle() + "\n");
                } else {
                    textArea.append("Book not found or not borrowed\n");
                }
            }
        });
    }

    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.setVisible(true);
    }
}
