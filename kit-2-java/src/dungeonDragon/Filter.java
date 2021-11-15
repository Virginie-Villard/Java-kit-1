package dungeonDragon;

public class Filter {

	private String filterName;
	private int filterDefenseLvl;

	public Filter() {
		this("Undefined shield");
	}
	
	public Filter(String filterName) {
		this(filterName, 2);
	}
	
	public Filter(String filterName, int filterDefenseLvl) {
		this.setFilterName(filterName);
		this.setFilterDefenseLvl(filterDefenseLvl);
	}
	
	/** Utilisation de la méthode toString() pour mettre en forme l'objet Filter dans la console
	 * après que l'utilisateur ait choisi les champs string et tiré au sort les champs int.
	 */
	public String toString() {
		return ("\nHis filter name is : " + this.filterName + "\nHis filter defense level is : " + this.filterDefenseLvl);
	}
	

	/** GETTEURS et SETTEURS ___________________________________________________________________________
	 * Pour pouvoir utiliser les attributs privates de la classe.
	 */

	private String getFilterName() {
		return filterName;
	}

	private void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	private int getFilterDefenseLvl() {
		return filterDefenseLvl;
	}

	private void setFilterDefenseLvl(int filterDefenseLvl) {
		this.filterDefenseLvl = filterDefenseLvl;
	}

}
