package fi.jasoft.dragdroplayouts.demo;

import com.vaadin.event.dd.DragAndDropEvent;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.event.dd.acceptcriteria.AcceptAll;
import com.vaadin.event.dd.acceptcriteria.AcceptCriterion;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Button.ClickEvent;

import fi.jasoft.dragdroplayouts.DDCssLayout;
import fi.jasoft.dragdroplayouts.client.ui.LayoutDragMode;

public class DragdropCssLayoutDemo extends CustomComponent implements
DragdropDemo {

	public DragdropCssLayoutDemo() {
		 setCaption("Css Layout");
	     setSizeFull();
	     
	     DDCssLayout cssLayout = new DDCssLayout();
	     cssLayout.setSizeFull();
	     setCompositionRoot(cssLayout);
	     
	     // Enable dragging
	     cssLayout.setDragMode(LayoutDragMode.CLONE);
	     
	     // Enable dropping
	     cssLayout.setDropHandler(new DropHandler() {
			public AcceptCriterion getAcceptCriterion() {
				return AcceptAll.get();
			}
			
			public void drop(DragAndDropEvent event) {
				System.out.println("Drop!");
			}
		});
	     
	     // Add some components
        Label lbl = new Label(
                "This is an CSS layout, the positions are defined by css rules. Try dragging the components around.");
        cssLayout.addComponent(lbl);
        Button btn = new Button("Button 1", new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                getApplication().getMainWindow().showNotification("Click!");
            }
        });
        cssLayout.addComponent(btn);
        btn = new Button("Button 2", new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                getApplication().getMainWindow().showNotification("Click!");
            }
        });
        cssLayout.addComponent(btn);
        btn = new Button("Button 3", new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                getApplication().getMainWindow().showNotification("Click!");
            }
        });
        cssLayout.addComponent(btn);
      
	}
	
	
	public String getCodePath() {
		// TODO Auto-generated method stub
		return null;
	}

}