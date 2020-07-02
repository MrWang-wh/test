package tetris;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tetris.Tetris;
import javax.swing.*;
public class MainGUI extends JFrame{
	Tetris tetris=new Tetris();
	public MainGUI() {
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(320, 350);
		this.setTitle("Tetris");
		this.setResizable(false);
		JMenuBar menu = new JMenuBar();
		this.setJMenuBar(menu);
		JMenu gameMenu = new JMenu("游戏");
		JMenuItem newGameItem = gameMenu.add("新游戏");
		newGameItem.addActionListener(this.NewGameAction);
		JMenuItem pauseItem = gameMenu.add("暂停");
		pauseItem.addActionListener(this.PauseAction);
		JMenuItem continueItem = gameMenu.add("继续");
		continueItem.addActionListener(this.ContinueAction);
		JMenuItem exitItem = gameMenu.add("退出");
		exitItem.addActionListener(this.ExitAction);
		JMenu modeMenu = new JMenu("模式");
		JMenuItem v4Item = modeMenu.add("4方块");
		v4Item.addActionListener(this.v4Action);
		JMenuItem v6Item = modeMenu.add("6方块");
		v6Item.addActionListener(this.v6Action);
		JMenu helpMenu = new JMenu("帮助");
		JMenuItem aboutItem = helpMenu.add("关于");
		aboutItem.addActionListener(this.AboutAction);
		menu.add(gameMenu);
		menu.add(modeMenu);
		menu.add(helpMenu);
		getContentPane().add(this.tetris);
		this.tetris.setFocusable(true);
	}
	static public void main(String... args) {
		MainGUI MainGUI = new MainGUI();
		MainGUI.setVisible(true);
	}
	ActionListener NewGameAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			MainGUI.this.tetris.Initial();
		}
	};

	ActionListener PauseAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			MainGUI.this.tetris.SetPause(true);
		}
	};

	ActionListener ContinueAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			MainGUI.this.tetris.SetPause(false);
		}
	};

	ActionListener ExitAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			System.exit(0);
		}
	};

	ActionListener AboutAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			JOptionPane.showMessageDialog(MainGUI.this, "Tetris Version 1.0", "关于", JOptionPane.WARNING_MESSAGE);
		}
	};

	ActionListener v4Action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			MainGUI.this.tetris.SetMode("v4");
		}
	};

	ActionListener v6Action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			MainGUI.this.tetris.SetMode("v6");
		}
	};
}
