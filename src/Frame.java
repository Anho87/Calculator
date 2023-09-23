import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JButton butOne, butTwo, butThree, butFour, butFive,
            butSix, butSeven, butEight, butNine, butZero, butEquals,
            butReset, butAdd, butMin, butMulti, butDiv;
    JTextArea textArea;
    double numberOne, numberTwo, result;
    String string;
   Frame(){

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(250,330);
        this.setResizable(false);


        JPanel mainPanel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4));

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(215,50));
        textArea.setFont(new Font("Consolas", Font.PLAIN,20));
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        textPanel.add(textArea);

        mainPanel.add(textPanel);
        mainPanel.add(buttonPanel);

       butOne = new JButton("1");
       butOne.addActionListener(this);
       buttonPanel.add(butOne);
       butOne.setPreferredSize(new Dimension(55,55));

       butTwo = new JButton("2");
       butTwo.addActionListener(this);
       buttonPanel.add(butTwo);
       butTwo.setPreferredSize(new Dimension(55,55));

       butThree = new JButton("3");
       butThree.addActionListener(this);
       buttonPanel.add(butThree);
       butThree.setPreferredSize(new Dimension(55,55));

       butAdd = new JButton("+");
       butAdd.addActionListener(this);
       buttonPanel.add(butAdd);
       butAdd.setPreferredSize(new Dimension(55,55));

       butFour = new JButton("4");
       butFour.addActionListener(this);
       buttonPanel.add(butFour);
       butFour.setPreferredSize(new Dimension(55,55));

       butFive = new JButton("5");
       butFive.addActionListener(this);
       buttonPanel.add(butFive);
       butFive.setPreferredSize(new Dimension(55,55));

       butSix = new JButton("6");
       butSix.addActionListener(this);
       buttonPanel.add(butSix);
       butSix.setPreferredSize(new Dimension(55,55));

       butMin = new JButton("-");
       butMin.addActionListener(this);
       buttonPanel.add(butMin);
       butMin.setPreferredSize(new Dimension(55,55));

       butSeven = new JButton("7");
       butSeven.addActionListener(this);
       buttonPanel.add(butSeven);
       butSeven.setPreferredSize(new Dimension(55,55));

       butEight = new JButton("8");
       butEight.addActionListener(this);
       buttonPanel.add(butEight);
       butEight.setPreferredSize(new Dimension(55,55));

       butNine = new JButton("9");
       butNine.addActionListener(this);
       buttonPanel.add(butNine);
       butNine.setPreferredSize(new Dimension(55,55));

       butMulti = new JButton("*");
       butMulti.addActionListener(this);
       buttonPanel.add(butMulti);
       butMulti.setPreferredSize(new Dimension(55,55));

       butReset = new JButton("C");
       butReset.addActionListener(this);
       buttonPanel.add(butReset);
       butReset.setPreferredSize(new Dimension(55,55));

       butZero = new JButton("0");
       butZero.addActionListener(this);
       buttonPanel.add(butZero);
       butZero.setPreferredSize(new Dimension(55,55));

       butEquals = new JButton("=");
       butEquals.addActionListener(this);
       buttonPanel.add(butEquals);
       butEquals.setPreferredSize(new Dimension(55,55));

       butDiv = new JButton("/");
       butDiv.addActionListener(this);
       buttonPanel.add(butDiv);
       butDiv.setPreferredSize(new Dimension(55,55));

       this.add(mainPanel);
       this.setLocationRelativeTo(null);
       this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource() == butOne){
                textArea.append(butOne.getText());
           }
           else if(e.getSource() == butTwo){
               textArea.append(butTwo.getText());
           }
           else if(e.getSource() == butThree){
               textArea.append(butThree.getText());
           }
           else if(e.getSource() == butFour){
               textArea.append(butFour.getText());
           }
           else if(e.getSource() == butFive){
               textArea.append(butFive.getText());
           }
           else if(e.getSource() == butSix){
               textArea.append(butSix.getText());
           }
           else if(e.getSource() == butSeven){
               textArea.append(butSeven.getText());
           }
           else if(e.getSource() == butEight){
               textArea.append(butEight.getText());
           }
           else if(e.getSource() == butNine){
               textArea.append(butNine.getText());
           }
           else if(e.getSource() == butZero){
               textArea.append(butZero.getText());
           }
           else if(e.getSource() == butEquals){
               numberTwo = Double.parseDouble(textArea.getText());
               textArea.selectAll();
               textArea.replaceSelection("");
               Calculations(string);
               textArea.append(String.valueOf(result));
           }
           else if(e.getSource() == butReset){
               textArea.selectAll();
               textArea.replaceSelection("");
           }
           else if(e.getSource() == butAdd){
               numberOne = Double.parseDouble(textArea.getText());
               string = "+";
               textArea.selectAll();
               textArea.replaceSelection("");
           }
           else if(e.getSource() == butMin){
               numberOne = Double.parseDouble(textArea.getText());
               string = "-";
               textArea.selectAll();
               textArea.replaceSelection("");
           }
           else if(e.getSource() == butMulti){
               numberOne = Double.parseDouble(textArea.getText());
               string = "*";
               textArea.selectAll();
               textArea.replaceSelection("");
           }
           else if(e.getSource() == butDiv){
               numberOne = Double.parseDouble(textArea.getText());
               string = "/";
               textArea.selectAll();
               textArea.replaceSelection("");
           }
    }

    public double Calculations(String string){

       switch(string){
           case "+": result = numberOne + numberTwo;
           break;
           case "-": result = numberOne - numberTwo;
           break;
           case "*": result = numberOne * numberTwo;
           break;
           case "/": result = numberOne / numberTwo;
       }
       return result;
    }
}
