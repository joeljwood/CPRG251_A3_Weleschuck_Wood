package sait.frs.gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


import sait.frs.manager.Manager;
import sait.frs.problemdomain.Flight;

/**
 * Holds the components for the flights tab.
 * 
 */
public class FlightsTab extends TabBase 
{
	/**
	 * Instance of travel manager.
	 */
	private Manager manager;
	
	/**
	 * List of flights.
	 */
	private JList<Flight> flightsList;
	
	private DefaultListModel<Flight> flightsModel;
	
	private JLabel flightLabel;
	private JTextField flightSearch;
	private JLabel airlineLable;
	private JTextField airlineSearch;
	private JLabel dayLable;
	private JTextField daySearch;
	private JLabel timeLable;
	private JTextField timeSearch;
	private JLabel costLable;
	private JTextField costSearch;
	private JTextField nameSearch;
	private JLabel nameLable;
	private JLabel citizenshipLable;
	private JTextField citizenshipSearch;
	private JLabel fromLabel;
	private JComboBox fromBox;
	private JLabel toLabel;
	private JComboBox toBox;
	private JLabel dayLabel;
	private JComboBox dayBox;
	
	/**
	 * Creates the components for flights tab.
	 */
	public FlightsTab(Manager manager) 
	{
		this.manager = manager;
		panel.setLayout(new BorderLayout());
		
		JPanel northPanel = createNorthPanel();
		panel.add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = createCenterPanel();
		panel.add(centerPanel, BorderLayout.CENTER);
		
		JPanel southPanel = createSouthPanel();
		panel.add(southPanel, BorderLayout.SOUTH);
	}
	
	/**
	 * Creates the north panel.
	 * @return JPanel that goes in north.
	 */
	private JPanel createNorthPanel() 
	{
		JPanel panel = new JPanel();
		
		JLabel title = new JLabel("Flights", SwingConstants.CENTER);
		title.setFont(new Font("serif", Font.PLAIN, 29));
		panel.add(title);
		
		return panel;
	}
	
	/**
	 * Creates the center panel.
	 * @return JPanel that goes in center.
	 */
	private JPanel createCenterPanel() 
	{
		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout());
		
		//flightsModel = new DefaultListModel<>();
		//flightsList = new JList<>(flightsModel);
		
		// User can only select one item at a time.
		//flightsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// Wrap JList in JScrollPane so it is scrollable.
		//JScrollPane scrollPane = new JScrollPane(this.flightsList);
		
		//flightsList.addListSelectionListener(new MyListSelectionListener());
		
		//panel.add(scrollPane);
		
		JPanel westPanel = createCenterWestPanel();
		panel.add(westPanel, BorderLayout.WEST);
		
