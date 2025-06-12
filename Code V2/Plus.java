/**This is a class for the buttons used to add habits and tasks
 */
//Plus buttons inherit from the Button class
 public class Plus implements Button{
   private String screenName;
   public void Redirect(int screenId){
    switch (screenId) {
        case 1:
            screenName="ADDHABIT";
            break;
        case 2:
            screenName="ADDTASK";
            break;
        case 3:
            screenName="ADDBADHABIT";
            break;
        default:
            screenName= " ";
            break;
    }
   }

   public String Send(){
    return screenName;
   }
 }