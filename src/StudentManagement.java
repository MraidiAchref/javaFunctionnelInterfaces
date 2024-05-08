import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management{
    @Override
    public void displayEtudiants(List<Etudiant> Etudiants, Consumer<Etudiant> con) {
        for (Etudiant etudiant : Etudiants) {
            consumer.accept(etudiant) ;
        }
    }

    @Override
    public void displayEtudiantsByFilter(List<Etudiant> Etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {

    }

    @Override
    public String returnEtudiantsNames(List<Etudiant> Etudiants, Function<Etudiant, String> fun) {
        return null;
    }

    @Override
    public Etudiant createEtudiant(Supplier<Etudiant> sup) {
        return null;
    }

    @Override
    public List<Etudiant> sortEtudiantsById(List<Etudiant> Etudiants, Comparator<Etudiant> com) {
        return null;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> Etudiants) {
        return null;
    }
}