		JPanel eastPanel = createCenterEastPanel();
		panel.add(eastPanel, BorderLayout.EAST);
		return panel;
	}
	/**
	 * 
	 * @return JPanel that is the west panel of the greater Center panel
	 */
	private JPanel createCenterWestPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JTextArea textInput = new JTextArea(15, 20);
		
		panel.add(textInput);
		
		return panel;
	}
	/**
	 * 
	 * @return JPanel that is the east of the greater Center panel
	 */
	private JPanel createCenterEastPanel() {
		//calls CenterEastNorth, CenterEastCenter, CenterEastSouth
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel centerEastNorthPanel = createCenterEastNorth();
		panel.add(centerEastNorthPanel, BorderLayout.NORTH);
		
		JPanel centerEastCenterPanel = createCenterEastCenter();
		panel.add(centerEastCenterPanel, BorderLayout.CENTER);
		
		JPanel centerEastSouthPanel = createCenterEastSouth();
		panel.add(centerEastSouthPanel, BorderLayout.SOUTH);
		return panel;
	}
	/**
	 * 
	 * @return JPanel that is the north of the greater Center-East panel
	 */
	private JPanel createCenterEastNorth() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel title = new JLabel("Reserve", SwingConstants.CENTER);
		title.setFont(new Font("serif", Font.PLAIN, 29));
		panel.add(title);
		return panel;
	}
	/**
	 * 
	 * @return JPanel that is the Center of the greater Center-East panel
	 */
	private JPanel createCenterEastCenter() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		this.flightLabel = new JLabel("Flight: ");
		this.flightLabel.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(this.flightLabel, gbc);
        
		this.flightSearch = new JTextField();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(this.flightSearch, gbc);
        
        this.airlineLable = new JLabel("Airline: ");
        this.airlineLable.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(this.airlineLable, gbc);
        
        this.airlineSearch = new JTextField();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(this.airlineSearch, gbc);
        
        this.dayLable = new JLabel("Day: ");
        this.dayLable.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(this.dayLable, gbc);
        
        this.daySearch = new JTextField();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(this.daySearch, gbc);
        
        this.timeLable = new JLabel("Time: ");
        this.timeLable.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(this.timeLable, gbc);
        
        this.timeSearch = new JTextField();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(this.timeSearch, gbc);
        
        this.costLable = new JLabel("Cost: ");
        this.costLable.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(this.costLable, gbc);
        
        this.costSearch = new JTextField();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(this.costSearch, gbc);
        
        this.nameLable = new JLabel("Name: ");
        this.nameLable.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(this.nameLable, gbc);
        
        this.nameSearch = new JTextField();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(this.nameSearch, gbc);
		
        this.citizenshipLable = new JLabel("Name: ");
        this.citizenshipLable.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(this.citizenshipLable, gbc);
        
        this.citizenshipSearch = new JTextField();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(this.citizenshipSearch, gbc);
        
		return panel;
	}
	/**
	 * 
	 * @return JPanel that is the South of the greater Center-East panel
	 */
	private JPanel createCenterEastSouth() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton reserveButton = new JButton("Find Reservations");
		panel.add(reserveButton);
		return panel;
	}
	/**
	 * 
	 * @return JPanel that goes in the south
	 */
	private JPanel createSouthPanel() {
		//calls southNorth, southCenter, southSouth
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel southNorthPanel = createSouthNorthPanel();
		panel.add(southNorthPanel, BorderLayout.NORTH);//, 
		
		JPanel southCenterPanel = createSouthCenterPanel();
		panel.add(southCenterPanel, BorderLayout.CENTER);
		
		JPanel southSouthPanel = createSouthSouthPanel();
		panel.add(southSouthPanel, BorderLayout.SOUTH);
		return panel;
	}
	
	/**
	 * 
	 * @return JPanel that is the North panel of the greater South panel
	 */
	private JPanel createSouthNorthPanel() {
		JPanel southNorthPanel = new JPanel();
		JLabel title = new JLabel("Flight Finder", SwingConstants.CENTER);
		title.setFont(new Font("serif", Font.PLAIN, 29));
		southNorthPanel.add(title);
		return southNorthPanel;
	}
	/**
	 * 
	 * @return JPanel that is the Center panel of the greater South panel
	 */
	private JPanel createSouthCenterPanel() {
		JPanel southCenterPanel = new JPanel();
		southCenterPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		this.fromLabel = new JLabel("From: ");
		this.fromLabel.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        southCenterPanel.add(this.fromLabel, gbc);
        
		this.fromBox = new JComboBox();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 0;
        southCenterPanel.add(this.fromBox, gbc);
        
        this.toLabel = new JLabel("To: ");
		this.toLabel.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 1;
        southCenterPanel.add(this.toLabel, gbc);
        
		this.toBox = new JComboBox();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 1;
        southCenterPanel.add(this.toBox, gbc);
        
        this.dayLabel = new JLabel("Day: ");
		this.dayLabel.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 2;
        southCenterPanel.add(this.dayLabel, gbc);
        
		this.dayBox = new JComboBox();
		gbc.weightx = 1;
        gbc.gridx = 1;
        gbc.gridy = 2;
        southCenterPanel.add(this.dayBox, gbc);
		
		
		return southCenterPanel;
	}
	
	/**
	 * 
	 * @return JPanel that is the South panel of the greater South panel
	 */
	private JPanel createSouthSouthPanel() {
		JPanel SouthSouthPanel = new JPanel();
		SouthSouthPanel.setLayout(new BorderLayout());
		JButton findFlightsButton = new JButton("Find Reservations");
		SouthSouthPanel.add(findFlightsButton);
		return SouthSouthPanel;
	}
	
	private class MyListSelectionListener implements ListSelectionListener 
	{
		/**
		 * Called when user selects an item in the JList.
		 */
		@Override
		public void valueChanged(ListSelectionEvent e) {
			
		}
		
	}
}