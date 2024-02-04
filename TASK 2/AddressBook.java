import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class AddressBook
{
    public static void main(String[] args) 
    {
        AddressBookFrame ab = new AddressBookFrame();
        Contact c = new Contact(null, null, null, null);
        
        ab.component();
        ab.createlayout();
        ab.AddComponent();
    }
}
class Contact 
{
    String name, address, phone, email;

     Contact(String name, String address, String phone, String email) 
     {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
class AddressBookFrame implements ActionListener
{
    JLabel lbname,lbadd,lbphone,lbemail;
    JTextField txtname,txtadd,txtphone,txtemail;
    JButton btnsave,btndel,btnup,btnles,btngr,btnser,btncl,btnex,btndp;
    Font font;
    Container c;
    String name, address, phone, email;
    private ArrayList<Contact> contacts = new ArrayList<>();

    AddressBookFrame() 
    {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(150, 100, 800, 800);
        f.setTitle("Address Book");
        f.setResizable(false);
        c=f.getContentPane();
        c.setLayout(null);
        font = new Font("arial", Font.BOLD, 40);
    }
    void component()
    {
      lbname = new JLabel("Name : ");
      txtname = new JTextField();
      lbadd = new JLabel("Address : ");
      txtadd = new JTextField();
      lbphone = new JLabel("Phone : ");
      txtphone = new JTextField();
      lbemail = new JLabel("Email : ");
      txtemail  = new JTextField();
      btnsave = new JButton("Save");
      btndel = new JButton("Delete");
      btnup = new JButton("Update");
      btnles = new JButton("<<");
      btnser = new JButton("Search");
      btngr = new JButton(">>");
      btncl = new JButton("Clear");
      btnex = new JButton("Exit");
      btndp = new JButton("Display");
    }
    void createlayout()
    {
      lbname.setBounds(80,70,320,50);
      lbname.setFont(font);
      txtname.setBounds(250,70,460,60);
      txtname.setFont(font);
      lbadd.setBounds(50,160,320,50);
      lbadd.setFont(font);
      txtadd.setBounds(250,160,460,60);
      txtadd.setFont(font);
      lbphone.setBounds(80,250,320,50);
      lbphone.setFont(font);
      txtphone.setBounds(250,250,460,60);
      txtphone.setFont(font);
      lbemail.setBounds(80,340,320,50);
      lbemail.setFont(font);
      txtemail.setBounds(250,340,460,60);
      txtemail.setFont(font);
      btnsave.setBounds(60,430,200,60);
      btnsave.setFont(font);
      btndel.setBounds(290,430,200,60);
      btndel.setFont(font);
      btnup.setBounds(520,430,200,60);
      btnup.setFont(font);
      btnles.setBounds(60,530,200,60);
      btnles.setFont(font);
      btnser.setBounds(290,530,200,60);
      btnser.setFont(font);
      btngr.setBounds(520,530,200,60);
      btngr.setFont(font);
      btncl.setBounds(290,630,200,60);
      btncl.setFont(font);
      btnex.setBounds(520,630,200,60);
      btnex.setFont(font);
      btndp.setBounds(60,630,200,60);
      btndp.setFont(font);
    }
    void AddComponent()
    {
        c.add(lbname);
        c.add(txtname);
        c.add(lbadd);
        c.add(txtadd);
        c.add(lbphone);
        c.add(txtphone);
        c.add(lbemail);
        c.add(txtemail);
        c.add(btnsave);
        c.add(btndel);
        c.add(btnup);
        c.add(btnles);
        c.add(btnser);
        c.add(btngr);
        c.add(btncl);
        c.add(btnex);
        c.add(btndp);
        btnsave.addActionListener(this);
        btndel.addActionListener(this);
        btnup.addActionListener(this);
        btnles.addActionListener(this);
        btnser.addActionListener(this);
        btngr.addActionListener(this);
        btncl.addActionListener(this);
        btnex.addActionListener(this);
        btndp.addActionListener(this);
    }
    private int currentIndex = 0;
    @Override
    public void actionPerformed(ActionEvent e) 
    {   
        if(e.getSource()==btnsave)
        {
            String name = txtname.getText();
            String address = txtadd.getText();
            String phone = txtphone.getText();
            String email = txtemail.getText();
            Contact contact = new Contact(name, address, phone, email);
            contacts.add(contact);
            JOptionPane.showMessageDialog(c, "Contact saved successfully!");
             clearFields();
        }
        if(e.getSource()==btndel)
        {
            String deleteName = JOptionPane.showInputDialog(this, "Enter name to delete:");

            for (Contact contact : contacts) 
            {
                if (contact.name.equalsIgnoreCase(deleteName)) 
                {
                    contacts.remove(contact);
                    JOptionPane.showMessageDialog(c, "Contact deleted successfully!");
                    return;
                }
            } 
            JOptionPane.showMessageDialog(c, "Contact not found!");
        }
        if(e.getSource()==btnser)
        {
            String searchName = JOptionPane.showInputDialog(this, "Enter name to search:");

            for (Contact contact : contacts) 
            {
                if (contact.name.equalsIgnoreCase(searchName)) 
                {
                    JOptionPane.showMessageDialog(c, "Contact Found:\n" +
                            "Name: " + contact.name + "\n" +
                            "Address: " + contact.address + "\n" +
                            "Phone No: " + contact.phone + "\n" +
                            "Email: " + contact.email);
                    return;
                }
            }
    
            JOptionPane.showMessageDialog(c, "Contact not found!");
        }
        if(e.getSource()==btnup)
        {
            String updateName = JOptionPane.showInputDialog(this, "Enter name to update:");

            for (Contact contact : contacts) 
            {
                if (contact.name.equalsIgnoreCase(updateName)) 
                {
                    String newName = JOptionPane.showInputDialog(c, "Enter new name:", contact.name);
                    String newAddress = JOptionPane.showInputDialog(c, "Enter new address:", contact.address);
                    String newPhone = JOptionPane.showInputDialog(c, "Enter new phone number:", contact.phone);
                    String newEmail = JOptionPane.showInputDialog(c, "Enter new email:", contact.email);
    
                    contact.name = newName;
                    contact.address = newAddress;
                    contact.phone = newPhone;
                    contact.email = newEmail;
    
                    JOptionPane.showMessageDialog(c, "Contact updated successfully!");
                    clearFields();
                    return;
                }
            }
        }
        if(e.getSource()==btncl)
        {
            clearFields();
        }
        if(e.getSource()==btnex)
        {
            int confirm = JOptionPane.showConfirmDialog(c, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) 
            {
                System.exit(0);
            }
        }
        if(e.getSource()==btnles)
        {
            if (currentIndex > 0) 
            {
                currentIndex--;
                displayContact(currentIndex);
            } 
            else 
            {
                JOptionPane.showMessageDialog(c, "Already at the first contact.");
            }
        }
        if(e.getSource()==btngr)
        {
            if (currentIndex < contacts.size() - 1) 
            {
                currentIndex++;
                displayContact(currentIndex);
            } 
            else 
            {
                JOptionPane.showMessageDialog(c, "Already at the last contact.");
            }
        }
        if(e.getSource()==btndp)
        {
            StringBuilder display = new StringBuilder("Contacts:\n");

            for (Contact contact : contacts) 
            {
                display.append("Name: ").append(contact.name).append("\n");
                display.append("Address: ").append(contact.address).append("\n");
                display.append("Phone No: ").append(contact.phone).append("\n");
                display.append("Email: ").append(contact.email).append("\n\n");
            }
            JOptionPane.showMessageDialog(c, display.toString());
        }
    }
    private void displayContact(int index) 
    {
        Contact contact = contacts.get(index);
        txtname.setText(contact.name);
        txtadd.setText(contact.address);
        txtphone.setText(contact.phone);
        txtemail.setText(contact.email);
    }
    private void clearFields() 
    {
        txtname.setText("");
        txtadd.setText("");
        txtphone.setText("");
        txtemail.setText("");
    }
}