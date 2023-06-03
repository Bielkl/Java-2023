package relgio1;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

public class horas {


	public class Relogio extends JFrame implements Runnable {
	    private JLabel labelHora;

	    public Relogio() {
	        setTitle("Relógio");
	        setSize(200, 100);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        labelHora = new JLabel();
	        labelHora.setFont(new Font("Arial", Font.BOLD, 30));
	        labelHora.setHorizontalAlignment(JLabel.CENTER);
	        getContentPane().add(labelHora);

	        Thread thread = new Thread(this);
	        thread.start();
	    }

	    public void run() {
	        while (true) {
	            Calendar calendar = Calendar.getInstance();
	            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	            labelHora.setText(format.format(calendar.getTime()));
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Relogio relogio = new Relogio();
	        relogio.setVisible(true);
	    }

		private void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}
	}
}
