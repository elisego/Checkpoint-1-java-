public class Student {

    // TODO hasLegalAge
    public static boolean hasLegalAge(int age){
            if(age > 18 ){
                return true;
            }
            return false;
        } 
    
    
    // TODO getGroup
    public static char getGroup(int number){
        if (number>0){
            if (number % 2 == 0){
                return 'A';
            }
            return 'B';
            }
        return ' ';
    }

    // TODO countStudents
    public static int countStudents(String[] answer){
        int i = 0;
        int nbJava= 0;
        while (i<answer.length){
            String answer2 = answer[i].toUpperCase();
            if (answer2.equals("JAVA")){
                nbJava ++;
                i ++;
            }
    }
    return nbJava;
}



}
