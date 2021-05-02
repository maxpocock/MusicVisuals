package ie.tudublin;

import C19323561.Project;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Project());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}