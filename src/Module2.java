public class Module2 {
    public void mathematics(){
        String math[]={"Discrete mathematics", "Calculus 1", "Calculus 2", "Linear algebra"};
        System.out.println("The textbooks available in mathematics department are following: ");

        for (int i=0; i<math.length; i++){
            System.out.println(math[i]);

        }
    }
    public void web_technologies(){
        String web[]={"HTML", "CSS", "Bootstrap", "JavaScript"};

        System.out.println("The textbooks available in web technologies department are following: ");

        for (int j=0; j< web.length; j++){

            System.out.println(web[j]);
        }
    }
    public void languages(){
        String lang[]={"English", "German", "Chinese"};
        System.out.println("The textbooks available in languages department are following: ");

        for (int k=0; k< lang.length; k++){

            System.out.println(lang[k]);
        }
    }
}
