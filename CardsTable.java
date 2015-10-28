import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.util.Collections;
import javax.swing.*;
import javax.swing.Timer;

public class CardsTable extends JPanel
{
	CardButton b2, b1=null;
	ImageIcon back,front;
	int count;
	ActionListener taskPerformer;
	Timer t1;
	JLabel scorelabel=new JLabel("Score: 0");
	JLabel turnslabel=new JLabel("Turns: 0");
	int score;
	int turns;
	
	ImageIcon[]cardi=new ImageIcon[54];
	CardButton [] cards= new CardButton[54];

	public CardsTable()
	{
		this.setLayout(new GridLayout(5,4));
		Color col=new Color(47,188,61);
		this.setBackground(col);

		back=new ImageIcon(getClass().getResource("b2fv.png"));
		add(scorelabel,5,-1);
		add(turnslabel,5,-1);
		for (int i=0;i<cardi.length;i++)
		{
			int k=i+1;
			cardi[i]=new ImageIcon(getClass().getResource(k+".png"));
			cards[i]=new CardButton(cardi[i],back,(i/4)+1);
			cards[i].addActionListener(new ButtonHandler1());
		}
		Collections.shuffle(Arrays.asList(cards));
		
		for(int p=0;p<54;p++)
		{
			add(cards[p],p/7,p/5);
		}
		
		taskPerformer=new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				JFrame congratulations=new JFrame("Congratulations");
				JLabel congrats=new JLabel("CONGRATULATIONS");
				congratulations.add(congrats);
				congratulations.setVisible(false);
				b1.flipped=b2.flipped=true;
				b1.flip();
				b2.flip();
				if(b1.rank==b2.rank)
				{
					b1.setVisible(false);
					b2.setVisible(false);
					score++;
					scorelabel.setText("Score: "+score);
					if(score==27)
					{
						congratulations.setVisible(true);
					}
				}
				b1=null;
				b2=null;
				turns++;
				turnslabel.setText("Turns: "+turns);
				
			}
		};
		t1=new Timer(1000,taskPerformer);
		t1.setRepeats(false);	
	}

	
	private class ButtonHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			CardButton tempCB=(CardButton) e.getSource();
			if(!tempCB.flipped&&!t1.isRunning())
			{
				if(b1==null)
				{
					b1=tempCB;
				}
				else
				{
					b2=tempCB;
				}
				tempCB.flip();
				count++;
			}
			if(count>1)
			{
				t1.start();
				count=0;
			}
		}
	}

}
