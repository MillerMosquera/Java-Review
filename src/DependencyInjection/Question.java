package DependencyInjection;


public class Question {
    //Sin inyección de dependencia
    private Answer answer;

    public Question(){
        answer = new Answer();
    }
    //Con inyección de dependencia
    public void Question2(Answer ans){
        this.answer = answer;
    }
    //Existen 3 tipos de dependencia, de constructor, setter, interface


    //Metodo Answer para prueba
    public class Answer {
    }

}
