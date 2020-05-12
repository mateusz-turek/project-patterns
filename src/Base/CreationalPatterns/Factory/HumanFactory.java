package Base.CreationalPatterns.Factory;

public class HumanFactory {

    public Human makeHuman(String declaration){
        Human human = null;
        if (declaration!=null && (declaration.equals("Tom") || declaration.equals("Kate") )) {

            if (declaration.equals("Tom")) {
                human = new Tom();
            }
            if (declaration.equals("Kate")) {
                human = new Kate();
            }
        }
            return human;
    }

}
