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
		return myProject;
	}

}