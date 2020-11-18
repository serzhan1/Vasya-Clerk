public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        int bill25 =0, bill50=0, bill100 = 0;
        for(int i = 0; i < peopleInLine.length; i++)
        {
            if(peopleInLine[i] == 25)
                bill25++;
            else if(peopleInLine[i] == 50)
            {
                if(bill25 > 0){
                    bill25--;
                    bill50++;}
                else
                    return "NO";
            }
            else if(peopleInLine[i] == 100)
            {
                if(bill25 > 0 && bill50 > 0)
                {
                    bill25--;
                    bill50--;
                }
                else if(bill25 > 2){
                    bill25 = bill25 - 3;
                }
                else
                    return "NO";
            }
        }
        return "YES";
    }
}