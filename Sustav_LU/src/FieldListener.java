
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabrijela
 */
public class FieldListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextField field = (JTextField)e.getSource();
        }
}
