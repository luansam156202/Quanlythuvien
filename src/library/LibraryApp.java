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
        textArea.setEditable(false); // Không cho phép chỉnh sửa

        // Setup UI
        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        // Create a main panel with BorderLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));  // Add space between components

        // Create the control panel (where the buttons are placed)
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(1, 4, 10, 10)); // Arrange buttons in a row

        // Buttons for different actions
        JButton addBookButton = new JButton("Add Book");
        JButton listBooksButton = new JButton("List Books");
        JButton borrowBookButton = new JButton("Borrow Book");
        JButton returnBookButton = new JButton("Return Book");

        // Add action listeners to buttons
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
                textArea.setText("");  // Clear text area
                for (Book book : library.getBooks()) {
                    textArea.append("ID: " + book.getId() + " Title: " + book.getTitle() +
                            " Author: " + book.getAuthor() + " Available: " + book.isAvailable() + "\n");
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

        // Add buttons to the control panel
        controlPanel.add(addBookButton);
        controlPanel.add(listBooksButton);
        controlPanel.add(borrowBookButton);
        controlPanel.add(returnBookButton);

        // Add control panel to the main panel (top section)
        mainPanel.add(controlPanel, BorderLayout.NORTH);

        // Add the text area inside a JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Add main panel to the JFrame
        add(mainPanel);

        // Set a background color for the JFrame (optional)
        getContentPane().setBackground(new Color(240, 240, 240));  // Light grey background
    }

//    public static void main(String[] args) {
//        LibraryApp app = new LibraryApp();
//        app.setVisible(true);
//    }
}
