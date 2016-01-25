import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

class AModel extends DefaultComboBoxModel{
	AModel(String[] s){
		for (int i=0;i<s.length;i++)
			addElement(s[i]);
	}
}

class DevicesSelected extends JFrame{
	public DevicesSelected(){
		init();
	}
	
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}
	
	public void disappear(){
		this.setVisible(false);
	}
	
	public void setDefaultCloseOperation() {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init(){
		this.setSize(400,300);
		this.setTitle("Choose devices");
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.RELATIVE;
		constraints.weightx=4;
		constraints.weighty=6;
		
		JRadioButton jr1=new JRadioButton("Air Conditioner");
		JRadioButton jr2=new JRadioButton("Fridge");
		JRadioButton jr3=new JRadioButton("Light");
		JRadioButton jr4=new JRadioButton("Fan");
		JRadioButton jr5=new JRadioButton("Water heater");
		JRadioButton jr6=new JRadioButton("Warmer");

		add(jr1,constraints,0,1,1,1);
		add(jr2,constraints,1,1,1,1);
		add(jr3,constraints,2,1,1,1);
		add(jr4,constraints,0,2,1,1);
		add(jr5,constraints,1,2,1,1);
		add(jr6,constraints,2,2,1,1);
		
		JButton button1=new JButton("Confirm");
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				int i=JOptionPane.showConfirmDialog(null,"Please confirm your choices again!","Exit confirmation dialog box",JOptionPane.YES_NO_CANCEL_OPTION);
				if (i==0){
					disappear();
					setDefaultCloseOperation();
				}
			}
		});
		
		JButton button2=new JButton("Cancel");
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				int i=JOptionPane.showConfirmDialog(null,"Do you want to exit the program?","Exit confirmation dialog box",JOptionPane.YES_NO_CANCEL_OPTION);
				if (i==0){
					disappear();
					setDefaultCloseOperation();
				}
			}
		});
		
		add(button1,constraints,0,3,1,1);
		add(button2,constraints,2,3,1,1);
	}
}

class RulesSelected extends JFrame{
	public RulesSelected(){
		init();
	}
	
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}
	
	public void disappear(){
		this.setVisible(false);
	}
	
	public void setDefaultCloseOperation() {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init(){
		this.setSize(700,100);
		this.setTitle("Set Rules");
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.RELATIVE;
		constraints.weightx=8;
		constraints.weighty=3;
		
		String[] devices={"Air conditioner","Fridge","Light","Fan","Water heater","Warmer"};
		String[] status={"Brightness","ON","OFF"};
		JLabel iflabel=new JLabel("IF");
		JLabel thenlabel=new JLabel("THEN");
		ComboBoxModel mode2=new AModel(devices);
		JComboBox combo2=new JComboBox(mode2);
		ComboBoxModel mode3=new AModel(status);
		JComboBox combo3=new JComboBox(mode3);
		ComboBoxModel mode4=new AModel(devices);
		JComboBox combo4=new JComboBox(mode4);
		ComboBoxModel mode5=new AModel(status);
		JComboBox combo5=new JComboBox(mode5);

		
		add(iflabel,constraints,0,1,1,1);
		add(combo2,constraints,1,1,1,1);
		add(combo3,constraints,2,1,1,1);
		add(thenlabel,constraints,3,1,1,1);
		add(combo4,constraints,4,1,1,1);
		add(combo5,constraints,5,1,1,1);
		
		JButton button1=new JButton("Confirm");
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				int i=JOptionPane.showConfirmDialog(null,"Please confirm your choices again!","Exit confirmation dialog box",JOptionPane.YES_NO_CANCEL_OPTION);
				if (i==0){
					disappear();
					setDefaultCloseOperation();
				}
			}
		});
		
		JButton button2=new JButton("Cancel");
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				int i=JOptionPane.showConfirmDialog(null,"Do you want to exit the program?","Exit confirmation dialog box",JOptionPane.YES_NO_CANCEL_OPTION);
				if (i==0){
					disappear();
					setDefaultCloseOperation();
				}
			}
		});
		
		add(button1,constraints,2,2,1,1);
		add(button2,constraints,4,2,1,1);
	}
}


