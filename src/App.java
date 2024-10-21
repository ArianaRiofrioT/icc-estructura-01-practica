import controllers.Controller;
import controllers.SearchMethods;
import controllers.SortingMethods;
import views.View;

public class App {
    public static void main(String[] args) {
        // Crear las instancias de View, SortingMethods y SearchMethods
        View view = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        // Crear el controlador con las instancias anteriores
        Controller controller = new Controller(view, sortingMethods, searchMethods);

        // Iniciar la aplicación
        controller.start();
    }
}
