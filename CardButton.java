import javax.swing.*;

public class CardButton extends JButton
{
	ImageIcon front, back;
	boolean flipped;
	int rank;
	public CardButton(ImageIcon front,ImageIcon back,int rank)
	{
		this.front=front;
		this.back=back;
		this.rank=rank;
		flipped=true;
		flip();
	}
	public void flip()
	{
		flipped=!flipped;
		if(flipped)
			this.setIcon(front);
		else
			this.setIcon(back);
	}

}
