package client;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JPanel;

public class ClientPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Image imageOrg = null;
	private Image image = null;
	
	{
	    addComponentListener(new ComponentAdapter() {
	        public void componentResized(final ComponentEvent e) {
	            final int w = ClientPanel.this.getWidth();
	            final int h = ClientPanel.this.getHeight();
	            image = w > 0 && h > 0 ? imageOrg.getScaledInstance(w, h, Image.SCALE_SMOOTH) : imageOrg;
	            ClientPanel.this.repaint();
	        }
	    });
	}

	public ClientPanel(final Image i) {
	    imageOrg = i;
	    image = i;
	}

	@Override
	public void paintComponent(final Graphics g) {
	    super.paintComponent(g);
	    if (image != null)
	        g.drawImage(image, 0, 0, null);
	}
	
}
