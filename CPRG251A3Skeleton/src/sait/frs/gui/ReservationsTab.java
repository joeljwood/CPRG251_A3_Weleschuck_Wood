package sait.frs.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import sait.frs.manager.Manager;

/**
 * Holds the components for the reservations tab.
 * 
 */
public class ReservationsTab extends TabBase {
	private JTextArea reserveTextArea;
	
	private JTextField codeReserveText;
	private JTextField flightReserveText;
	private JTextField AirlineReserveText;
	private JTextField costReserveText;
	private JTextField nameReserveText;
	private JTextField citizenReserveText;
	private JComboBox statusReserveComboBox;
	private JButton updateButton;
	
	private JTextField codeSearchText;
	private JTextField airlineSearchText;
	private JTextField nameSearchText;
	private JButton findResButton;
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

		JPanel centerPanel = createCenterPanel();
		panel.add(centerPanel, BorderLayout.CENTER);

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

	private JPanel createCenterPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JPanel eastPanel = createEastPanel();
		panel.add(eastPanel, BorderLayout.EAST);

		JPanel westPanel = createWestPanel();
		panel.add(westPanel, BorderLayout.WEST);

		return panel;
	}

	private JPanel createWestPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(8, 8));
		reserveTextArea = new JTextArea(15, 30);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		reserveTextArea
				.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		reserveTextArea.setLineWrap(true);
		panel.add(reserveTextArea);
		panel.add(new JScrollPane(reserveTextArea));
		return panel;
	}

	private JPanel createEastPanel() {// main panel for east portion
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JPanel centerNorthPanel = createEastNorthPanel();
		panel.add(centerNorthPanel, BorderLayout.NORTH);

		JPanel centerCenterPanel = createEastCenterPanel();
		panel.add(centerCenterPanel, BorderLayout.CENTER);

		JPanel eastSouthPanel = createEastSouthPanel();
		panel.add(eastSouthPanel, BorderLayout.SOUTH);

		return panel;
	}

	private JPanel createEastNorthPanel() {// main panel for east portion
		JPanel panel = new JPanel();
		JLabel reserveLabel = new JLabel("Reserve", SwingConstants.CENTER);
		reserveLabel.setFont(new Font("serif", Font.PLAIN, 25));
		panel.add(reserveLabel);
		return panel;
	}

	private JPanel createEastCenterPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(1, 8, 1, 8);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JLabel codeReserveLabel = new JLabel("Code:");
		codeReserveLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(codeReserveLabel, gbc);

		codeReserveText = new JTextField(25);
		codeReserveText.setHorizontalAlignment(JLabel.RIGHT);
		codeReserveText.setEditable(false);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(codeReserveText, gbc);

		JLabel flightReserveLabel = new JLabel("Flight:");
		flightReserveLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(flightReserveLabel, gbc);

		flightReserveText = new JTextField(25);
		flightReserveText.setHorizontalAlignment(JLabel.RIGHT);
		flightReserveText.setEditable(false);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(flightReserveText, gbc);

		JLabel AirlineReserveLabel = new JLabel("Airline:");
		AirlineReserveLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(AirlineReserveLabel, gbc);

		AirlineReserveText = new JTextField(25);
		AirlineReserveText.setHorizontalAlignment(JLabel.RIGHT);
		AirlineReserveText.setEditable(false);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(AirlineReserveText, gbc);

		JLabel costReserveLabel = new JLabel("Cost:");
		costReserveLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(costReserveLabel, gbc);

		costReserveText = new JTextField(25);
		costReserveText.setHorizontalAlignment(JLabel.RIGHT);
		costReserveText.setEditable(false);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 3;
		panel.add(costReserveText, gbc);

		JLabel nameReserveLabel = new JLabel("Name:");
		nameReserveLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(nameReserveLabel, gbc);

		nameReserveText = new JTextField(25);
		nameReserveText.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel.add(nameReserveText, gbc);

		JLabel citizenReserveLabel = new JLabel("Citizenship:");
		citizenReserveLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.gridx = 0;
		gbc.gridy = 5;
		panel.add(citizenReserveLabel, gbc);

		citizenReserveText = new JTextField(25);
		citizenReserveText.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 5;
		panel.add(citizenReserveText, gbc);

		JLabel statusReserveLabel = new JLabel("Status:");
		statusReserveLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.gridx = 0;
		gbc.gridy = 6;
		panel.add(statusReserveLabel, gbc);

		String[] statusArray = { "active", "inactive" };// boolean: active==true, inactive==false
		statusReserveComboBox = new JComboBox(statusArray);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 6;
		panel.add(statusReserveComboBox, gbc);

		return panel;

	}

	private JPanel createEastSouthPanel() {
		JPanel panel = new JPanel();
		updateButton = new JButton("Update");
		panel.add(updateButton, BorderLayout.CENTER);
		return panel;
	}

	private JPanel createSouthPanel() {// main panel for south portion
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());// resets for a new subpanels
		JPanel southNorthPanel = createSouthNorthPanel();
		panel.add(southNorthPanel, BorderLayout.NORTH);

		JPanel southCentralPanel = createSouthCenterPanel();
		panel.add(southCentralPanel, BorderLayout.CENTER);

		JPanel southSouthPanel = createSouthSouthPanel();
		panel.add(southSouthPanel, BorderLayout.SOUTH);
		return panel;
	}

	private JPanel createSouthNorthPanel() {
		JPanel panel = new JPanel();
		JLabel searchLabel = new JLabel("Search", SwingConstants.CENTER);
		searchLabel.setFont(new Font("serif", Font.PLAIN, 25));
		panel.add(searchLabel);
		return panel;
	}

	private JPanel createSouthSouthPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		findResButton = new JButton("Find Reservations");
		findResButton.addActionListener(new ButtonListener());
		panel.add(findResButton);
		return panel;
	}

	private JPanel createSouthCenterPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(1, 8, 1, 8);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JLabel codeSearchLabel = new JLabel("Code:");
		codeSearchLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.gridy = 0;
		panel.add(codeSearchLabel, gbc);

		JLabel airlineSearchLabel = new JLabel("Airline:");
		airlineSearchLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.gridy = 1;
		panel.add(airlineSearchLabel, gbc);

		JLabel NameSearchLabel = new JLabel("Name:");
		NameSearchLabel.setFont(new Font("serif", Font.PLAIN, 12));
		gbc.anchor = GridBagConstraints.LAST_LINE_START;
		gbc.gridy = 2;
		panel.add(NameSearchLabel, gbc);

		codeSearchText = new JTextField(50);
		codeSearchText.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(codeSearchText, gbc);

		airlineSearchText = new JTextField(50);
		airlineSearchText.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(airlineSearchText, gbc);

		nameSearchText = new JTextField(50);
		nameSearchText.setHorizontalAlignment(JLabel.RIGHT);
		gbc.weightx = 1;
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(nameSearchText, gbc);

		return panel;
	}

	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stubcode
			//SearchText,airlineSearchText,nameSearchText
			//reserveTextArea
			if (e.getSource()== findResButton) {
				
			}
		}
	}
}
