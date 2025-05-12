package DependencyInjection.Constructor;

public class DependenciaDeConstructor {

    //Se refiera a la inyección de dependencia a través del constructor de una clase
    private MovieFinder movieFinder;

    public DependenciaDeConstructor(MovieFinder movieFinder){
        this.movieFinder = movieFinder;
    }

    //Example
    public class MovieFinder{
        //Logic
    }
}