class SpecificationSelected extends JFrame{
	public SpecificationSelected(){
		init();
	}
	
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}
	
	public void disappear(){
		this.setVisible(false);
	}
	
	public void setDefaultCloseOperation() {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init(){
		this.setSize(700,100);
		this.setTitle("Set Specifications");
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.RELATIVE;
		constraints.weightx=8;
		constraints.weighty=3;
		
		String[] devices={"Air conditioner","Fridge","Light","Fan","Water heater","Warmer"};
		String[] status={"Brightness","ON","OFF"};
		JLabel iflabel=new JLabel("IF");
		JLabel thenlabel=new JLabel("THEN");
		ComboBoxModel mode2=new AModel(devices);
		JComboBox combo2=new JComboBox(mode2);
		ComboBoxModel mode3=new AModel(status);
		JComboBox combo3=new JComboBox(mode3);
		ComboBoxModel mode4=new AModel(devices);
		JComboBox combo4=new JComboBox(mode4);
		ComboBoxModel mode5=new AModel(status);
		JComboBox combo5=new JComboBox(mode5);

		
		add(iflabel,constraints,0,1,1,1);
		add(combo2,constraints,1,1,1,1);
		add(combo3,constraints,2,1,1,1);
		add(thenlabel,constraints,3,1,1,1);
		add(combo4,constraints,4,1,1,1);
		add(combo5,constraints,5,1,1,1);
		
		JButton button1=new JButton("Confirm");
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				int i=JOptionPane.showConfirmDialog(null,"Please confirm your choices again!","Exit confirmation dialog box",JOptionPane.YES_NO_CANCEL_OPTION);
				if (i==0){
					disappear();
					setDefaultCloseOperation();
				}
			}
		});
		
		JButton button2=new JButton("Cancel");
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				int i=JOptionPane.showConfirmDialog(null,"Do you want to exit the program?","Exit confirmation dialog box",JOptionPane.YES_NO_CANCEL_OPTION);
				if (i==0){
					disappear();
					setDefaultCloseOperation();
				}
			}
		});
		
		add(button1,constraints,2,2,1,1);
		add(button2,constraints,4,2,1,1);
	}
}

class RuleList extends MouseAdapter {
	JList list=null;
	DefaultListModel model=null;
	String[] s={"IF Fridge.Status On THEN Light.Status Off.","C","C++","C#","Pathon","1","2","3","4","5"};
	
	class DataModel extends DefaultListModel{
		DataModel(int flag){
			if (flag==1)
				for (int i=0;i<s.length;i++)
					addElement(s[i]);
		}
	}
	
	public RuleList(){
		JFrame jf=new JFrame("Rules List");
		
		Container contentPane=jf.getContentPane();
		contentPane.setLayout(null);
		model=new DataModel(1);
		list=new JList(model);
		list.setBorder(BorderFactory.createTitledBorder("Rules"));
		list.addMouseListener(this);


		JScrollPane roll=new JScrollPane(list);
		roll.setBounds(new Rectangle(20,10,400,200));
		contentPane.add(roll);

		jf.setSize(440, 240);
		jf.setLocation(400,250);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(Window e){
				System.exit(0);
			}
		});
	}
	
	public void mouseClicked(MouseEvent e){
		int index;
		if (e.getSource()==list){
			if (e.getClickCount()==2){
				index=list.locationToIndex(e.getPoint());
				Object options[]={"Delete","Modify","Cancel"};
				int val=JOptionPane.showOptionDialog(null,"Choose the operation you want.","Reminder",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[2]);
				if (val==0)
					model.removeElementAt(index);
				else if (val==1){
//					System.out.println("Modify");
					final JFrame jf1=new RulesSelected();
					jf1.setLocation(320,300);
					jf1.setVisible(true);
				}
				list.setModel(model);
			}
		}
	}
}


class DeviceList extends MouseAdapter {
	JList list=null;
	DefaultListModel model=null;
	String[] s={"Fridge","Light","Air Conditioner","Door","Warmer","Fan","Computer","Window","Alarm","Heater"};
	
	class DataModel extends DefaultListModel{
		DataModel(int flag){
			if (flag==1)
				for (int i=0;i<s.length;i++)
					addElement(s[i]);
		}
	}
	
