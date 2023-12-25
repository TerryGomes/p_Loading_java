package l2mv;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;


public class Loading extends JFrame{


	private static final long serialVersionUID = 1L;
	JLabel porcentagem;
	JProgressBar progresso_1;
	JProgressBar progresso_2;
	private JLabel lblNewLabel;

	public Loading(){
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		porcentagem = new JLabel("100");
		porcentagem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		porcentagem.setBounds(121, 397, 149, 56);
		getContentPane().add(porcentagem);

		progresso_1 = new JProgressBar();
		progresso_1.setBounds(12, 373, 612, 14);
		getContentPane().add(progresso_1);

		progresso_2 = new JProgressBar();
		progresso_2.setBounds(12, 346, 610, 14);
		getContentPane().add(progresso_2);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(524, 430, 100, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VERIFICAR");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		btnNewButton_1.setBounds(524, 397, 100, 23);
		getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Eclipse\\Edit\\Projeto_Loading\\img\\loading .gif"));
		lblNewLabel.setBounds(12, 386, 64, 75);
		getContentPane().add(lblNewLabel);


	}


	public void start(){
		Loading loading = new Loading();
		loading.setVisible(true);

		try{
			for (int i = 0; i <= 100; i++){
				Thread.sleep(10);
				loading.progresso_1.setValue(i);
				loading.porcentagem.setText(Integer.toString(i) + "%");
				for (int l = 0; l <= 100; l++){
					Thread.sleep(15);
					loading.progresso_2.setValue(l);
					loading.porcentagem.setText(Integer.toString(l) + "%");
				}
			}
		}catch(InterruptedException e){
			JOptionPane.showConfirmDialog(null, "Error!!");
		}

	}
}
