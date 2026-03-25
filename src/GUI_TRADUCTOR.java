import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI_TRADUCTOR extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_español;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_TRADUCTOR frame = new GUI_TRADUCTOR();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_TRADUCTOR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_español = new JLabel("ESPAÑOL");
		lbl_español.setBounds(23, 41, 71, 13);
		contentPane.add(lbl_español);
		
		JLabel lbl_titulo = new JLabel("TRADUCTOR");
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setBounds(136, 10, 92, 13);
		contentPane.add(lbl_titulo);
		
		text_español = new JTextField();
		text_español.setBounds(99, 36, 245, 18);
		contentPane.add(text_español);
		text_español.setColumns(10);
		
		JLabel lbl_ingles = new JLabel(".");
		lbl_ingles.setBounds(23, 89, 146, 13);
		contentPane.add(lbl_ingles);
		
		JButton btn_ingles = new JButton("TRADUCIR AL INGLES");
		btn_ingles.setBounds(179, 85, 165, 20);
		contentPane.add(btn_ingles);
		
		JLabel lbl_imagen = new JLabel(".");
		lbl_imagen.setBounds(113, 183, 165, 47);
		contentPane.add(lbl_imagen);
		
		JButton btn_imagen = new JButton("MOSTRAR IMAGEN RELACIONADA");
		btn_imagen.setBounds(23, 135, 321, 20);
		contentPane.add(btn_imagen);

	}
}
