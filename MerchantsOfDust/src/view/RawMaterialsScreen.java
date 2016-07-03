package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.GatheringTask;
import model.Resource;
import controllers.RawMaterialsController;

import javax.swing.BoxLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import java.awt.FlowLayout;
import java.awt.GridLayout;

public class RawMaterialsScreen extends JPanel{

	private RawMaterialsController rController;
	private JPanel panel;
		
	public RawMaterialsScreen(RawMaterialsController rc) {
		
		rController=rc;
		
		setLayout(null);
		this.setSize(800, 800);
		
		JButton gameButton = new JButton("Back");
		gameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MainView.getCardLayout().show(MainView.mainViewScreen, "Game");
			}
		});   
		gameButton.setBounds(23, 716, 96, 41);
		add(gameButton);
		
		panel = new JPanel();
		panel.setBounds(10, 28, 391, 202);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Raw Ores");
		lblNewLabel.setBounds(10, 11, 83, 14);
		add(lblNewLabel);
		
		int y=0;
		for(Resource r: rController.getRawMaterialsModel().getResourceList()){
			r.getJLabel().setBounds(15, y, 110, 35);
			panel.add(r.getJLabel());
			y+=21;
		}
		
	
	}
	
		public void repaintResources(){
		 DecimalFormat df= new DecimalFormat("#.##");
		 for(Resource r: rController.getRawMaterialsModel().getResourceList()){
			
			r.getJLabel().setText(r.getTask().getName()+" : "+ df.format(((GatheringTask) r.getTask()).getGathered())+" tons");
			
		}
	}
	
	
	
}
