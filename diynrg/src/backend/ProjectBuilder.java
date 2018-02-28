package backend;

/**
 * A project creator class  - should be implemented in UI !!!
 * 
 * @author Main Machine
 */
public class ProjectBuilder {

	public Project startProject() {
		Project myProject = new Project("Project Test");
		myProject.addItem(new LED(2));
		myProject.addItem(new CFL(3));
		myProject.addItem(new Thermal(3,25));
		myProject.addItem(new SprayFoam(1,25));
		myProject.addItem(new MineralWool(1,25));
		return myProject;
		
	}

}