	public DeviceList(){
		JFrame jf=new JFrame("Devices List");
		
		Container contentPane=jf.getContentPane();
		contentPane.setLayout(null);
		model=new DataModel(1);
		list=new JList(model);
		list.setBorder(BorderFactory.createTitledBorder("Devices"));
		list.addMouseListener(this);


		JScrollPane roll=new JScrollPane(list);
		roll.setBounds(new Rectangle(20,10,400,200));
		contentPane.add(roll);

		jf.setSize(440, 240);
		jf.setLocation(400,250);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(Window e){
				System.exit(0);
			}
		});
	}
	
	public void mouseClicked(MouseEvent e){
		int index;
		if (e.getSource()==list){
			if (e.getClickCount()==2){
				index=list.locationToIndex(e.getPoint());
				Object options[]={"Delete","Cancel"};
				int val=JOptionPane.showOptionDialog(null,"Choose the operation you want.","Reminder",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[1]);
				if (val==0)
					model.removeElementAt(index);
				else if (val==1){
//					System.out.println("Modify");
//					final JFrame jf1=new DevicesSelected();
//					jf1.setLocation(320, 300);
//					jf1.setVisible(true);
				}
				list.setModel(model);
			}
		}
	}
}

class SpeList extends MouseAdapter {
	JList list=null;
	DefaultListModel model=null;
	String[] s={"IF Fridge.Status==ON THEN Light.Status=OFF.","IF Temperature > 30 THEN Air-Conditioner.status=ON.",
			"IF Temperature < 20 THEN Air-Conditioner Status=OFF.","IF Door.Status==Open THEN Light.Status=ON.",
			"IF Smoke THEN Alarm.Status=ON.","1","2","3","4","5"};
	
	class DataModel extends DefaultListModel{
		DataModel(int flag){
			if (flag==1)
				for (int i=0;i<s.length;i++)
					addElement(s[i]);
		}
	}
	
	public SpeList(){
		JFrame jf=new JFrame("Specifications List");
		
		Container contentPane=jf.getContentPane();
		contentPane.setLayout(null);
		model=new DataModel(1);
		list=new JList(model);
		list.setBorder(BorderFactory.createTitledBorder("Specifications"));
		list.addMouseListener(this);


		JScrollPane roll=new JScrollPane(list);
		roll.setBounds(new Rectangle(20,10,400,200));
		contentPane.add(roll);

		jf.setSize(440, 240);
		jf.setLocation(400,250);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(Window e){
				System.exit(0);
			}
		});
	}
	
	public void mouseClicked(MouseEvent e){
		int index;
		if (e.getSource()==list){
			if (e.getClickCount()==2){
				index=list.locationToIndex(e.getPoint());
				Object options[]={"Delete","Modify","Cancel"};
				int val=JOptionPane.showOptionDialog(null,"Choose the operation you want.","Reminder",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[2]);
				if (val==0)
					model.removeElementAt(index);
				else if (val==1){
//					System.out.println("Modify");
					final JFrame jf1=new SpecificationSelected();
					jf1.setLocation(320,300);
					jf1.setVisible(true);
				}
				list.setModel(model);
			}
		}
	}
}

class addpanel extends JPanel{
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}
	
	addpanel(){
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.NONE;
		constraints.weightx=4;
		constraints.weighty=6;
//Devices========================================================
		JLabel devicelabel=new JLabel("Devices");
		String[] devices={"Air conditioner","Fridge","Light","Fan","Water heater","Warmer"};
		String[] status={"Brightness","ON","OFF"};

		JButton button1=new JButton("Add...");
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				final JFrame jf=new DevicesSelected();
				jf.setLocation(400, 250);
				jf.setVisible(true);
			}
		});
		
		add(devicelabel,constraints,0,1,1,1);
		add(button1,constraints,1,1,1,1);
		
		JLabel devices_selected_label=new JLabel("Selected Devices");
//		ComboBoxModel mode1=new AModel(devices);
//		JComboBox combo1=new JComboBox(mode1);
		JButton view_device=new JButton("View");
		view_device.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				DeviceList devicelist=new DeviceList();
			}
		});
		add(devices_selected_label,constraints,2,1,1,1);
		add(view_device,constraints,3,1,1,1);
		
//Rules==========================================================
		JLabel rules=new JLabel("Rules");
		JButton button2=new JButton("Add...");
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				final JFrame jf1=new RulesSelected();
				jf1.setLocation(320, 300);
				jf1.setVisible(true);
			}
		});
		
		JLabel viewlabel=new JLabel("Set Rules");
		JButton view_rule=new JButton("View");
		view_rule.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				RuleList rulelist=new RuleList();
			}
		});
		
		add(rules,constraints,0,2,1,1);
		add(button2,constraints,1,2,1,1);
		add(viewlabel,constraints,2,2,1,1);
		add(view_rule,constraints,3,2,1,1);

		
