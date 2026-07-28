package flappyBird;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class GameGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private GameInterface game;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new GameInterface();
	}

	/**
	 * Create the frame.
	 */
	public GameGui(GameInterface game) {
		
		this.game = game;
		
		setTitle("Flappy Bird");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(135, 206, 250));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblBird = new JLabel("O>");
		lblBird.setIconTextGap(0);
		lblBird.setFont(new Font("Lucida Grande", Font.BOLD, 99));
		lblBird.setForeground(new Color(242, 156, 56));
		GridBagConstraints gbc_lblBird = new GridBagConstraints();
		gbc_lblBird.gridwidth = 4;
		gbc_lblBird.gridheight = 2;
		gbc_lblBird.insets = new Insets(0, 0, 5, 5);
		gbc_lblBird.gridx = 1;
		gbc_lblBird.gridy = 1;
		contentPane.add(lblBird, gbc_lblBird);
		
		JLabel lblScreenTitle = new JLabel("FLAPPY BIRD");
		lblScreenTitle.setForeground(new Color(242, 156, 56));
		lblScreenTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 80));
		GridBagConstraints gbc_lblScreenTitle = new GridBagConstraints();
		gbc_lblScreenTitle.gridwidth = 13;
		gbc_lblScreenTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblScreenTitle.gridx = 1;
		gbc_lblScreenTitle.gridy = 4;
		contentPane.add(lblScreenTitle, gbc_lblScreenTitle);
		
		JButton btnStart = new JButton("START");
		btnStart.setBounds(new Rectangle(200, 200, 200, 200));
		btnStart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStart.setBackground(UIManager.getColor("Button.background"));
		btnStart.setForeground(new Color(95, 92, 93));
		btnStart.setFont(new Font("Lucida Grande", Font.BOLD, 50));
		btnStart.setBorder(new LineBorder(new Color(95, 92, 93), 3, true));
		btnStart.setOpaque(true);
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.gridheight = 3;
		gbc_btnStart.gridwidth = 15;
		gbc_btnStart.insets = new Insets(0, 0, 5, 0);
		gbc_btnStart.gridx = 0;
		gbc_btnStart.gridy = 7;
		contentPane.add(btnStart, gbc_btnStart);

	}

}
