package radiobuttondemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame {
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private ButtonGroup group;
    private JLabel imageLabel;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        birdButton.setBounds(50, 20, 100, 50);
        catButton.setBounds(50, 50, 100, 50);
        dogButton.setBounds(50, 80, 100, 50);
        rabbitButton.setBounds(50, 110, 100, 50);
        pigButton.setBounds(50, 140, 100, 50);

        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Image display
        imageLabel = new JLabel();
        imageLabel.setBounds(300, 50, 700, 600);

        // Add components
        add(birdButton); add(catButton); add(dogButton);
        add(rabbitButton); add(pigButton); add(imageLabel);

        // image paths
        birdButton.addActionListener(e -> updatePet("Bird", "/images/bird.png"));
        catButton.addActionListener(e -> updatePet("Cat", "/images/cat.png"));
        dogButton.addActionListener(e -> updatePet("Dog", "/images/dog.png"));
        rabbitButton.addActionListener(e -> updatePet("Rabbit", "/images/rabbit.png"));
        pigButton.addActionListener(e -> updatePet("Pig", "/images/pig.png"));
    }
    
     private void updatePet(String petName, String imagePath) {
        JOptionPane.showMessageDialog(this, petName + " has been selected");
        imageLabel.setIcon(new ImageIcon(getClass().getResource(imagePath)));
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RadioButtonDemo demo = new RadioButtonDemo();
            demo.setVisible(true);
        });
    }


}