//Specification==================================================
		JLabel specification=new JLabel("Specification");
//		final JTextField specificationinput=new JTextField(10);
		JButton button3=new JButton("Add...");
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				final JFrame jf2=new SpecificationSelected();
				jf2.setLocation(320,300);
				jf2.setVisible(true);
			}
		});
		add(specification,constraints,0,3,1,1);
//		add(specificationinput,constraints,1,3,1,1);
		add(button3,constraints,1,3,1,1);
		
		JLabel viewspe=new JLabel("Set Specifications");
		JButton view_spe=new JButton("View");
		view_spe.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				SpeList spelist=new SpeList();
			}
		});
		add(viewspe,constraints,2,3,1,1);
		add(view_spe,constraints,3,3,1,1);

//Confirm or Cancel==============================================
		JButton confirm=new JButton("Confirm");
		JButton cancel=new JButton("Cancel");
		add(confirm,constraints,1,4,1,1);
		add(cancel,constraints,2,4,1,1);
		
		JLabel label=new JLabel("智能家居安全检验系统");
		add(label,constraints,3,5,1,1);
	}
}

class demopanel extends JPanel{
	JList rulelist;
	JList spelist;
	JList selrulelist;
	JList selspelist;
	DefaultListModel model1;
	DefaultListModel model2;
	DefaultListModel selmodel1;
	DefaultListModel selmodel2;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}

	String[] s={"IF Fridge.Status On THEN Light.Status Off.","C","C++","C#","Pathon","1","2","3","4","5"};
	class DataModel extends DefaultListModel{
		DataModel(int flag){
			if (flag==1)
				for (int i=0;i<s.length;i++)
					addElement(s[i]);
		}
	}
	
	demopanel(){
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
//		this.setLayout(null);
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.NONE;
		constraints.weightx=2;
		constraints.weighty=6;
		
//		JLabel label1=new JLabel("Rules");
//		add(label1,constraints,0,0,1,1);
//		JLabel label2=new JLabel("Specifications");
//		add(label2,constraints,0,1,1,1);
		
		JButton checkbut=new JButton("Check");
		JButton checkallbut=new JButton("Check All");
		add(checkbut,constraints,3,1,1,1);
		add(checkallbut,constraints,3,2,1,1);
		
		model1=new DataModel(1);
		rulelist=new JList(model1);
		rulelist.setBorder(BorderFactory.createTitledBorder("Rules"));
		rulelist.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				int index;
				if (e.getSource()==rulelist){
					if (e.getClickCount()==2){
						index=rulelist.locationToIndex(e.getPoint());
						String tmp=(String)model1.getElementAt(index);
						selmodel1.addElement(tmp);
						selrulelist.setModel(selmodel1);
//						model1.removeElementAt(index);
//						rulelist.setModel(model1);
					}
				}
			}
		});
		
		JScrollPane rulesp=new JScrollPane(rulelist);
		
		model2=new DataModel(1);
		spelist=new JList(model2);
		spelist.setBorder(BorderFactory.createTitledBorder("Specifications"));
		spelist.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				int index;
				if (e.getSource()==spelist){
					if (e.getClickCount()==2){
						index=spelist.locationToIndex(e.getPoint());
						String tmp=(String)model2.getElementAt(index);
						selmodel2.addElement(tmp);
						selspelist.setModel(selmodel2);
//						model2.removeElementAt(index);
//						spelist.setModel(model2);
					}
				}
			}
		});
		
		JScrollPane spesp=new JScrollPane(spelist);
	
		JSplitPane splitlist=new JSplitPane();
		splitlist.setOneTouchExpandable(true);
		splitlist.setContinuousLayout(true);
		splitlist.setPreferredSize(new Dimension(350,250));
		splitlist.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitlist.setDividerLocation(150);
		splitlist.setLeftComponent(rulesp);
		splitlist.setRightComponent(spesp);
		add(splitlist,constraints,0,0,2,3);
		
		selmodel1=new DataModel(2);
		selrulelist=new JList(selmodel1);
		selrulelist.setBorder(BorderFactory.createTitledBorder("Selected Rules"));
		selrulelist.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				int index;
				if (e.getSource()==selrulelist){
					if (e.getClickCount()==2){
						index=selrulelist.locationToIndex(e.getPoint());
						selmodel1.removeElementAt(index);
						selrulelist.setModel(selmodel1);
					}
				}
			}
		});
		JScrollPane selrulesp=new JScrollPane(selrulelist);
		
		selmodel2=new DataModel(2);
		selspelist=new JList(model2);
		selspelist.setBorder(BorderFactory.createTitledBorder("Selected Specifications"));
		selspelist.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				int index;
				if (e.getSource()==selspelist){
					if (e.getClickCount()==2){
						index=selspelist.locationToIndex(e.getPoint());
						selmodel2.removeElementAt(index);
						selspelist.setModel(selmodel2);
					}
				}
			}
		});
		JScrollPane selspesp=new JScrollPane(selspelist);
	
		JSplitPane selsplitlist=new JSplitPane();
		selsplitlist.setOneTouchExpandable(true);
		selsplitlist.setContinuousLayout(true);
		selsplitlist.setPreferredSize(new Dimension(350,250));
		selsplitlist.setOrientation(JSplitPane.VERTICAL_SPLIT);
		selsplitlist.setDividerLocation(150);
		selsplitlist.setLeftComponent(selrulesp);
		selsplitlist.setRightComponent(selspesp);
		add(selsplitlist,constraints,1,0,2,3);
		
		JLabel label3=new JLabel("Verification Result");
		add(label3,constraints,0,3,1,1);
		JTextArea text=new JTextArea(5,30);
		JScrollPane textsp=new JScrollPane(text);
		add(textsp,constraints,1,3,2,3);
		
		JLabel label=new JLabel("智能家居安全检验系统");
		add(label,constraints,3,5,1,1);
	}

}

