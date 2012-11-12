package model;

import java.awt.Font;
import java.awt.FontMetrics;

import ui.*;

public class BackArrow extends Glyph {
	
	private String str;
	private Font font;
	private FontMetrics fontmetrics;
	
	public BackArrow(Font font){
		this.font = font;
		this.str = " <-- ";
	}
	
	public BackArrow(String str, Font font){
		this.str = str;
		this.font = font;
	}
	
	@Override
	public void draw(IGraphics graphics, int x, int y){
		if (this.fontmetrics == null){
			this.fontmetrics = graphics.getFontMetrics(this.font);
		}
		
		//TODO set the font before drawing		
		graphics.drawString(this.str, x, y);
	}
	
	@Override
	public int getWidth(){
		int width = 0;
		if (this.fontmetrics != null){
			width = this.fontmetrics.stringWidth(this.str);
		}
		
		return width;
	}
	
	@Override
	public int getHeight(){
		int height = 0;
		if (this.fontmetrics != null){
			height = this.fontmetrics.getHeight();
		}
		
		return height;
	}
	
	@Override
	public String toString(){
		return "Arrow Glyph: ["+ this.str + "]";
	}
}