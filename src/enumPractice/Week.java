package enumPractice;



public class Week {
    Days days;
    //public Week(Days days) {
        //this.days=days;

    public void whatToDo(){
        //switch (enum){--swith block starts
        //case --keyword enum svalue:
        //action
        switch (days) {
            case saturday:
                System.out.println("today is saturday & i am not working today");
                break;
            case friday:
            case monday:
            case tuesday:
                System.out.println("today i am going to work");
                break;
            default:
                System.out.println("today going to movies");

        }
    }
}