class fixpanel extends JPanel{
	JButton fixbut;
	JList sellist;
	JSplitPane splitpane;
	DefaultListModel model;
	
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h){
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}

	String[] s={"IF Fridge.Status On THEN Light.Status Off.","C","C++","C#","Pathon","1","2","3","4","5"};
	class DataModel extends DefaultListModel{
		DataModel(int flag){
			if (flag==1)
				for (int i=0;i<s.length;i++)
					addElement(s[i]);
		}
	}
	
	fixpanel(){
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.NONE;
		constraints.weightx=2;
		constraints.weighty=6;
		
		model=new DataModel(1);
		sellist=new JList(model);
		sellist.setBorder(BorderFactory.createTitledBorder("Selected Rules & Specifications"));
		JScrollPane sel=new JScrollPane(sellist);
		JLabel sellab=new JLabel("Selected Rules & Specifications");
		add(sellab,constraints,0,0,1,1);
		add(sel,constraints,2,0,2,2);
		
		fixbut=new JButton("Fix");
		add(fixbut,constraints,1,3,1,1);
		
		JLabel advicelab=new JLabel("Suggestion");
		add(advicelab,constraints,0,2,1,1);
		
		JTextArea advicetxt=new JTextArea(3,30);
		JScrollPane advicesp=new JScrollPane(advicetxt);
		add(advicesp,constraints,2,2,1,1);
		
		JButton fixagbut=new JButton("Refix");
		add(fixagbut,constraints,2,3,1,1);
		
		JLabel label=new JLabel("智能家居安全检验系统");
		add(label,constraints,3,4,1,1);
	}
}
public class Menu {
	static final int WIDTH=1000;
	static final int HEIGHT=600;
	JFrame frame;
	JMenuBar menubar;
	JPanel panel;
	JTabbedPane pane;
	public void centered(Container container){
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension screenSize=toolkit.getScreenSize();
		int w=container.getWidth();
		int h=container.getHeight();
		container.setBounds((screenSize.width-w)/2,(screenSize.height-h)/2,w,h);
	}
	
