
public class Menu {
    
    private String name;
    
    public Menu(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void printMenu() {
        if(name.equals("breakfast")||name.equals("1")) {
            System.out.println("Eggs, Bacon, Toast, Coffee");
        } else if(name.equals("lunch") || name.equals("2")) {
            System.out.println("Sandwich, Soup, Salad, Water");
        } else if(name.equals("dinner") || name.equals("3")) {
            System.out.println("Steak, Potatoes, Salad, Wine");
        } else {
            System.out.println("Unknown");
        }
    }
}

