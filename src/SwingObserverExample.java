import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
    JFrame frame;
    public static void main (String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go(){
        frame = new JFrame();

        JButton button=new JButton("should I do it?");

        // button.addActionListener(new AngelListener());
        // button.addActionListener(new DevilListener());

        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));
    }

    // class AngelListener implements ActionListener{
    //     public void actionPerformed(ActionEvent event){
    //         System.out.println("Don't do it, you might regret it!");
    //     }
    // }
    // class DevilListener implements ActionListener{
    //     public void actionPerformed(ActionEvent event){
    //         System.out.println("Come on, do it!");
    //     }
    // }
}
