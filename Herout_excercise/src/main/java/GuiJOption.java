import javax.swing.*;

public class GuiJOption {

    public static void main (String[] args){

        String mood = JOptionPane.showInputDialog("How's your mood today?");
        JOptionPane.showMessageDialog(null, "Your mood is: " + mood);

        int scope = Integer.parseInt(JOptionPane.showInputDialog("Write down a scope of your mood, please."));
        JOptionPane.showMessageDialog(null, "Your scope for mood is: " + scope);

    }

}
