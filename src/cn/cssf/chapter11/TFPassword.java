package cn.cssf.chapter11;

import java.awt.*;
import java.awt.event.*;

public class TFPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TFFrame3();
	}

}

class TFFrame3 extends Frame
{
	TFFrame3()
	{
		TextField tf = new TextField();
		add(tf);
		tf.addActionListener(new TFActionListener2());
		tf.setEchoChar('*');
		pack();
		setVisible(true);
	}
}

class TFActionListener2 implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		TextField tf = (TextField)e.getSource();
		System.out.println(tf.getText());
		tf.setText("");
	}
}
