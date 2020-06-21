package sait.frs.gui;

import java.awt.*;
import javax.swing.*;

import sait.frs.manager.Manager;

/**
 * Holds the components for the reservations tab.
 * 
 */
public class ReservationsTab extends TabBase {
	/**
	 * Instance of travel manager.
	 */
	private Manager manager;

	/**
	 * Creates the components for reservations tab.
	 */
	public ReservationsTab(Manager manager) {
		this.manager = manager;
		panel.setLayout(new BorderLayout());

		JPanel northPanel = createNorthPanel();
		panel.add(northPanel, BorderLayout.NORTH);

		// JPanel eastPanel = createEastPanel();
		// panel.add(eastPanel, BorderLayout.EAST);

		JPanel southPanel = createSouthPanel();
		panel.add(southPanel, BorderLayout.SOUTH);

	}

	/**
	 * Creates the north panel.
	 * 
	 * @return JPanel that goes in north.
	 */
	private JPanel createNorthPanel() {
		JPanel panel = new JPanel();

		JLabel title = new JLabel("Reservations", SwingConstants.CENTER);
		title.setFont(new Font("serif", Font.PLAIN, 29));
		panel.add(title);

		return panel;
	}

	JPanel createEastPanel() {
		JPanel panel = new JPanel();
		JLabel reserveLabel = new JLabel("Reserve", SwingConstants.CENTER);
		reserveLabel.setFont(new Font("serif", Font.PLAIN, 25));
		panel.add(reserveLabel);

		return panel;
	}

	JPanel createSouthPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());// resets for a new subpanel
		// add call methods for southnorth, center, south
		// add panel to this panel
		JPanel southNorthPanel = createSouthNorthPanel();
		panel.add(southNorthPanel, BorderLayout.NORTH);
		
		JPanel southCentralPanel = createSouthCenterPanel();
		panel.add(southCentralPanel, BorderLayout.CENTER);
		
		JPanel southSouthPanel = createSouthSouthPanel();
		panel.add(southSouthPanel, BorderLayout.SOUTH);
		return panel;
	}

	JPanel createSouthNorthPanel() {
		JPanel panel = new JPanel();
		JLabel searchLabel = new JLabel("Search", SwingConstants.CENTER);
		searchLabel.setFont(new Font("serif", Font.PLAIN, 25));
		panel.add(searchLabel);
		return panel;
	}

	JPanel createSouthSouthPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton findResButton = new JButton("Find Reservations");
		panel.add(findResButton);
		return panel;
	}

	JPanel createSouthCenterPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(1, 1, 1, 1);
		
		JLabel codeLabel = new JLabel("Code:");
		codeLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.anchor  = GridBagConstraints.FIRST_LINE_START;
		gbc.gridy = 0;
		panel.add(codeLabel,gbc);
		
		JLabel airlineLabel = new JLabel("Airline:");
		airlineLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.anchor  = GridBagConstraints.LINE_START;
		gbc.gridy = 1;
		panel.add(airlineLabel,gbc);
		
		JLabel NameSearchLabel = new JLabel("Name:");
		NameSearchLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.anchor  = GridBagConstraints.LAST_LINE_START;
		gbc.gridy = 2;
		panel.add(NameSearchLabel,gbc);
		
			
		JTextField codeText = new JTextField(50);	//fix this later to stretch window	
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridy = 0;
		panel.add(codeText,gbc);
		
		JTextField airlineText = new JTextField(50);	//fix this later to stretch window	
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridy = 1;
		panel.add(airlineText,gbc);
		
		JTextField nameSearchText = new JTextField(50);	//fix this later to stretch window	
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridy = 2;
		panel.add(nameSearchText,gbc);
		
		//github test
		return panel;
	}
	
}
