
// Packages must match the folder structure
package ie.tudublin;

public class Main
{

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound1());
    }

	public static void main(String[] args)
	{
		
		Main m = new Main();

		m.helloProcessing();
	}
	
}