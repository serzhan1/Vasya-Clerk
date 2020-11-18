public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        int cost25 =0, cost50=0, cost100 = 0;
        for(int i = 0; i < peopleInLine.length; i++)
        {
            if(peopleInLine[i] == 25)
                cost25++;
            else if(peopleInLine[i] == 50)
            {
                if(cost25 > 0){
                    cost25--;
                    cost50++;}
                else
                    return "NO";
            }
            else if(peopleInLine[i] == 100)
            {
                if(cost25 > 0 && cost50 > 0)
                {
                    cost25--;
                    cost50--;
                }
                else if(cost25 > 2){
                    cost25 = cost25 - 3;
                }
                else
                    return "NO";
            }
        }
        return "YES";
    }
}