package unit15_pong;

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block {
	public Wall() {
		super(0,0,20,600, Color.WHITE);
	}
	public Wall(int x, int y) {
		super (x,y, 20, 600, Color.WHITE);
	}
	
	public Wall(int x, int y, int wid, int ht) {
		super (x,y,wid,ht, Color.WHITE);
	}
	
	public Wall (int x, int y, int wid, int ht, Color col) {
		super (x,y,wid,ht,col);
	}
}