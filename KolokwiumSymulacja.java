import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class KolokwiumSymulacja extends JFrame implements ActionListener {
	
	JTextField pole_rzuty;
	JTextField pole_sciany_kostki;
	JButton start;
	JTextField pole_dolne;
	
	JLabel label_podpis_rzuty;
	JLabel label_pusty;
	JLabel label_podpis_odsetek;
	JLabel label_pusty_2;
	JLabel label_podpis_sciany_kostki;
	
	public int losowaLiczba;
	
	public static void main(String[] args) {
		
		KolokwiumSymulacja frame = new KolokwiumSymulacja();
		frame.initUI();

	}

	private void initUI() {
		
		pole_rzuty = new JTextField();
		pole_sciany_kostki = new JTextField();
		
		start = new JButton("Start symulacji");
		start.addActionListener(this);
		
		pole_dolne = new JTextField();
		
		label_pusty = new JLabel();
		label_podpis_odsetek = new JLabel("Odsetek wylosowanych jedynek:");
		label_podpis_rzuty = new JLabel("Wprowadz liczbê rzutów");
		label_podpis_sciany_kostki = new JLabel("Wprowadz liczbê œcian kostki");
		label_pusty_2 = new JLabel();
		
		this.add(label_podpis_rzuty);
		this.add(label_podpis_sciany_kostki);
		this.add(label_pusty_2);
		this.add(pole_rzuty);
		this.add(pole_sciany_kostki);
		this.add(start);
		this.add(label_podpis_odsetek);
		this.add(label_pusty);
		this.add(pole_dolne);

		this.setLayout(new GridLayout(3, 3));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(600, 300);
		this.setVisible(true);
		this.setTitle("Symulacja");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(start.equals(e.getSource())) {
			
			symulacja();
			
		}
		
	}

	private void symulacja() {
		
		String pole_k = pole_rzuty.getText();
		int liczba_k = Integer.parseInt(pole_k);
		
		String pole_n = pole_sciany_kostki.getText();
		int liczba_n = Integer.parseInt(pole_n);
		
		Random losowy = new Random();
		
		int licz = 0;
		
		for(int i = 0; i <= liczba_k; i++) {
			
			losowaLiczba = 1 + losowy.nextInt((liczba_k - 1)+1);
			
		}
		
		if(losowaLiczba == 1) {
			licz++;
		}
		
		float wynik_dolny = (float) licz/liczba_n;
		pole_dolne.setText(String.valueOf(wynik_dolny));
		
	}

}
