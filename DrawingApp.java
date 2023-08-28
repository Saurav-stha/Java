import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DrawingApp extends JFrame {
    private JPanel canvas;
    private JButton clearButton;
    private JButton saveButton;
    private BufferedImage image;
    private Graphics2D graphics2D;

    public DrawingApp() {
        setTitle("Drawing App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (image != null) {
                    g.drawImage(image, 0, 0, this);
                }
            }
        };
        
        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                graphics2D.setColor(Color.BLACK);
                graphics2D.setStroke(new BasicStroke(2));
                graphics2D.drawLine(e.getX(), e.getY(), e.getX(), e.getY());
                canvas.repaint();
            }
        });
        
        canvas.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                graphics2D.drawLine(e.getX(), e.getY(), e.getX(), e.getY());
                canvas.repaint();
            }
        });

        clearButton = new JButton("Clear Canvas");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                graphics2D.setPaint(Color.WHITE);
                graphics2D.fillRect(0, 0, image.getWidth(), image.getHeight());
                canvas.repaint();
            }
        });

        saveButton = new JButton("Save Drawing");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(DrawingApp.this);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    
                    // Ensure the file has the .png extension
                    if (!file.getName().toLowerCase().endsWith(".png")) {
                        file = new File(file.getParentFile(), file.getName() + ".png");
                    }
                    
                    try {
                        ImageIO.write(image, "PNG", file);
                        JOptionPane.showMessageDialog(DrawingApp.this, "Drawing saved successfully!");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });


        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(canvas, BorderLayout.CENTER);
        contentPane.add(clearButton, BorderLayout.NORTH);
        contentPane.add(saveButton, BorderLayout.SOUTH);

        image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
        graphics2D = image.createGraphics();
        graphics2D.setPaint(Color.WHITE);
        graphics2D.fillRect(0, 0, image.getWidth(), image.getHeight());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawingApp app = new DrawingApp();
            app.setVisible(true);
        });
    }
}