	public Menu(){
		frame=new JFrame();
		frame.setTitle("智能家居安全检验");
//		frame.setLayout(null);
		panel=new JPanel();
		pane=new JTabbedPane();
		frame.add(panel);
		panel.add(pane);
//Set menubar===========================================================
		menubar=new JMenuBar();
		frame.setJMenuBar(menubar);
//Set File===============================
		JMenu filemenu=new JMenu("File");
		filemenu.setMnemonic('Z');
		JMenuItem newitem=new JMenuItem("New");
		newitem.setAccelerator(KeyStroke.getKeyStroke('N',java.awt.Event.CTRL_MASK,false));
		JMenuItem openitem=new JMenuItem("Open File");
		openitem.setAccelerator(KeyStroke.getKeyStroke('O',java.awt.Event.CTRL_MASK,false));
		JMenuItem saveitem=new JMenuItem("Save");
		saveitem.setAccelerator(KeyStroke.getKeyStroke('S',java.awt.Event.CTRL_MASK,false));
		JMenuItem save_asitem=new JMenuItem("Save as...");
		JMenuItem closeitem=new JMenuItem("Close");
		closeitem.setAccelerator(KeyStroke.getKeyStroke('Q',java.awt.Event.CTRL_MASK,false));
		JMenuItem printitem=new JMenuItem("Print");
		printitem.setAccelerator(KeyStroke.getKeyStroke('P',java.awt.Event.CTRL_MASK,false));
		filemenu.add(newitem);
		filemenu.addSeparator();
		filemenu.add(openitem);
		filemenu.addSeparator();
		filemenu.add(saveitem);
		filemenu.addSeparator();
		filemenu.add(save_asitem);
		filemenu.addSeparator();
		filemenu.add(closeitem);
		filemenu.addSeparator();
		filemenu.add(printitem);
		
		menubar.add(filemenu);
		
//Set Edit===============================
		JMenu editmenu=new JMenu("Edit");
		editmenu.setMnemonic('C');
		JMenuItem undoitem=new JMenuItem("Undo");
		undoitem.setAccelerator(KeyStroke.getKeyStroke('U',java.awt.Event.CTRL_MASK,false));
		JMenuItem redoitem=new JMenuItem("Redo");
		redoitem.setAccelerator(KeyStroke.getKeyStroke('R',java.awt.Event.CTRL_MASK,false));
		JMenuItem deleteitem=new JMenuItem("Delete");
		deleteitem.setAccelerator(KeyStroke.getKeyStroke('D',java.awt.Event.CTRL_MASK,false));
		editmenu.add(undoitem);
		editmenu.addSeparator();
		editmenu.add(redoitem);
		editmenu.addSeparator();
		editmenu.add(deleteitem);
		menubar.add(editmenu);
		
//Set Window============================
		JMenu windowmenu=new JMenu("Window");
		windowmenu.setMnemonic('D');
		JMenuItem miniitem=new JMenuItem("Minimize");
		miniitem.setAccelerator(KeyStroke.getKeyStroke('M',java.awt.Event.CTRL_MASK,false));
		JMenuItem zoomitem=new JMenuItem("Zoom");
		zoomitem.setAccelerator(KeyStroke.getKeyStroke('Z',java.awt.Event.CTRL_MASK,false));
		windowmenu.add(miniitem);
		windowmenu.addSeparator();
		windowmenu.add(zoomitem);
		menubar.add(windowmenu);
		
//Set Help==============================
		JMenu helpmenu=new JMenu("Help");
		helpmenu.setMnemonic('H');
		JMenuItem searchitem=new JMenuItem("Search");
		searchitem.setAccelerator(KeyStroke.getKeyStroke('F',java.awt.Event.CTRL_MASK,false));
		JMenuItem acknowledgeitem=new JMenuItem("Acknowledgements");
		acknowledgeitem.setAccelerator(KeyStroke.getKeyStroke('A',java.awt.Event.CTRL_MASK,false));
		helpmenu.add(searchitem);
		helpmenu.addSeparator();
		helpmenu.add(acknowledgeitem);
		menubar.add(helpmenu);

		
		
//Actions===============================================
//New File==============================
		newitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
//				welcomelabel.setVisible(false);
				addpanel addcon=new addpanel();
				demopanel democon=new demopanel();
				fixpanel fixcon=new fixpanel();
				JPanel con=new JPanel();
				pane.addTab("add",addcon);
				pane.setEnabledAt(0,true);
				pane.setTitleAt(0,"Add");
				pane.addTab("demo", democon);
				pane.setEnabledAt(1,true);
				pane.setTitleAt(1, "Demo");
				pane.addTab("fix",fixcon);
				pane.setEnabledAt(2,true);
				pane.setTitleAt(2, "Fix");
				pane.addTab("...",con);
				pane.setEnabledAt(3,true);
				pane.setTitleAt(3, "...");
				pane.setPreferredSize(new Dimension(WIDTH-100,HEIGHT-100));
				pane.setTabPlacement(JTabbedPane.TOP);
				pane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			}
		});
		
		frame.setSize(WIDTH,HEIGHT);
		centered(frame);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		Menu menu=new Menu();
	}
}
