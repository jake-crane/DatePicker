import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Test extends JFrame {

	public Test() {

		DatePicker datePicker = new DatePicker();
		datePicker.setMinimumYear(1800);
		System.out.println(datePicker.getFormattedDate());

		datePicker.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Test action start");
				System.out.println("Test: " + datePicker.getFormattedDate());
				System.out.println("Test action end\n");
			}
		});

		add(datePicker);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Test();
	}
}