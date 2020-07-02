package tetris;

import static org.junit.Assert.*;

import javax.swing.Timer;

import org.junit.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TetrisTest {
	private static Tetris tetris=new Tetris();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public void testTetris() {
		tetris.Initial();
		Assert.assertTrue("��ʼ��ʧ��",tetris.timer.isRunning());
	}
	
	@Test
	public void testSetMode() {
		tetris.SetMode("v6");
		Assert.assertSame("ģʽѡ��ʧ��", BlockV6.Shape , tetris.Shape);
	}

	@Test
	public void testSetPause() {
		tetris.SetPause(false);
		//System.out.print(tetris.timer.isRunning());
		Assert.assertTrue("��ͣ��ť���ֹ���",tetris.timer.isRunning());
	}

}
