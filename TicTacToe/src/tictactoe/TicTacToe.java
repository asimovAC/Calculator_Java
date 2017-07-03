package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class TicTacToe {

	private JFrame frame;
	private String startGame = "X";
	private int XCount = 0;
	private int OCount = 0;
	private JLabel CountX ;
	private AbstractButton Count_O;
	private JLabel btn1;
	private JLabel btn2;
	private JLabel btn3;
	private JLabel btn4;
	private JLabel btn5;
	private JLabel btn6;
	private JLabel btn7;
	private JLabel btn8;
	private JLabel btn9;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
		
		//gameScore();
	}
	
	private void winningGame()
	{
		String b1 = btn1.getText();
		String b2 = btn2.getText();
		String b3 = btn3.getText();
		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();
		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();
		
		if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			XCount++;
		}
		
		if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			XCount++;
		}
		
		if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			XCount++;
		}
		
		if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			XCount++;
		}
		
		if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			XCount++;
		}
		
		if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			XCount++;
		}
		
		if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			XCount++;
		}
		
		
		///////////////Player O Winning //////////////////////////////
		
		
		if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			OCount++;
		}
		
		if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			OCount++;
		}
		
		if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			OCount++;
		}
		
		if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			OCount++;
		}
		
		if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			OCount++;
		}
		
		if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			OCount++;
		}
		
		if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
		{
			JOptionPane.showMessageDialog(frame, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			OCount++;
		}
		
	}

	private void gameScore()
	{
		CountX.setText(String.valueOf(XCount));
		Count_O.setText(String.valueOf(OCount));
	}
	
	private void choosePlayer()
	{
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame = "O";
		}
		else
		{
			startGame = "X";
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 761, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btn1 = new JButton(" ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn1.setBackground(Color.CYAN);
				}
				else
				{
					btn1.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn1.setBounds(0, 0, 146, 148);
		panel_1.add(btn1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn2.setBackground(Color.CYAN);
				}
				else
				{
					btn2.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn2.setBounds(0, 0, 146, 148);
		panel_4.add(btn2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn3.setBackground(Color.CYAN);
				}
				else
				{
					btn3.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn3.setBounds(0, 0, 146, 148);
		panel_5.add(btn3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player X");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(25, 53, 87, 46);
		panel_3.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel CountX = new JLabel("X");
		CountX.setBounds(50, 67, 46, 14);
		panel_2.add(CountX);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn4.setBackground(Color.CYAN);
				}
				else
				{
					btn4.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn4.setBounds(0, 0, 146, 148);
		panel_6.add(btn4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn5.setBackground(Color.CYAN);
				}
				else
				{
					btn5.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn5.setBounds(0, 0, 146, 148);
		panel_7.add(btn5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn6.setBackground(Color.CYAN);
				}
				else
				{
					btn6.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn6.setBounds(0, 0, 146, 148);
		panel_8.add(btn6);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Player O");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(27, 65, 98, 40);
		panel_9.add(lblNewLabel_1);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel Count_O = new JLabel("O");
		Count_O.setHorizontalAlignment(SwingConstants.CENTER);
		Count_O.setFont(new Font("Tahoma", Font.BOLD, 28));
		Count_O.setBounds(28, 67, 95, 34);
		panel_10.add(Count_O);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(null);
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn7.setBackground(Color.CYAN);
				}
				else
				{
					btn7.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn7.setBounds(0, 0, 146, 148);
		panel_11.add(btn7);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(null);
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn8.setBackground(Color.CYAN);
				}
				else
				{
					btn8.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn8.setBounds(0, 0, 146, 148);
		panel_12.add(btn8);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(null);
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn9.setBackground(Color.CYAN);
				}
				else
				{
					btn9.setBackground(Color.LIGHT_GRAY);
				}
				choosePlayer();
				winningGame();
			}
		});
		btn9.setBounds(0, 0, 146, 148);
		panel_13.add(btn9);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				
				btn1.setBackground(Color.lightGray);
				btn2.setBackground(Color.lightGray);
				btn3.setBackground(Color.lightGray);
				btn4.setBackground(Color.lightGray);
				btn5.setBackground(Color.lightGray);
				btn6.setBackground(Color.lightGray);
				btn7.setBackground(Color.lightGray);
				btn8.setBackground(Color.lightGray);
				btn9.setBackground(Color.lightGray);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnReset.setBounds(0, 0, 146, 148);
		panel_14.add(btnReset);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm for Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnExit.setBounds(0, 0, 146, 148);
		panel_15.add(btnExit);
	}
	

}
